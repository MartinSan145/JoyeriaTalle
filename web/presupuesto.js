function nuevoo() {
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#cbodiagnostico").removeAttr("disabled").trigger("chosen:updated");
    $("#txtfecha").removeAttr("disabled");


    $("#btngrabar").removeAttr("disabled");
    $("#btnvisualizar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");

    $("#operacion").val("1");
    $.post("autonumerico", {campo: "id_presupuesto",   tabla: "presupuesto_servicio"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            
            });
}
function cancelar() {
      $("#txtcodigo").val("");
    $("#txtfecha").val("");
    $("#cbocliente").val("");
    $("#cbousuario").val("");
        $("#cbodiagnostico").val("");

    
    $("#cbousuario").attr("disabled", "true").trigger("chosen:updated");
    $("#cbocliente").attr("disabled", "true").trigger("chosen:updated");
        $("#cbodiagnostico").attr("disabled", "true").trigger("chosen:updated");


    $("#txtfecha").attr("disabled", "true");


//    $("#grilladiagnosticoo tbody").html("");

    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
      $("#btnvisualizar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");

}
function guardarr() {
    var estado = $.trim($("#cbocliente").val());
    var codigo = $.trim($("#txtcodigo").val());
 var fila =$("#grillamodal tbody").find("tr").text();
                    
      if ( fila === "") {
            alertify.alert('Debe cargar detalles');
        }
    if (  estado === "" || codigo ===  ""  ) {
        alertify.alert('Debe cargar todos los campos');
    }
       else if ( fila === "") {
            alertify.alert('Debe cargar detalles');
    
    } else {
        var sql = "";
        var sqll = "";
        var men = "";
        var confirmar = "";
        var sqlfinal = "";

        if ($("#operacion").val() === "1") {
            sql = "insert into presupuesto_servicio values(" + $("#txtcodigo").val() + ", ('" + $("#txtfecha").val()+ "'), '" + $("#cbousuario").val() + "', '" + $("#cbocliente").val() + "', '"  + $("#txtestado").val() + "','" + $("#cbodiagnostico").val()  + "');";
            confirmar = "DESEA GUARDARLO?";
            men = "EL PRESUPUESTO FUE REGISTRADO CON EXITO";
            console.log(sql);
        }
          if ($("#operacion").val() === "1") {
            sqll = "UPDATE diagnostico set estado='PROCESADO' where iddiagnostico = '" + $("#cbodiagnostico").val() +"';"
            //console.log(sql);
        }
       
    }
    
 alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sql + sqll; //genera insercion cabecera
                
                //inicio: genera sql insercion detalle
                var codigo = $("#txtcodigo").val();
                var iddiagnostico = $("#cbodiagnostico").val();
                
                //tomar precio
                var id = $("#totalPresupuesto").find("h4").text();
                var separado = id.split(".");
                var precio = separado[1];
                
                 var sqldet = " insert into presupuesto_detalle (id_presupuesto, idservicio, idrepuesto, idjoyarep, cantidad, preciou_servicio, preciou_repuesto)";
                     sqldet += "  SELECT "+ codigo +", idservicio, idrepuesto, idjoyarep, cantidad, precioservicio, preciorepuesto from diagnostico_detalle where iddiagnostico ="+iddiagnostico;
                 sqlfinal += sqldet;
                 //fin generar insercion de detalle
                alertify.alert(sqlfinal);
                
                $.post("operaciones_bd", {sql: sqlfinal, men: men})
                        .done(function (mensajefinal) {
                             alertify.confirm(mensajefinal, function (e) {
                                 if (e){
                                     recargarpagina();
                                     mantener_diagnostico();
                                 }
                             });
                        });
                        
            }
            
        });
    }
    
    
    function recargarpagina() {
    location.reload(true);
}
    
function mantener_diagnostico(filtro) {
     var sql = "select * from mantenerpresupuesto";
    $.post("tabla_diagnosticada", {sql: sql})
          .done(function (data) {
                $("#grilladiagnosticoo tbody").html(data);
                //calcularTotales();
          });
}

//function cargarmodalpresupuesto(filtro) {
  //  var sql = "select * from modalpresupuesto order by iddiagnostico";
    //$.post("tabla_presupuestada", {sql: sql})
      //      .done(function (data) {
        //        $("#grillamodal tbody").html(data);
               // calcularTotales();
          //  });
//}
function get_detallesordenrecepcion(filtro) {
    var sql = "select * from modalpresupuesto where iddiagnostico = " + filtro + " order by iddiagnostico";
    $.post("tabla_presupuestada", {sql: sql})
            .done(function (data) {
                $("#grillamodal tbody").html(data);
              calcularTotales();
            });
}
function selectdiagnostico() {
    var ide = $('#cbodiagnostico').val();
    console.log(ide);
    //cargarmodalpresupuesto(ide);
    get_detallesordenrecepcion(ide);
}

function calcularTotales() {

    var precioservicio = 0;
    var preciorepuesto = 0;

      $("#grillamodal tbody tr").each(function (fila) {
        $(this).children("td").each(function (col) {
            if(col === 7){
                precioservicio = precioservicio + parseInt($(this).text());
              
                console.log(parseInt(precioservicio));
            }
            if(col === 11) {
               preciorepuesto = preciorepuesto + parseInt($(this).text()); 
                
                console.log(parseInt(preciorepuesto));
               
            }
        });
    });




  var totales = "<tr class=\"danger\">";
    totales += "<th colspan=\"2\">SUB TOTAL SERVICIOS</th>";
    totales += "<th>"+precioservicio+"</th>";
   totales += "<th></th>";
  //  totales += "</tr>";

 // totales += 
  totales += "<th colspan=\"2\">SUB TOTAL REPUESTOS</th>";
    totales += "<th>"+preciorepuesto+"</th>";
    totales += "<th></th>";
    totales += "</tr>";

    totales += "<tr class=\"danger\">";
    totales += "<th colspan=\"9\"><h4>PRESUPUESTO GENERAL</h4></th>";
    totales += "<th id =\"totalPresupuesto\"><h4>" + "Gs." + (precioservicio+preciorepuesto) + "</h4></th>";
    totales += "<th><h4></h4></th>";
    totales += "</tr>";

    $("#grillamodal tfoot").html(totales);
}

//$(function () {
  //  mantener_diagnostico("");
//});
$(function () {
    mantener_diagnostico("");
  // get_detallesordenrecepcion("");
});

function capturarTO(){
    var id = $("#totalPresupuesto").find("h4").text();
    var separado = id.split(".");
    var precio = separado[1];
    console.log(precio);
}
