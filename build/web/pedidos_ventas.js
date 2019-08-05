/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function agregar() {
   
    $("#txtdireccion").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");
    $("#cboproducto").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    $("#txtcantidad").removeAttr("disabled");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#txtfecha").removeAttr("disabled");

    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");

    $("#operacion").val("1");
    $.post("autonumerico", {campo: "idpedido",   tabla: "pedido_venta"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            
            });
    
       
}

function modificar () {
    $("#txtcantidad").removeAttr("disabled");
    $("#cboproducto").removeAttr("disabled").trigger("chosen:updated");
    $("#cbocliente").removeAttr("disabled").trigger("chosen:updated");
    $("#cbousuario").removeAttr("disabled").trigger("chosen:updated");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");
    $("#cbodeposito").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnagregar").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");
}
function anular() {
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
            sql = "update pedido_venta SET estado='ANULADO' where idpedido =  " + $("#txtcodigo").val();
            conf = "¿DESEA ANULAR ESTE PEDIDO?";
            men = "ESTE PEDIDO FUE ELIMINADO CON EXITO";
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
    $("#txtfecha").val("");
    $("#txtobservacion").val("");
    $("#cboproducto").val("");
    $("#cboestado").val("");
    $("#cbocliente").val("");
    $("#cbousuario").val("");
    $("#txtcantidad").val("");


    $("#cboproducto").attr("disabled", "true").trigger("chosen:updated");
    $("#cboestado").attr("disabled", "true").trigger("chosen:updated");
    $("#cboempleado").attr("disabled", "true").trigger("chosen:updated");
    $("#cbodeposito").attr("disabled", "true").trigger("chosen:updated");
    $("#cboproveedor").attr("disabled", "true").trigger("chosen:updated");
    $("#cbosucursal").attr("disabled", "true").trigger("chosen:updated");
    $("#txtfecha").attr("disabled", "true");

$("#grilla tbody").html("");
    

    $("#btngrabar").attr("disabled", "true");
    $("#btncancelar").attr("disabled", "true");
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    cargar_tabla("");

}

function eliminarFilas(contenedor) {
    $(contenedor).remove();
  
}
function grabar() {
    var d = $.trim($("#txtcantidad").val());
    var c = $.trim($("#txtcodigo").val());
    
    if (d === "" || c === "") {
        alertify.alert('DEBE LLENAR TODOS LOS CAMPOS');
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        var sqlfinal = "";
       
        
         
        if ($("#operacion").val() === "1") {
            sql = "insert into pedido_venta values(" + $("#txtcodigo").val() + ", ('" + $("#txtfecha").val()+ "'), "  + $("#cbousuario").val() + ", '" + $("#cbocliente").val() + "','" + $("#cboestado").val() + "');";
            conf = "DESEA GUARDARLO?";
            men = "EL NUEVO PEDIDO FUE REGISTRADA CON EXITO";
        }
      
        
        
       alertify.confirm(conf, function (e) {
            if (e) {
                sqlfinal = sqlfinal + sql;

  
                $("#grilla tbody tr").each(function (fila) {
                    var codigo = $("#txtcodigo").val();
                  //  var depcod = $("#cbodeposito").val();
                    var mercod = "";
                    var cantidad = "";
                    var costo = $("#txtprecio")
                    $(this).children("td").each(function (columna) {
                        if (columna === 0) {
                            mercod = $(this).text();
                        }
                        
                        if (columna === 2) {
                            cantidad = $(this).text();
                        }
                        if (columna === 3) {
                            costo = $(this).text();
                        }
                    });
                    if ($("#operacion").val() === "1") {
                        var sqldet = "insert into pedidoventa_detalle values("  + codigo + "," + mercod +  "," + cantidad + "," + costo + ");";
                        //alertify.alert(sqldet);
                        sqlfinal = sqlfinal + sqldet;
                    }
                    

                });
               
               
                alertify.alert(sqlfinal);
                $.post("operaciones_bd", {sql: sqlfinal, men: men})
                        .done(function (mensajefinal) {
                            alertify.alert(mensajefinal);
                        cancelar();
                        });
            }
        });
    }
}
function cargar_tabla(filtro) {
    var sql = "select * from reportepedidov where estado='Pendiente'";
    $.post("get_pedidosv", {sql: sql})
            .done(function (data) {
                $("#grilla2 tbody").html(data);
            });
}

function get_detalles_ven(filtro) {
    var sql = "select * from venta_pedidos where idpedido = " + filtro + " order by idproducto";
    $.post("ventadetalle_pedidos", {sql: sql})
            .done(function (data) {
              $("#grilla tbody").html(data);
              
            });
    
}
function selectproductosventa(){
    var datos = $('#cboproducto').val();
    var separado = datos.split('-');
    $('#txtprecio').val(separado[1]);
    
}

function recupera_datos(parent) {
    parent.find("td").each(function(index){
                if(index === 0){
                    $("#txtcodigo").val($(this).text());
                }
                if(index === 1){
                    $("#txtfecha").val($(this).text());
                }
                if(index === 2){
                    $("#txtobservacion").val($(this).text());
                } 
                if(index === 3){
                    var s = $.trim($(this).text());
                    var ss = 'PENDIENTE';
                    
                    if(s === 'PROCESADO'){
                        ss = 'PROCESADO';
                    }
                    $("#cboestado").val(ss).trigger("chosen:updated");
                }
                if(index === 4){
                    $("#cbosucursal").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 6){
                    $("#cboempleado").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 8){
                    $("#cbodeposito").val(parseInt($(this).text())).trigger("chosen:updated");
                }
              
            });
}





function editarValorGrilla(campo){
    alertify.prompt("INGRESE VALOR", function(evt){
        if(evt){
            //alertify.alert($("#alertify-text").val());
            campo.text($("#alertify-text").val());
        }
    });
}


$(function () {
    
    selectproductosventa();
 $("chosen-select").chosen({width: "100%"});

    get_detalles_ven($('#cboproducto').val());

    $("#txtcantidad").keypress(function (evt) {
        if (evt.which === 13) {
            //alertify.alert("pulsó enter");
            var codigo = $("#cboproducto").val();
            var descri = $("#cboproducto option:selected").html();
            var cantidad = $("#txtcantidad").val();
            var repetido = false;
            var cod = "";

            $("#grilla tbody tr").each(function (fila) {
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
            } else {
                if (parseInt(cantidad) > 0) {
                    var datos = $('#cboproducto').val();
                    var separado = datos.split('-');
                    var preciou = parseInt(separado[1]);
                   
                    
                    $("#grilla > tbody:last").append('<tr><td>' + separado[0] + '</td><td>' + descri + '</td><td>' + cantidad + '</td><td>' + preciou + '</td><td>' + '</td><td onclick="eliminarFilas($(this).parent());">Eliminar</td></tr>');
                 
                } else {
                    alertify.alert("LA CANTIDAD DEBE SER MAYOR A CERO");
                }
            }
            //alertify.alert(descri);
        }
    });
});


$(function () {
    cargar_tabla("");
});
