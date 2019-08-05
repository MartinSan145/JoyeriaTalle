function cierre () {
    $("#txtfechacierre").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btncierre").attr("disabled", "true").trigger("chosen:update");
$("#operacion").val("1");
     
}


function grabaar () {
    var a = $.trim($("#txtfechacierre").val()); 
     var b = $.trim($("#txtmontocierre").val()); 
 


    
    if (  a === "" || b ===  "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = ""; 
        if ($("#operacion").val() === "1") {
          sql = "UPDATE apertura_cierre SET fecha_cierre='"+$("#txtfechacierre").val() +"', monto_cierre="+$("#txtmontocierre").val()+" WHERE id_apertura="+$("#txtcodigo").val();
       //  alertify.alert(sql);
            conf = "¿DESEA CERRAR LA CAJA?";
            men="LA CAJA FUE CERRADA"; 
            
             
        }
        
     alertify.confirm(conf, function (e) {
            if (e) {
               
                $.post("operaciones_bd", {sql: sql, men: men})
                        .done(function (data) {
                           // alertify.alert(data);
                            //cancelar();
                        });
            }
        });
    }
}
