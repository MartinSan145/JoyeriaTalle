function Nuevo() {
    $("#txtusuario").removeAttr("disabled");
    $("#txtpass").removeAttr("disabled");
    $("#txtusuario").select();
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true"); 
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
       $("#cboempleado").removeAttr("disabled").trigger("chosen:updated");
    $("#cboniveles").removeAttr("disabled").trigger("chosen:updated");
        $("#operacion").val("1");
      $.post("autonumerico", {campo: "idusuario", tabla: "usuario"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}


function modificar() {

    $("#txtusuario").removeAttr("disabled");
    $("#txtpass").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");
    $("#txtusuario").select();
   

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
            sql = "delete from usuario where idusuario = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE USUARIO?";
            men = "ESTE USUARIO FUE ELIMINADO CON EXITO";
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
function num(e) {
    var key = window.event ? e.which : e.keyCode
    return (Key >= 48 && key <= 57)
}

function cancelar() {
    $("#txtcodigo").val("");
    $("#txtusuario").val("");
    $("#txtpass").val("");
    $("#txtusuario").attr("disabled", "true");
    $("#txtpass").attr("disabled", "true");
    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
      cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtusuario").val()); 
     var a = $.trim($("#txtpass").val());
    
    if ( a === "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
          if ($("#operacion").val() === "1") {
            sql = "insert into usuario values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtusuario").val() + "'), '" +$("#txtpass").val()+  "', '" +$("#cboempleado").val()+ "', " +$("#cboniveles").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO USUARIO?";
            men = "EL NUEVO USUARIO FUE REGISTRADO CON EXITO";
        }
       if ($("#operacion").val() === "2") {
            sql = "update usuario set usuario = '" + $("#txtusuario").val() + "', contraseña = '"+$("#txtpass").val()+ "', idempleado = '"+$("#cboempleado").val()+"', idniveles = "+$("#cboniveles").val() +" where idusuario = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE PRODUCTO?";
            men = "EL PRODUCTO FUE MODIFICADO CON EXITO";
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
    var sql = "select * from verusuario where usuario||contraseña ilike '%"+filtro+"%' order by idusuario";
    $.post("get_usuario", {sql: sql})
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
                    $("#txtusuario").val($(this).text());
                }
                if(index === 2){
                    $("#txtpass").val($(this).text());
                }
               
                if(index === 3){
                    $("#cboempleado").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                
                if(index === 5){
                    $("#cboniveles").val(parseInt($(this).text())).trigger("chosen:updated");
                }
            });
}

$(function () {
    cargar_tabla("");
});