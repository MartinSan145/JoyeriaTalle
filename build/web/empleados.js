function Nuevo() {
    $("#txtnombre").removeAttr("disabled");
     $("#txtnombre").select();
    $("#txtcedula").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#txtapellido").removeAttr("disabled");


    $("#cbociudades").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocargo").removeAttr("disabled").trigger("chosen:updated");

    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idempleado", tabla: "empleado"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtnombre").removeAttr("disabled");
    $("#txtapellido").removeAttr("disabled");
    $("#txtcedula").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");
    $("#txtnombre").select();
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
            sql = "delete from empleado where idempleado = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE EMPLEADO?";
            men = "ESTE EMPLEADO FUE ELIMINADO CON EXITO";
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
    $("#txtnombre").val("");
    $("#txtcedula").val("");
    $("#txtdireccion").val("");
    $("#txtapellido").val("");
    $("#txtnombre").attr("disabled", "true");
    $("#txtapellido").attr("disabled", "true");
    $("#txtcedula").attr("disabled", "true");
    $("#txtdireccion").attr("disabled", "true");
    $("#cbocargo").attr("disabled", "true");
    $("#cbociudades").attr("disabled", "true");
    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
      cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtnombre").val()); 
     var b = $.trim($("#txtapellido").val()); 
     var c = $.trim($("#txtcedula").val()); 
     var d = $.trim($("#txtdireccion").val()); 

    
    if (  a === "" || b === "" || c === "" || d === "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
            sql = "insert into empleado values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtnombre").val() + "'), '" +$("#txtapellido").val()+ "', '" +$("#txtcedula").val()+ "', '" +$("#txtdireccion").val() + "', '" +$("#cbociudades").val()+ "', '" +$("#cbocargo").val()+"')";
           alertify.alert(sql);
            conf = "¿DESEA GRABAR EL NUEVO EMPLEADO?";
            men = "EL NUEVO EMPLEADO FUE REGISTRADO CON EXITO";
        }
        if ($("#operacion").val() === "2") {
            sql = "update empleado set nombre = '" + $("#txtnombre").val() + "', apellido = '"+$("#txtapellido").val()+ "', cedula = '"+$("#txtcedula").val() +"', direccion = '"+$("#txtdireccion").val()+"', idciudad = "+$("#cbociudad").val() +"',  idcargo = '"+ $("#cbocargo").val() +"' where idempleado = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE EMPLEADO?";
            men = "EL EMPLEADO FUE MODIFICADO CON EXITO";
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
    var sql = "select * from verempleados where nombre||apellido||cedula||direccion ilike '%"+filtro+"%' order by idempleado";
    $.post("get_empleados", {sql: sql})
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
                    $("#txtnombre").val($(this).text());
                }
                if(index === 2){
                    $("#txtapellido").val($(this).text());
                }
                if(index === 3){
                    $("#txtcedula").val($(this).text());
                }
                if(index === 4){
                    $("#txtdireccion").val($(this).text());
                }
                if(index === 5){
                    //alertify.alert($(this).text());
                    $("#cbocargo").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index ===7){
                    //alertify.alert($(this).text());
                    $("#cbociudad").val(parseInt($(this).text())).trigger("chosen:updated");
                }
            });
}

$(function () {
    cargar_tabla("");
});