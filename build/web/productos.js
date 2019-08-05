function Nuevo() {
    $("#txtdescripcion").removeAttr("disabled");
     $("#txtdescripcion").select();
    $("#txtpreciov").removeAttr("disabled");
    $("#txtprecioc").removeAttr("disabled");


    $("#cbotipojoya").removeAttr("disabled").trigger("chosen:updated");
    $("#cboimpuesto").removeAttr("disabled").trigger("chosen:updated");
    $("#cboestado").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idproducto", tabla: "productoss"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtdescripcion").removeAttr("disabled");
    $("#txtprecioc").removeAttr("disabled");
    $("#txtpreciov").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cbotipojoya").removeAttr("disabled");
    $("#cboimpuesto").removeAttr("disabled");
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
            sql = "delete from productoss where idproducto = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE PRODUCTO?";
            men = "ESTE PRODUCTO FUE ELIMINADO CON EXITO";
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
    $("#txtdescripcion").val("");
    $("#txtprecioc").val("");
    $("#txtpreciov").val("");
    
    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtprecioc").val()); 
     var b = $.trim($("#txtdescripcion").val()); 
     var c = $.trim($("#txtpreciov").val()); 


    
    if (  a === "" || b === "" || c ===  "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
            sql = "insert into productoss values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtdescripcion").val() + "'), '" +$("#txtprecioc").val()+ "', '" +$("#txtpreciov").val()+ "', '" +$("#cbotipojoya").val() + "', '" +$("#cboimpuesto").val()+ "', " +$("#cboestado").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO PRODUCTO?";
            men = "EL NUEVO PRODUCTO FUE REGISTRADO CON EXITO";
        }
        
       if ($("#operacion").val() === "2") {
            sql = "update productoss set descripcion = '" + $("#txtdescripcion").val() + "', precio_compra = '"+$("#txtprecioc").val()+ "', precio_venta = '"+$("#txtpreciov").val()+ "', idtipo_joya = '"+$("#cbotipojoya").val()+"', idimpuesto = "+$("#cboimpuesto").val() +" where idproducto = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE PRODUCTO?";
            men = "EL PRODUCTO FUE MODIFICADO CON EXITO";
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
}


function cargar_tabla(filtro) {
    var sql = "select * from vistaproductos where descripcion||precio_compra||precio_venta ilike '%"+filtro+"%' order by idproducto";
    $.post("get_productos", {sql: sql})
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
                    $("#txtdescripcion").val($(this).text());
                }
                if(index === 2){
                    $("#txtprecioc").val(parseInt($(this).text())).trigger("chosen:update");
                }
                if(index === 3){
                    $("#txtpreciov").val(parseInt($(this).text())).trigger("chosen:update");
                }
                if(index === 4){
                    $("#cbotipojoya").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 6){
                    $("#cboimpuesto").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                
               if(index === 8){
                    //alertify.alert($(this).text());
                    var s = $.trim($(this).text());
                    var ss = 'false';
                    
                    if(s === 'Activo'){
                        ss = 'true';
                    }
                    $("#cboestado").val(ss).trigger("chosen:updated");
                }
            });
}

$(function () {
    cargar_tabla("");
});