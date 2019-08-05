function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
    $("#txtdescripcion").select();
    $("#txtfechav").removeAttr("disabled");
    



    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idtimbrado", tabla: "timbrado"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
    $("#txtfechav").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");
    $("#txtdescripcion").select();
}
function borrar() {

    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("3");
    
    var sql = "";
        var men = "";
        var conf = "";
     if ($("#operacion").val() === "3") {
            sql = "delete from timbrado where idtimbrado = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE TIMBRADO?";
            men = "ESTE TIMBRADO FUE ELIMINADO CON EXITO";
        }
        alertify.confirm(conf, function (e) {
            if (e) {
                $.post("operaciones_bd", {sql: sql, men: men})
                        .done(function (data) {
                            alertify.alert(data);
                            cancelar();
                        });
            }
        });
}

function cancelar() {
   $("#txtcodigo").val("");
    $("#txtdescripcion").val("");
    $("#txtfechaV").val("");
   
   $("#txtdescripcion").attr("disabled", "true");
    $("#txtfechav").attr("disabled", "true");
   $("#cboestado").attr("disabled", "true");

    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtfechav").val()); 
     var b = $.trim($("#txtdescripcion").val()); 
 


    
    if (  a === "" || b ===  "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
            sql = "insert into timbrado values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtdescripcion").val() + "'), '" +$("#txtfechav").val()+ "', " +$("#cboestado").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO TIMBRADO?";
            men = "EL NUEVO TIMBRADO FUE REGISTRADO CON EXITO";
        }
        
       if ($("#operacion").val() === "2") {
            sql = "update timbrado set descripcion = '" + $("#txtdescripcion").val() + "', fecha_venc = '"+$("#txtfechav").val()+ "', estado = "+$("#cboestado").val() +" where idtimbrado = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE TIMBRADO?";
            men = "EL TIMBRADO FUE MODIFICADO CON EXITO";
        }
        
     alertify.confirm(conf, function (e) {
            if (e) {
                $.post("operaciones_bd", {sql: sql, men: men})
                        .done(function (data) {
                            alertify.alert(data);
                            cancelar();
                        });
            }
        });
    }
}


function cargar_tabla(filtro) {
    var sql = "select * from timbrado where descripcion ilike '%"+filtro+"%' order by idtimbrado";
    $.post("get_timbrado", {sql: sql})
            .done(function (data) {
                $("#grilla tbody").html(data);
            });
}
function recupera_datos(parent) {
    parent.find("td").each(function(index){
                if(index === 0){
                    $("#txtcodigo").val($(this).text());
                }
                if(index === 1){
                    $("#txtdescripcion").val($(this).text());
                }
                 if (index === 2) {
            $("#txtfechav").val($.trim($(this).text()));
        }
                
               if(index === 3){
                    //alertify.alert($(this).text());
                    var s = $.trim($(this).text());
                    var ss = 'false';
                    
                    if(s === 'Activo'){
                        ss = 'true';
                    }
                    $("#cboestado").val(ss).trigger("chosen:updated");
                }
            });
}

$(function () {
    cargar_tabla("");
});