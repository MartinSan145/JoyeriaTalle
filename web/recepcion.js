function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
    $("#txtdescripcion").select();
    $("#txtfecha").removeAttr("disabled");

    $("#cbojoyareparar").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idrecepcion", tabla: "recepcion"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtfecha").removeAttr("disabled");
    
    $("#cbojoyareparar").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");

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
            sql = "delete from recepcion where idrecepcion = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE REGISTRO?";
            men = "ESTE REGISTRO FUE ELIMINADO CON EXITO";
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

    $("#txtfecha").val("");
    $("#txtcodigo").val("");
    $("#cbojoyareparar").val("");
    $("#cbocliente").val("");



    $("#txtfecha").attr("disabled", "true");
   $("#cbocliente").attr("disabled", "true");
   $("#cbojoyareparar").attr("disabled", "true");

    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    //cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtfecha").val()); 
     var b = $.trim($("#txtcantidad").val());
     var fila =$("#grilladetalle1 tbody").find("tr").text();
                    
     if ( fila === "") {
            alertify.alert('Debe cargar detalles');
        }
    if (  a === "" || b ===  ""  ) {
        alertify.alert('Debe cargar todos los campos');
    }
       else if ( fila === "") {
            alertify.alert('Debe cargar detalles');
        
} else {
        var sql = "";
        var men = "";
        var confirmar = "";
        var sqlfinal = "";
            
        if ($("#operacion").val() === "1") {
            sql = "insert into recepcion values(" + $("#txtcodigo").val() + ", '" + $("#txtfecha").val() + "', " +$("#cbocliente").val()+");";
            confirmar = "¿DESEA GRABAR EL NUEVO REGISTRO?";
            men = "EL NUEVO REGISTRO FUE REGISTRADO CON EXITO";
            console.log(sql);
        }
        
    } 
        
      alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sqlfinal + sql;

                $("#grilladetalle1 tbody tr").each(function (fila) {
                    var codigo = $("#txtcodigo").val();
                 //   var proveedor = "";
                    var descri = $("#cbojoyareparar").val();
                    var cantidad = "";
                  //  var precio = "";
                    $(this).children("td").each(function (columna) {
                        if (columna === 0) {
                            descri = $(this).text();
                        }
                        if (columna === 2) {
                            cantidad = $(this).text();
                        }
                        
                    });
                    if ($("#operacion").val() === "1") {
                        var sqldet = "insert into recepcion_detalle values(" + codigo + "," + descri + "," + cantidad + ");"
                       // alertify.alert(sqldet);
                        sqlfinal = sqlfinal + sqldet;   
                        console.log(sqldet);
                    }
                
                
                });
                //alertify.alert(sqlfinal);
                $.post("operaciones_bd", {sql: sqlfinal, men: men})
                        .done(function (mensajefinal) {
                             alertify.confirm(mensajefinal, function (e) {
                                 if (e){
                                     recargarpagina();
                                     cancelar();
                                  }
                             });
                        });
                        
            }
            
        });
    }
function recargarpagina() {
    location.reload(true);
}
function get_detalles_recepcion(filtro) {
    var sql = "select * from joya where idjoyarep = " + filtro + " order by idjoyarep";
    $.post("detalle_recepcion", {sql: sql})
            .done(function (data) {
              $("#grilladetalle1 tbody").html(data);
              console.log(sql);
            });
    
}



function eliminarFilas(contenedor) {
    $(contenedor).remove();

}

$(function () {

     $("chosen-select").chosen({width: "100%"});

    $("#txtcantidad").keypress(function (evt) {
        if (evt.which === 13) {
            //alertify.alert("pulsó enter");
            var codigo = $("#cbojoyareparar").val();
            var descri = $("#cbojoyareparar option:selected").html();
            var cantidad = $("#txtcantidad").val();
            
            
            console.log("codigo: "+codigo+" descri: "+descri+" cantidad: "+cantidad);
            var repetido = false;
            var cod = "";

            $("#grilladetalle1 tbody tr").each(function (fila) {
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
            } 
            else {
                if (parseInt(cantidad) > 0) {
                    //var datos = $('#cbojoyareparar').val();
                    // var separado = datos.split('-');
                    var nuevaFila ='<tr><td>' + codigo + '</td><td>' + 
                        descri + '</td><td>' + cantidad + '</td><td>'  +'</td><td onclick="eliminarFilas($(this).parent());">Eliminar</td></tr>';
                    $("#grilladetalle1 > tbody:last").append(nuevaFila);
                 
                    //calcularTotales();
                } else {
                    alertify.alert("LA CANTIDAD DEBE SER MAYOR A CERO");
                }
            }
            //alertify.alert(descri);
        }
    });
});




