function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
        $("#txtdescripcion").select();
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true"); 
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
        $("#operacion").val("1");
      $.post("autonumerico", {campo: "idniveles", tabla: "niveles"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
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
            sql = "delete from niveles where idniveles = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE NIVEL?";
            men = "EL NIVEL FUE ELIMINADO CON EXITO";
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
    $("#txtdescripcion").attr("disabled", "true");
    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnSalir").removeAttr("disabled");
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
            sql = "insert into niveles values(" + $("#txtcodigo").val() + ",upper('" + $("#txtdescripcion").val() + "'))";
            conf = "¿DESEA GRABAR EL NUEVO NIVEL?";
            men = "EL NUEVO NIVEL FUE REGISTRADO CON EXITO";
        }
        if ($("#operacion").val() === "2") {
            sql = "update niveles set descripcion = '" + $("#txtdescripcion").val() + "' where idniveles = " + $("#txtcodigo").val();
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
    var sql = "select * from niveles where descripcion ilike '%"+filtro+"%' order by idniveles";
    $.post("get_niveles", {sql: sql})
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
            });
}

$(function () {
    cargar_tabla("");
});