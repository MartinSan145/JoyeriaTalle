function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
    $("#txtprecio").removeAttr("disabled");
    $("#cboimpuesto").removeAttr("disabled").trigger("chosen:updated");
    $("#txtdescripcion").select();
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true"); 
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
        $("#operacion").val("1");
      $.post("autonumerico", {campo: "idservicio", tabla: "tipo_servicio"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function mayuscula (nombre) {
    nombre.value=nombre.value.toUpperCase();
    
}

function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
    $("#txtprecio").removeAttr("disabled");
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
            sql = "delete from tipo_servicio where idservicio = " + $("#txtcodigo").val();
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
function num(e) {
    var key = window.event ? e.which : e.keyCode
    return (Key >= 48 && key <= 57)
}

function cancelar() {
    $("#txtcodigo").val("");
    $("#txtdescripcion").val("");
    $("#txtprecio").val("");
    $("#txtdescripcion").attr("disabled", "true");
    $("#txtprecio").attr("disabled", "true");
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
     var a = $.trim($("#txtprecio").val());
    
    if ( a === "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
    if ($("#operacion").val() === "1") {
            sql = "insert into tipo_servicio values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtdescripcion").val() + "'), " +$("#txtprecio").val()+  ", " +$("#cboimpuesto").val()+")";
          
   //         sql = "insert into repuestos values(" + $("#txtcodigo").val() + ",upper('" + $("#txtdescripcion").val() + ", '" + $("#txtprecio").val(parseInt($(this).text())) + ");";
            conf = "¿DESEA GRABAR EL NUEVO REPUESTO?";
            men = "EL NUEVO REPUESTO FUE REGISTRADO CON EXITO";
            
        }
        if ($("#operacion").val() === "2") {
            sql = "update tipo_servicio set descripcion = '" + $("#txtdescripcion").val() +"', precio = '"+$("#txtprecio").val() + "' where idservicio = " + $("#txtcodigo").val();
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
    var sql = "select * from tipo_servicio where descripcion||precio ilike '%"+filtro+"%' order by idservicio";
    $.post("get_tiposervicio", {sql: sql})
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
            $("#txtprecio").val(parseInt($(this).text())).trigger("chosen:updated");
        }
            });
}

$(function () {
    cargar_tabla("");
});