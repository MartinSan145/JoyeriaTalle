function Nuevo() {
    $("#txtproblema").removeAttr("disabled");
   // $("#txtproblema").select();
    $("#txtcantidad").removeAttr("disabled");
    
$("#cbojoyareparar").removeAttr("disabled");
$("#cborecepcion").removeAttr("disabled");
$("#cbousuario").removeAttr("disabled");
  $("#cborepuesto").removeAttr("disabled");
    $("#cboservicio").removeAttr("disabled");
$("#cboestado").removeAttr("disabled");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "iddiagnostico", tabla: "diagnostico"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {
    $("#cborepuesto").removeAttr("disabled");
    $("#txtdescripcion").removeAttr("disabled");
    $("#txtsolucion").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled");
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
            sql = "delete from diagnostico where iddiagnostico = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE DIAGNOSTICO?";
            men = "ESTE DIAGNOSTICO FUE ELIMINADO CON EXITO";
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
    $("#txtproblema").val("");
    $("#txtcantidad").val("");
    $("#txtprecior").val("");
    $("#txtprecios").val("");
    $("#cborepuesto").val("");
    $("#cboservicio").val("");
    $("#cbojoyareparar").val("");
   
   $("#txtproblema").attr("disabled", "true");
   $("#txtcantidad").attr("disabled", "true");
   $("#txtprecios").attr("disabled", "true");
   $("#txtprecior").attr("disabled", "true");
   $("#cborepuesto").attr("disabled", "true");
   $("#cbojoyareparar").attr("disabled", "true");
   $("#cbousuario").attr("disabled", "true");
   $("#cborecepcion").attr("disabled", "true");
   $("#cboservicio").attr("disabled", "true");
    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    //cargar_tabla("");
}
function guardar() {
     var a = $.trim($("#txtproblema").val()); 
     var b = $.trim($("#txtcantidad").val()); 


    
    if (  a === "" || b ===  "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var confirmar = "";
        
        var sqlfinal = "";

        if ($("#operacion").val() === "1") {
sql = "insert into diagnostico values(" + $("#txtcodigo").val() +  ", " +$("#cborecepcion").val()+ ", '" + $("#cboestado").val() +"');";
            confirmar = "DESEA GUARDARLO?";
            men = "EL PRESUPUESTO FUE REGISTRADO CON EXITO";
           // console.log(sql);
        }
        if ($("#operacion").val() === "1") {
            sql = "UPDATE recepcion set estado='PROCESADO' where idrecepcion = '" + $("#cborecepcion").val() +"';"
          //  console.log(sql);
        }
    }
    
 alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sqlfinal + sql;

              
 $("#grilladiagnosticoo tbody tr").each(function (fila) {
                    var codigo = $("#txtcodigo").val();
                 //   var proveedor = "";
                 //var problema = $("#txtproblema").val();
                    var problema = "";
                    var precioservicio = $("#txtprecios").val();
                     var preciorepuesto = $("#txtprecior").val();
                    var joya = "";
                    var cantidad = "";
                    var servicio = "";
                    var repuesto = "";
                    $(this).children("td").each(function (columna) {
                        if (columna === 0) {
                            joya = $(this).text();
                        }
                        if (columna === 2) {
                            problema = $(this).text();
                        }
                        if (columna === 3) {
                            cantidad = $(this).text();
                        }
                        if (columna === 4) {
                            servicio = $(this).text();
                        }
                         if (columna === 6) {
                            precioservicio= $(this).text();
                        }
                         if (columna === 7) {
                            repuesto = $(this).text();
                        }
                       
                        if (columna === 9) {
                            preciorepuesto = $(this).text();
                        }
                        
                    });
                    if ($("#operacion").val() === "1") {
                        var sqldet = "insert into diagnostico_detalle values("  + codigo + ",'" + problema + "'," + cantidad + "," + servicio + "," + repuesto + "," + precioservicio + "," + preciorepuesto + "," + joya + ");";
                        //alertify.alert(sqldet);
                        sqlfinal = sqlfinal + sqldet;
                        console.log(sqldet);
                    }
              });
              
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


function get_detallesordenrecepcion(filtro) {
    var sql = "select * from joyasrecepcionadas where idrecepcion = " + filtro + " order by idrecepcion";
    $.post("get_diagnostico", {sql: sql})
            .done(function (data) {
                $("#grillamodal tbody").html(data);
              
            });
}
function selectrecepcion() {
    var id = $('#cborecepcion').val();
    console.log(id);
    get_detallesordenrecepcion(id);

}
function precioservicio(){
    var datos = $('#cboservicio').val();
    var separado = datos.split('-');
    $('#txtprecios').val(separado[1]);
   
}
function preciorepuesto(){
    var dato2 = $('#cborepuesto').val();
    var separar = dato2.split('-');
    $('#txtprecior').val(separar[1]);
   
}
function eliminarFilas(contenedor) {
    $(contenedor).remove();
}

function get_detallesdiagnostico(filtro) {
    var sql = "select * from detallediagnostico where problema = " + filtro + " order by idjoyarep";
    $.post("detalle_diagnostico", {sql: sql})
            .done(function (data) {
                $("#grilladiagnosticoo tbody").html(data);
                //calcularTotales();
            });
}

$(function () {

    $("chosen-select").chosen({width: "100%"});
 //selectproducto();
// get_detallesdiagnostico();
    $("#txtcantidad").keypress(function (evt) {
        if (evt.which === 13) {
            alertify.alert("pulsó enter");
            var codigo = $("#cboproducto").val();
            var problema = $("#txtproblema").val();
             var precioservicio = $("#txtprecios").val();
              var preciorepuesto = $("#txtprecior").val();
            var servicio = $("#cboservicio option:selected").html();
            var repuesto = $("#cborepuesto option:selected").html();
            var joya = $("#cbojoyareparar option:selected").html();
            var cantidad = $("#txtcantidad").val();
            var repetido = false;
            var cod = "";
            
       

            $("#grilladiagnosticoo tbody tr").each(function (fila) {
                $(this).children("td").each(function (col) {
                    if (col === 0) {
                        cod = $(this).text();
                    }
                });
                if (parseInt(cod) === parseInt(codigo)) {
                    repetido = true;
                }
            });

            if (repetido) {
                alertify.alert("ESTA JOYA YA FUE SELECCIONADA");
            } else {
                if (parseInt(cantidad) > 0) {
                     var datojoya = $('#cbojoyareparar').val();
                    var separadojoya = datojoya.split('-');
              var datoservicio = $('#cboservicio').val();
                    var separadoservicio = datoservicio.split('-');
                      var datorepuesto = $('#cborepuesto').val();
                    var separadorepuesto = datorepuesto.split('-');
                 //   var producto = $('#txtproducto').val();
                 $("#grilladiagnosticoo > tbody:last").append('<tr><td>' + separadojoya[0] + '</td><td>' + joya + '</td><td>' + problema +  '</td><td>' + cantidad + '</td><td>' + separadoservicio[0]  +'</td><td>' + servicio +  '</td><td>' + precioservicio + '</td><td>' + separadorepuesto[0] + '</td><td>' + repuesto + '</td><td>' +  preciorepuesto + '</td><td>' + '</td><td onclick="eliminarFilas($(this).parent());">Eliminar</td></tr>');
                 
                } else {
                    alertify.alert("LA CANTIDAD DEBE SER MAYOR A CERO");
                }
            }
            //alertify.alert(descri);
        }
    });
});


$(function () {
    get_detallesordenrecepcion("");
  //  get_detallesdiagnostico("");
});



