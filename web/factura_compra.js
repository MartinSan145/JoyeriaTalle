function nuevo () {
    $("#cboproducto").removeAttr("disabled").trigger("chosen:updated");
    $("#txtcantidad").removeAttr("disabled");
    $("#txtprecioc").removeAttr("disabled");
    $("#cboorden").removeAttr("disabled").trigger("chosen:updated");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#cboproveedor").removeAttr("disabled").trigger("chosen:updated");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");
    $("#cbotimbrado").removeAttr("disabled").trigger("chosen:updated");
    $("#fechaemision").removeAttr("disabled");
    $("#fecharecepcion").removeAttr("disabled");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");

    $("#operacion").val("1");
    $.post("autonumerico", {campo: "idcompra", tabla: "factura_compra"})
            .done(function (data) {
                $("#txtcodigo").val(data);

            });
}
function cancelar() {
    $("#txtcodigo").val("");
    $("#fechaemision").val("");
    $("#txtprecioc").val("");
    $("#txtcantidad").val("");
    $("#fecharecepcion").val("");


    $("#cboproducto").attr("disabled", "true").trigger("chosen:updated");
    $("#cbousuario").attr("disabled", "true").trigger("chosen:updated");
    $("#cboorden").attr("disabled", "true").trigger("chosen:updated");
    $("#cboestado").attr("disabled", "true").trigger("chosen:updated");
    $("#cboproveedor").attr("disabled", "true").trigger("chosen:updated");
    $("#cbotimbrado").attr("disabled", "true").trigger("chosen:updated");
    $("#txtcantidad").attr("disabled", "true");
    $("#fecharecepcion").attr("disabled", "true");
    $("#fechaemision").attr("disabled", "true");
    $("#txtprecioc").attr("disabled", "true");

    $("#grilla tbody").html("");

    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");

}
function guardaar() {
     var estado = $.trim($("#cboestado").val());
    var codigo = $.trim($("#txtcodigo").val());

    if (estado === "" || codigo === "") {
        alertify.alert('DEBE LLENAR TODOS LOS CAMPOS');

    } else {
        var sql = "";
        var men = "";
        var confirmar = "";
        var sqlfinal = "";

        if ($("#operacion").val() === "1") {
            sql = "insert into factura_compra values(" + $("#txtcodigo").val() + ", ('" + $("#fechaemision").val()+ "'), '" + ", ('" + $("#fecharecepcion").val()+ "'), '"  + $("#cboestado").val() + "', '" + $("#cboorden").val() + "', '"  + $("#cboproveedor").val() + "', '"  + $("#cbotimbrado").val() + ",'" + $("#cbousuario").val() + "');";
            confirmar = "DESEA GUARDARLO?";
            men = "FUE REGISTRADA CON EXITO";
            
        }
            if ($("#operacion").val() === "1") {
            sql = "UPDATE orden_compra set estado='PROCESADO' where idordencompra = '" + $("#cboorden").val() +"';"
            console.log(sql);
        }
    }
    
 alertify.confirm(confirmar, function (e) {
            if (e) {
                sqlfinal = sqlfinal + sql;

                $("#grilla tbody tr").each(function (fila) {
                    var codigo = $("#txtcodigo").val();
                 //   var proveedor = "";
                    var mercod = "";
                    var cantidad = "";
                    var precio = "";
                    $(this).children("td").each(function (columna) {
                        if (columna === 0) {
                            mercod = $(this).text();
                        }
                        if (columna === 2) {
                            cantidad = $(this).text();
                        }
                       if (columna === 3) {
                            precio = $(this).text();
                        }
                        
                    });
                    if ($("#operacion").val() === "1") {
                        var sqldet = "insert into facturacompra_detalle values("  + codigo + "," + mercod + "," + cantidad + "," + precio + ");";
                        //alertify.alert(sqldet);
                        sqlfinal = sqlfinal + sqldet;   
                    }
                

                });
                alertify.alert(sqlfinal);
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

function get_detallescompra(filtro) {
    var sql = "select * from ordendetalle_compra where idordencompra = " + filtro + " order by idordencompra";
    $.post("detalle_facturacompra", {sql: sql})
            .done(function (data) {
                console.log(data);
                $("#grillaDetalle tbody").html(data);
                //calcularTotales();
            });
}

function selectorden() {
    var id = $('#cboorden').val();
    console.log(id);
    get_detallescompra(id);
    
}
function selectproductoorden(){
    var datos = $('#cboproducto').val();
    var separado = datos.split('-');
    $('#txtprecioc').val(separado[1]);
    
}
function eliminarFilas(contenedor) {
    $(contenedor).remove();
    calcularTotales();
}

function calcularTotales() {

    var precio = 0;
    var g10 = 0;

    $("#grillaDetalle tbody tr").each(function (fila) {
        $(this).children("td").each(function (col) {
             if (col === 4) {
                var datos = $(this).text();
                var separar = datos.split(" ");
                var pre = separar[1].split(".").join("");
                
                precio = precio+ parseInt(pre);
                console.log(parseInt(precio));
            }
            
            if (col === 5) {
                var datos = $(this).text();
                var separar = datos.split(" ");
                var iva = separar[1].split(".").join("");
                
                g10 = g10+ parseInt(iva);
                console.log(parseInt(g10));
            }
           
        });
    });



    var totales = "";

    totales += "<tr>";
    totales += "<th colspan=\"5\">TOTAL DE IVA</th>";
    totales += "<th>" + "Gs. "  + g10 + "</th>";
    totales += "<th></th>";
    totales += "</tr>";

    totales += "<tr class=\"danger\">";
    totales += "<th colspan=\"6\"><h4>TOTAL GENERAL</h4></th>";
    totales += "<th><h4>" + "Gs. " + (precio+g10) + "</h4></th>";
    totales += "<th><h4></h4></th>";
    totales += "</tr>";

    $("#grillaDetalle tfoot").html(totales);
}

$(function () {

    $("chosen-select").chosen({width: "100%"});
    selectproductoorden();
    
    $("#txtcantidad").keypress(function (evt) {
        if (evt.which === 13) {
            //alertify.alert("pulsó enter");
            var codigo = $("#cboproducto").val();
            var descri = $("#cboproducto option:selected").html();
            var cantidad = $("#txtcantidad").val();
            var repetido = false;
            var cod = "";

            $("#grillaDetalle tbody tr").each(function (fila) {
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
                alertify.alert("ESTA MERCADRIA YA FUE SELECCIONADA");
            } 
            else {
                if (parseInt(cantidad) > 0) {
                    var datos = $('#cboproducto').val();
                    var separado = datos.split('-');
                    var preciou = parseInt(separado[1]);
                    var gravada = 0;
                    var g10 = 0;
                    var precio = preciou * cantidad;
                    g10 = Math.round(precio/11);
                    gravada = precio-g10;
                    var nuevaFila ='<tr><td>' + separado[0] + '</td><td>' + 
                        descri + '</td><td>' + cantidad + '</td><td>' + preciou 
                        + '</td><td>Gs. ' + gravada 
                        + '</td> <td>Gs. '+g10 +'</td><td onclick="eliminarFilas($(this).parent());">Eliminar</td></tr>';
                    $("#grillaDetalle > tbody:last").append(nuevaFila);
                 
                    calcularTotales();
                } else {
                    alertify.alert("LA CANTIDAD DEBE SER MAYOR A CERO");
                }
            }
            //alertify.alert(descri);
        }
    });
});
