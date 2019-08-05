function Nuevo() {
    $("#txtnombre").removeAttr("disabled");
    $("#txtnombre").select();
    $("#txtapellido").removeAttr("disabled");
    $("#txtcedula").removeAttr("disabled");
    $("#txttelefono").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#txtemail").removeAttr("disabled");



    $("#cbociudad").removeAttr("disabled").trigger("chosen:updated");
    $("#cbonacionalidad").removeAttr("disabled").trigger("chosen:updated");
    


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idcliente", tabla: "clientes"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtnombre").removeAttr("disabled");
    $("#txtapellido").removeAttr("disabled");
    $("#txtcedula").removeAttr("disabled");
    $("#txttelefono").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#txtemail").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    
    $("#btncancelar").removeAttr("disabled");  
    $("#cbotipojoya").removeAttr("disabled");
    $("#cboimpuesto").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled");
    
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
            sql = "delete from clientes where idcliente = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE CLIENTE?";
            men = "ESTE CLIENTE FUE ELIMINADO CON EXITO";
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
     //limpiar campos
    $("#txtcodigo").val("");
    $("#txtnombre").val("");
    $("#txtapellido").val("");
    $("#txttelefono").val("");
    $("#txtdireccion").val("");
    $("#txtemail").val("");
    $("#txtcedula").val("");
    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    cargar_tabla("");

}
function grabarcliente() {
    var rs = $.trim($("#txtnpmbre").val());
    var rs = $.trim($("#txtapellido").val());
    var r = $.trim($("#txtcedula").val());
    var t = $.trim($("#txttelefono").val());
    var d = $.trim($("#txtdireccion").val());

    

    if (rs === "" || r === "" || t === "" || d === "") {
        alertify.alert('DEBES LLENAR TODOS LOS CAMPOS');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
            sql = "insert into clientes values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtnombre").val() + "'), '" +$("#txtapellido").val()+ "', '" +$("#txtcedula").val()+ "', '" +$("#txtdireccion").val()+ "', '" +$("#txttelefono").val()+ "', '" +$("#txtemail").val()+ "', '" +$("#cbociudad").val() +  "', " +$("#cbonacionalidad").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO CLIENTE?";
            men = "EL NUEVO CLIENTE FUE REGISTRADO CON EXITO";
        }
       if ($("#operacion").val() === "2") {
                sql = "update clientes set nombre = '" + $("#txtnombre").val() + "', apellido = '"+$("#txtapellido").val()+ "', cedula = '"+$("#txtcedula").val()+ "', direccion = '"+$("#txtdireccion").val()+ "', telefono = '"+$("#txttelefono").val()+ "', email = '"+$("#txtemail").val()+ "', idciudad = '"+$("#cbociudad").val()+"', idnacionalidad = "+$("#cbonacionalidad").val() +" where idcliente = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE CLIENTE?";
            men = "EL CLIENTE FUE MODIFICADO CON EXITO";
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
    var sql = "select * from listaclientes where nombre||apellido||cedula||direccion||telefono||email ilike '%"+filtro+"%' order by idcliente";
    $.post("get_clientes", {sql: sql})
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
                    $("#txtcedula").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 4){
                    $("#txtdireccion").val($(this).text());
                }
                if(index === 5){
                    $("#txttelefono").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 6){
                    $("#txtemail").val($(this).text());
                }
                if(index === 7){
                    //alertify.alert($(this).text());
                    $("#cbociudad").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 9){
                    $("#cbonacionalidad").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                
              
            });
}

$(function () {
    cargar_tabla("");
    $(".chosen-select").chosen({width: "100%"});
});