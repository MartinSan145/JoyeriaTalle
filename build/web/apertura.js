function apertura() {
$("#cbosucursal").removeAttr("disabled").trigger("chosen:updated");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#txtfechaapertura").removeAttr("disabled").trigger("chosen:updated");
    $("#txtmontoapertura").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocaja").removeAttr("disabled").trigger("chosen:updated");
    $("txtmontoapertura").select();
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true").trigger("chosen:update");
    $("#btnmodificar").attr("disabled", "true").trigger("chosen:update");
$("#operacion").val("1");
      $.post("autonumerico", {campo: "id_apertura", tabla: "apertura_cierre"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });      
}


function grabar () {
    var a = $.trim($("#txtmontoapertura").val()); 
     var b = $.trim($("#txtfechaapertura").val()); 
 


    
    if (  a === "" || b ===  "") {
        alertify.alert('Debe cargar todos los campos');
    } else {
        var sql = "";
        var men = "";
        var conf = ""; 
        if ($("#operacion").val() === "1") {
          sql = "insert into apertura_cierre(id_apertura, idsucursal, idcaja, fecha_apertura, monto_apertura, idusuario)"
+"values (" +$("#txtcodigo").val() 
                  +"," +$("#cbosucursal").val() +"," +$("#cbocaja").val() 
                  +", '" +$("#txtfechaapertura").val() +"', " +$("#txtmontoapertura").val() 
                  +", "+$("#cbousuario").val() +")";
       //  alertify.alert(sql);
            conf = "¿DESEA ABRIR LA CAJA?";
            men = "LA CAJA FUE ABIERTA EXITOSAMENTE"; 
             
             
        }
        
     alertify.confirm(conf, function (e) {
            if (e) {
               
                $.post("operaciones_bd", {sql: sql, men: men})
                        .done(function (data) {
                            alertify.alert(data)
                    window.location="pedidos_ventas.jsp";;
                            //cancelar();
                        });
            }
        });
    }
}


