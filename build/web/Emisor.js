function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
        $("#txtdireccion").removeAttr("disabled");
        $("#txtdescripcion").select();
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true"); 
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
        $("#operacion").val("1");
      $.post("autonumerico", {campo: "idemisor", tabla: "emisor"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
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
            sql = "delete from emisor where idemisor = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE EMISOR?";
            men = "EL EMISOR FUE ELIMINADO CON EXITO";
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
    $("#txtdireccion").val("");
    $("#txtdescripcion").attr("disabled", "true");
    $("#txtdireccion").attr("disabled", "true");
    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
      cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtdescripcion").val()); 
    
    if ( a === "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
         if ($("#operacion").val() === "1") {
            sql = "insert into emisor values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtdescripcion").val() + "'), " +$("#txtdireccion").val()+")";

            //            sql = "insert into emisor values(" + $("#txtcodigo").val() + ",upper('" + $("#txtdescripcion").val() + "'), " +$("#txtdireccion").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO EMISOR?";
            men = "EL NUEVA EMISOR FUE REGISTRADO CON EXITO";
        }
        if ($("#operacion").val() === "2") {
            sql = "update emisor set descrip_emisor = '" + $("#txtdescripcion").val() + "', direccion = '"+$("#txtdireccion").val() + "' where idemisor = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR?";
            men = "FUE MODIFICADA CON EXITO";
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
    var sql = "select * from emisor where descrip_emisor ilike '%"+filtro+"%' order by idemisor";
    $.post("get_emisor", {sql: sql})
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
                if(index === 2){
                    $("#txtdireccion").val($(this).text());
                }
            });
}

$(function () {
    cargar_tabla("");
});