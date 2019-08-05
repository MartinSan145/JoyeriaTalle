/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function agregar() {
    $("#txtobservacion").removeAttr("disabled");
    $("#tgxtobservacion").select();
    $("#txtdireccion").removeAttr("disabled");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");
    $("#cboproducto").removeAttr("disabled").trigger("chosen:updated");
    $("#cboproveedor").removeAttr("disabled").trigger("chosen:updated");
    $("#txtcantidad").removeAttr("disabled");
    $("#cboempleado").removeAttr("disabled").trigger("chosen:updated");
    $("#cbosucursal").removeAttr("disabled").trigger("chosen:updated");
    $("#cbodeposito").removeAttr("disabled").trigger("chosen:updated");
    $("#txtfecha").removeAttr("disabled");

    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");

    $("#operacion").val("1");
    $.post("autonumerico", {campo: "idpedido",   tabla: "pedidoscompras"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            
            });
    
       
}

function modificar () {
        $("#txtobservacion").removeAttr("disabled");
    $("#txtcantidad").removeAttr("disabled");
    $("#cboproducto").removeAttr("disabled").trigger("chosen:updated");
    $("#cboproveedor").removeAttr("disabled").trigger("chosen:updated");
    $("#cboempleado").removeAttr("disabled").trigger("chosen:updated");
    $("#cbosucursal").removeAttr("disabled").trigger("chosen:updated");
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
            sql = "update pedidoscompras SET estado='ANULADO' where idpedido =  " + $("#txtcodigo").val();
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
    $("#cboempleado").val("");
    $("#cbosucursal").val("");
    $("#txtcantidad").val("");


    $("#txtobservacion").attr("disabled", "true");
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

function grabar() {
    var d = $.trim($("#txtobservacion").val());
    var c = $.trim($("#txtcodigo").val());
    
    if (d === "" || c === "") {
        alertify.alert('DEBE LLENAR TODOS LOS CAMPOS');
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        var sqlfinal = "";
       
        
         
        if ($("#operacion").val() === "1") {
            sql = "insert into pedidoscompras values(" + $("#txtcodigo").val() + ", ('" + $("#txtfecha").val()+ "'), '" + $("#txtobservacion").val() + "', '" + $("#cboestado").val() + "', '" + $("#cbosucursal").val() + "', "  + $("#cboempleado").val() + ",'" + $("#cbodeposito").val() + "');";
            conf = "DESEA GUARDARLO?";
            men = "EL NUEVO PEDIDO FUE REGISTRADA CON EXITO";
        }
        if ($("#operacion").val() === "2") {
            sql = "update pedidoscompras set observacion where idpedido = " + $("#txtcodigo").val();
            conf = "DESEA ANULAR LA PEDIDO";
            men = "EL PEDIDO FUE ANULADO CON EXITO";
        }
        
        
       alertify.confirm(conf, function (e) {
            if (e) {
                sqlfinal = sqlfinal + sql;

                $("#grilla tbody tr").each(function (fila) {
                    var codigo = $("#txtcodigo").val();
                 //   var proveedor = "";
                    var mercod = "";
                    var cantidad = "";
                    var proveedor = "";
                    $(this).children("td").each(function (columna) {
                        if (columna === 0) {
                            mercod = $(this).text();
                        }
                        if (columna === 2) {
                            cantidad = $(this).text();
                        }
                        if (columna === 3) {
                            proveedor = $(this).text();
                        }
                        
                    });
                    if ($("#operacion").val() === "1") {
                        var sqldet = "insert into pedidoscompra_detalle values("  + codigo + "," + mercod + "," + cantidad + "," + proveedor + ");";
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
    var sql = "select * from listapedidos where observacion ilike '%"+filtro+"%' order by idpedido";
    $.post("get_pedidosc", {sql: sql})
            .done(function (data) {
                $("#grilla2 tbody").html(data);
            });
}

function get_detalles_ven(filtro) {
    var sql = "select * from lista_pedidos where idpedido = " + filtro + " order by idproducto";
    $.post("detallepedidos", {sql: sql})
            .done(function (data) {
              $("#grilla tbody").html(data);
              
            });
    
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


function eliminarFilas(contenedor) {
    $(contenedor).remove();
    calcularTotales();
}

function selectprov(){
    var datos = $('#cboproveedor').val();
    var separado = datos.split('-');
    $('#txtproveedor').val(separado[1]);    
}
function selectproductos(){
    var datoproducto = $('#cboproducto').val();
    var separadoproducto = datoproducto.split('-');
    $('#txtproducto').val(separadoproducto[1]);
    
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
   
    selectprov();
 $("chosen-select").chosen({width: "100%"});

    get_detalles_ven($('#cboproveedor').val());
        get_detalles_ven($('#cboproducto').val());


    $("#txtcantidad").keypress(function (evt) {
        if (evt.which === 13) {
            //alertify.alert("pulsó enter");
            var pro = $("#cboproducto").val();
            var codigo = $("#cboproducto").val();
            var descri = $("#cboproducto opcion:selected").html();
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
                alertify.alert("ESTA MERCADERIA YA FUE SELECCIONADA");
            } else {
                if (parseInt(cantidad) > 0) {
                    var prov = $('#cboproveedor').val();
                    var proveedor = prov.split('-');
                    
                    var datoproducto = $('#cboproducto').val();
                    var separadoproducto = datoproducto.split('-');
                    var producto = $('#txtproducto').val();
               
                    
                 $("#grilla > tbody:last").append('<tr><td>' + separadoproducto[0] + '</td><td>' + producto + '</td><td>' + cantidad + '</td><td>' + proveedor[0] + '</td><td>' + proveedor[1] + '</td><td>' + '</td><td onclick="eliminarFilas($(this).parent());">Eliminar</td></tr>');
                 
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
