 

 function guardardetalle() {
    var a = $.trim($("#txtcantidad").val()); 
    
    if ( a === "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
         //  sql = "insert into presupuesto_servdetalle values(" + $("#txtcodigo").val() + ",upper ('" + $("#cbodiagnostico").val() + "'), '" +$("#cboservicio").val()+ "', '" +$("#cboprecioservicio").val()+ "', '" +$("#cborepuesto").val()+ "', '" +$("#cbopreciorepuesto").val()+ "', '" +$("#txtcantidad").val()+  "', " +$("#txttotal").val()+")";
          sql = "insert into presupuesto_servdetalle values(" + $("#txtcodigo").val() + "," + $("#cbodiagnostico").val() + "," +$("#cboservicio").val()+ "','" +$("#cboprecioservicio").val()+ "', '" +$("#cborepuesto").val()+ "','" +$("#cbopreciorepuesto").val()+ "',' " +$("#txtcantidad").val()+  "',' " +$("#txttotal").val()+")";
             conf = "¿DESEA GRABAR EL DETALLE?";
            men = "FUE REGISTRADO CON EXITO";
        }
       
    
    alertify.confirm(conf, function (e) {
            if (e) {
                $.post("operaciones_bd", {sql: sql, men: men})
                        .done(function (data) {
                            alertify.alert(data);
                            
                        });
            }
        });
}

 
   
   
       
        
         
    //    if ($("#operacion").val() === "1") {
   //         conf = "DESEA GUARDARLO?";
   //         men = "LA NUEVA VENTA FUE REGISTRADA CON EXITO";
                                        

       