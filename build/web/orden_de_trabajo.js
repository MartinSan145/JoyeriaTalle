/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
 function agregar() {
     //alertify.alert("USTED HA PULSADO BOTON AGREGAR");
     $("#cboservicio").removeAttr("disabled").trigger("chosen:updated");
          $("#cborepuesto").removeAttr("disabled").trigger("chosen:updated");
     $("#txtpreciorepuesto").removeAttr("disabled");

    $("#txtcantidad").removeAttr("disabled");
    $("#txtprecio").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#cbopresupuesto").removeAttr("disabled").trigger("chosen:updated");
    $("#txtfecha").removeAttr("disabled");
    $("#txtobservacion").removeAttr("disabled");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");

    $("#operacion").val("1");
    $.post("autonumerico", {campo: "idorden_trabajo",   tabla: "orden_trabajo"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            
            });
    
          
           
    
          
}
function modificar() {
    //alertify.alert("USTED HA PULSADO BOTON AGREGAR");
    $("#txtcantidad").removeAttr("disabled");
    $("#txtobservacion").removeAttr("disabled");
    $("#cboservicio").removeAttr("disabled").trigger("chosen:updated");
    $("#cbopresupuesto").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnagregar").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");



}
function borrar() {
    //alertify.alert("USTED HA PULSADO BOTON AGREGAR");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("3");

}
function cancelar() {
    $("#txtcodigo").val("");
    $("#txtfecha").val("");
    $("#txtobservacion").val("");
    $("#cboservicio").val("");
    $("#txtprecio").val("");
    $("#txtcantidad").val("");
    $("#cboestado").val("");
    $("#cbopresupuesto").val("");
    $("#cbocliente").val("");
    $("#cbousuario").val("");

    




    $("#cboservicio").attr("disabled", "true").trigger("chosen:updated");
    $("#cbocliente").attr("disabled", "true").trigger("chosen:updated");
    $("#cbousuario").attr("disabled", "true").trigger("chosen:updated");
    $("#cbopresupuesto").attr("disabled", "true").trigger("chosen:updated");
    $("#cboestado").attr("disabled", "true").trigger("chosen:updated");
    $("#txtcantidad").attr("disabled", "true");
    $("#txtfecha").attr("disabled", "true");


    $("#grillaordenservicio tbody").html("");

    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    


}
function grabar() {
   
    var d = $.trim($("#txtobservacion").val());
    var c = $.trim($("#txtcodigo").val());

    if (d === "" || c === "") {
        alertify.alert('DEBE LLENAR TODOS LOS CAMPOS');
    } else {
        var sql = "";
        var sqlupdate = "";
        var men = "";
        var confirmar = "";
        var sqlfinal = "";
       
        //alertify.alert($("#operacion").val());
         
        if ($("#operacion").val() === "1") {
            alertify.alert(sql);
            sql = "insert into orden_trabajo values(" + $("#txtcodigo").val() + ",'" + $("#txtfecha").val() + "','" + $("#txtobservacion").val() + "', '" + $("#cboestado").val() + "','" + $("#cbopresupuesto").val() + "','" + $("#cbocliente").val() + "','" + $("#cbousuario").val()  + "');";
            confirmar = "DESEA CARGAR LA NUEVA ORDEN?";
            men = "LA NUEVA ORDEN FUE CARGADA CON EXITO";
        }
          if ($("#operacion").val() === "1") {
            sqlupdate = "UPDATE presupuesto_servicio set estado='PROCESADO' where id_presupuesto = '" + $("#cbopresupuesto").val() +"';"
            //console.log(sql);
        }
  }
      
         alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sql + sqlupdate; //genera insercion cabecera
                
                //inicio: genera sql insercion detalle
                var codigo = $("#txtcodigo").val();
                var idpresupuesto = $("#cbopresupuesto").val();
                
                //tomar precio
                var id = $("#total").find("h4").text();
                var separado = id.split(".");
                var id = separado[1];
                
                 var sqldet = " insert into detalle_ordentrabajo (idorden_trabajo, idservicio, total, idrepuesto)";
                     sqldet += "  SELECT "+ codigo +", idservicio, "+ id +", idrepuesto from presupuesto_detalle where id_presupuesto ="+idpresupuesto;
                 sqlfinal += sqldet;
                 //fin generar insercion de detalle
                alertify.alert(sqlfinal);
                
                $.post("operaciones_bd", {sql: sqlfinal, men: men})
                        .done(function (mensajefinal) {
                             alertify.confirm(mensajefinal, function (e) {
                                 if (e){
                                     recargarpagina();
                                     
                                 }
                             });
                        });
                        
            }
            
        });
    }
    
    
    function recargarpagina() {
    location.reload(true);
}
function get_detallepresupuesto(filtro) {
    var sql = "select * from detalleordenservicio where id_presupuesto = " + filtro + " order by id_presupuesto";
    $.post("detalle_ordenservicio", {sql: sql})
            .done(function (data) {
                $("#grillaordenservicio tbody").html(data);
              calcularTotales();
            });
}
function selectpresupuesto() {
    var id = $('#cbopresupuesto').val();
    console.log(id);
    get_detallepresupuesto(id);
    
}

function calcularTotales() {

    var precioservicio = 0;
    var preciorepuesto = 0;

      $("#grillaordenservicio tbody tr").each(function (fila) {
        $(this).children("td").each(function (col) {
            if(col === 7){
                 var datos = $(this).text();
                var separar = datos.split(" ");
                var pre = separar[1].split(".").join("");
                
                precioservicio = precioservicio+ parseInt(pre);
                console.log(parseInt(precioservicio));
              //  console.log($(this).text());
            }
            if(col ===11) {
           
              var datos = $(this).text();
                var separar = datos.split(" ");
                var prer = separar[1].split(".").join("");
                
                preciorepuesto = preciorepuesto+ parseInt(prer);
                console.log(parseInt(preciorepuesto));
               //console.log(parseInt(preciorepuesto));
                
                console.log($(this).text());
               
            }
        });
    });




  var totales = "<tr class=\"danger\">";
    totales += "<th colspan=\"2\">SUB TOTAL SERVICIOS</th>";
    totales += "<th>" + "Gs." + +precioservicio+"</th>";
   totales += "<th></th>";
  //  totales += "</tr>";

 // totales += 
  totales += "<th colspan=\"2\">SUB TOTAL REPUESTOS</th>";
    totales += "<th>" + "Gs." + +preciorepuesto+"</th>";
    totales += "<th></th>";
    totales += "</tr>";

    totales += "<tr class=\"danger\">";
    totales += "<th colspan=\"9\"><h4>TOTAL GENERAL</h4></th>";
    totales += "<th id =\"total\"><h4>" + "Gs." + (precioservicio+preciorepuesto) + "</h4></th>";
    totales += "<th><h4></h4></th>";
    totales += "</tr>";

    $("#grillaordenservicio tfoot").html(totales);
}

 
 function sumacampos() {
     var datos = $('#txtpreciov').val() + $('#txtpreciorepuesto').val(); 
  //   var campo2 = $('#txtpreciorepuesto').val(); 
   //  var suma = campo1 + campo2;
      var separado = datos.split('-');
      $('#txtcantidad').val(separado[1]);
 }

$(function () {
    
    selectservicio();
 $("chosen-select").chosen({width: "100%"});
   selectrepuesto();
 $("chosen-select").chosen({width: "100%"});
  
   
});
$(function () {
    get_detallepresupuesto("");
});