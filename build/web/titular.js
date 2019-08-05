function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
    $("#txtdescripcion").select();
    $("#txtapellido").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");







    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idtitular", tabla: "titular"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#txtapellido").removeAttr("disabled");
    $("#txtdescripcion").select();

    
    
  
    
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");

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
            sql = "delete from titular where idtitular = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE REGISTRO?";
            men = "ESTE REGISTRO FUE ELIMINADO CON EXITO";
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

    $("#txtdescripcion").val("");
        $("#txtapellido").val("");
    $("#txtdireccion").val("");


   $("#txtdireccion").attr("disabled", "true");
   $("#txtdescripcion").attr("disabled", "true");
   $("#txtapellido").attr("disabled", "true");

    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtdireccion").val()); 
          var b = $.trim($("#txtdescripcion").val());
               var c = $.trim($("#txtapellido").val()); 



 


    
    if (  a === "" || b === "" || c === "" ) {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
         sql = "insert into titular values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtdescripcion").val() + "'), '" +$("#txtapellido").val()+ "', " +$("#txtdireccion").val()+")";

            //sql = "insert into titular values(" + $("#txtcodigo").val() + ", ('" + $("#txtdescripcion").val() + "'), '" +$("#txtapellido").val()+ "', " +$("#txtdireccion").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO REGISTRO?";
            men = "EL NUEVO REGISTRO FUE REGISTRADO CON EXITO";
        }
        
       if ($("#operacion").val() === "2") {
            sql = "update titular set nombre_titular = '" + $("#txtdescripcion").val() + "', apellido_titular = '"+$("#txtapellido").val()+ "', direccion = "+$("#txtdireccion").val() +" where idtitular = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE REGISTRO?";
            men = "EL REGISTRO FUE MODIFICADO CON EXITO";
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
    var sql = "select * from titular where nombre_titular ilike '%"+filtro+"%' order by idtitular";
    $.post("get_titular", {sql: sql})
            .done(function (data) {
                $("#grilla tbody").html(data);
            });
}
function recupera_datos(parent) {
    parent.find("td").each(function(index){
                if(index === 0){
                    $("#txtcodigo").val($(this).text());
                }
                  if (index === 1) {
            $("#txtdescripcion").val($.trim($(this).text()));
        }
               if(index === 2){
                    $("#txtapellido").val(parseInt($(this).text())).trigger("chosen:updated");
                }
               if(index === 3){
                    $("#txtdireccion").val(parseInt($(this).text())).trigger("chosen:updated");
                }
            });
}

$(function () {
    cargar_tabla("");
});