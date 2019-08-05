$(function(){
    autonumerico();
});

function grabarclientee() {
      var rs = $.trim($("#txtnombre").val());
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
            sql = "insert into clientes values(" + $("#txtcodigocliente").val() + ",upper ('" + $("#txtnombre").val() + "'), '" +$("#txtapellido").val()+ "', '" +$("#txtcedula").val()+ "', '" +$("#txtdireccion").val()+ "', '" +$("#txttelefono").val()+ "', '" +$("#txtemail").val()+ "', '" +$("#cbociudad").val() +  "', " +$("#cbonacionalidad").val()+")";
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

function autonumerico(){
    $.post("autonumerico", {campo: "idcliente", tabla: "clientes"})
            .done(function (data) {
                $("#txtcodigocliente").val(data);
            });
}


