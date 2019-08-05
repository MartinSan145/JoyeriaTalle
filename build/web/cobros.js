function cargar_tabla(filtro) {
    var sql = "select * from facturascobradas where caja||nro_factura ilike '%"+filtro+"%' order by idcobro";
    $.post("get_facturascobradas", {sql: sql})
            .done(function (data) {
                $("#grilla tbody").html(data);
            });
}

$("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idcobro", tabla: "cobros"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
            $.post("autonumerico", {campo: "idcobro", tabla: "cobro_efectivo"})
            .done(function (data) {
                $("#txt").val(data);
            });
            
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
            sql = "delete from cobros where idcobro = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE COBRO?";
            men = "ESTE COBRO FUE ELIMINADO CON EXITO";
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

function cancelar() {
     //limpiar campos
    $("#txtcodigo").val("");
    $("#txtcantidad").val("");

    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
   

}
 
function iniciarcobro() {
    
        $("#cbofactura").removeAttr("disabled").trigger("chosen:updated");
    $("#txtcantidad").removeAttr("disabled");

    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
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
                    $("#txtfecha").val($(this).text());
                }
                if(index === 3){
                    $("#txtefectivo").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 4){
                    $("#cbocobro").val($(this).text());
                }
                if(index === 5){
                    $("#cbosucursal").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 6){
                    $("#txtusuario").val($(this).text());
                }
               
                
              
            });
}
function get_detallescobro(filtro) {
    var sql = "select * from detallecobros where idfactura_v = " + filtro + " order by idfactura_v";
    $.post("detalle_cobro", {sql: sql})
            .done(function (data) {
                $("#grillacobro tbody").html(data);
                calcularTotales();
            });
}
 function calcularTotales() {
    var totalgeneral = 0;
  

    $("#grillacobro tbody tr").each(function (fila) {
        $(this).children("td").each(function (col) {
            if(col === 7){
               var datos = $(this).text();
                var separar = datos.split(" ");
                var pre = separar[1].split(".").join("");
                
                totalgeneral = totalgeneral+ parseInt(pre);
                console.log(parseInt(totalgeneral));
            }

          
        });
    });
    
    
    
   var totales = "";

 totales += "<tr>";

    totales += "<tr class=\"danger\">";
    totales += "<th colspan=\"6\"><h4>TOTAL A COBRAR</h4></th>";
    totales += "<th id =\"total\"><h4>" + "Gs. " + totalgeneral  + "</h4></th>";
    totales += "<th><h4></h4></th>";
    totales += "</tr>";


    $("#grillacobro tfoot").html(totales);
}

 function validarcantidad() {
     var montopagado = $("#txtcantidad").val();
     var montoacobrar = 0;
     
      $("#grillacobro tbody tr").each(function (fila) {
        $(this).children("td").each(function (col) {
            if(col === 7){
               var datos = $(this).text();
                var separar = datos.split(" ");
                var pre = separar[1].split(".").join("");
                
                montoacobrar = montoacobrar+ parseInt(pre);
                console.log(parseInt(montoacobrar));
            }

          
        });
    });
       var devolucion = montopagado-montoacobrar;
     if (montopagado>montoacobrar) {
           alert("Devolucion:" + devolucion);
     }
     if (montopagado=montoacobrar) {
       // alertify.alert("El monto es correcto"); 
        guardarcobro();
     }
     if (montopagado<montoacobrar) {
        alertify.alert("El monto no alcanza");  
        cancelar();
     }
   
 }



function selectfactura(){
    var id = $('#cbofactura').val();
    console.log(id);
    get_detallescobro(id);
    
}


 
 function guardarcobro() {
        var men = "";
        var sql = "";
        var confirmar = "";
        var sqlfinal = "";
        var sqlupdate="";

       if ($("#operacion").val() === "1") {
            sql = "insert into cobros values(" + $("#txtcodigo").val() + "," + $("#cboapertura").val() + ", '" +$("#txtfecha").val()+ "', '" +$("#cbocobro").val()+ "', '" +$("#cbosucursal").val()+ "','" +$("#cbousuario").val()+"');";
          confirmar = "¿DESEA INICIAR EL NUEVO COBRO?";
          men = "Fue cobrado con exito";
        }
           if ($("#operacion").val() === "1") {
            sqlupdate = "UPDATE factura_venta set estado='COBRADO' where idfactura_v = '" + $("#cbofactura").val() +"';"
            //console.log(sql);
        }
 
    
    
 alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sql + sqlupdate; //genera insercion cabecera
               
                //inicio: genera sql insercion detalle
                var codigo = $("#txtcodigo").val();
                var idfactura = $("#cbofactura").val();
                
                //tomar precio
                var id = $("#total").find("h4").text();
                var separado = id.split(".");
                var id = separado[1];
                 var costo = $("#txtcantidad").val();
                  
                 var sqldet = " insert into cobro_efectivo (idcobro, idfactura_v,  monto, monto_pagado)";
                     sqldet += "  SELECT "+ codigo +", "+idfactura+", "+ id +", "+ costo +" from factura_venta where idfactura_v ="+idfactura;
                sqlfinal += sqldet;
                
                 //fin generar insercion de detalle
             //   alertify.alert(sqlfinal);
                console.log(sqlfinal);
                 
                $.post("operaciones_bd", {sql: sqlfinal, men: men})
                        .done(function (mensajefinal) {
                             alertify.confirm(mensajefinal, function (e) {
                                 if (e){
                                    ;
                                     recargarpagina();
                                     //mantener_diagnostico();
                                 }
                             });
                        });
                        
            }
            
        });
    }
    
    
      function recargarpagina() {
    location.reload(true);
}

  $(function () {
    cargar_tabla("");
    $(".chosen-select").chosen({width: "100%"});
});  
