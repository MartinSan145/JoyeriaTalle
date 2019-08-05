function Nuevo() {
    $("#txtrazon").removeAttr("disabled");
    $("#txtrazon").select();
    $("#txtdireccion").removeAttr("disabled");
    $("#txttelefono").removeAttr("disabled");
    $("#txtruc").removeAttr("disabled");
    $("#txtemail").removeAttr("disabled");




    $("#cbociudad").removeAttr("disabled").trigger("chosen:updated");
    $("#cbonacionalidad").removeAttr("disabled").trigger("chosen:updated");


    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    
    $("#operacion").val("1");
    
    $.post("autonumerico", {campo: "idproveedor", tabla: "proveedores"})
            .done(function (data) {
                $("#txtcodigo").val(data);
            });
     
            
}
function modificar() {

    $("#txtrazon").removeAttr("disabled");
    $("#txtdireccion").removeAttr("disabled");
    $("#txttelefono").removeAttr("disabled");
    $("#txtruc").removeAttr("disabled");
    $("#txtemail").removeAttr("disabled");
    $("#btngrabar").removeAttr("disabled");
    $("#btncancelar").removeAttr("disabled");
    $("#cbociudad").removeAttr("disabled");
    $("#cbonacionalidad").removeAttr("disabled");
    $("#btnnuevo").attr("disabled", "true");
    $("#btnmodificar").attr("disabled", "true");
    $("#btnborrar").attr("disabled", "true");
    $("#btnsalir").attr("disabled", "true");
    $("#operacion").val("2");
    $("#txtrazon").select();
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
            sql = "delete from proveedores where idproveedor = " + $("#txtcodigo").val();
            conf = "¿DESEA ELIMINAR ESTE PROVEEDOR?";
            men = "ESTE PROVEEDOR FUE ELIMINADO CON EXITO";
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
    $("#txtrazon").val("");
    $("#txttelefono").val("");
    $("#txtdireccion").val("");
    $("#txtemail").val("");
    $("#txtruc").val("");
    
    
    $("#btnnuevo").removeAttr("disabled");
    $("#btnmodificar").removeAttr("disabled");
    $("#btnborrar").removeAttr("disabled");
    $("#btnsalir").removeAttr("disabled");
    
    cargar_tabla("");
}
function grabar() {
     var a = $.trim($("#txtrazon").val()); 
     var b = $.trim($("#txtdireccion").val()); 
     var c = $.trim($("#txttelefono").val()); 


    
    if (  a === "" || b === "" || c ===  "") {
        alertify.alert('Debe cargar todos los campos');
    
    } else {
        var sql = "";
        var men = "";
        var conf = "";
        if ($("#operacion").val() === "1") {
            sql = "insert into proveedores values(" + $("#txtcodigo").val() + ",upper ('" + $("#txtrazon").val() + "'), '" +$("#txtdireccion").val()+ "', '" +$("#txttelefono").val()+ "', '" +$("#txtemail").val()+ "', '" +$("#txtruc").val()+  "', '" +$("#cbonacionalidad").val() +  "', " +$("#cbociudad").val()+")";
            conf = "¿DESEA GRABAR EL NUEVO PROVEEDOR?";
            men = "EL NUEVO PROVEEDOR FUE REGISTRADO CON EXITO";
        }
        
       if ($("#operacion").val() === "2") {
            sql = "update proveedores set razon_social = '" + $("#txtrazon").val() + "', direccion = '"+$("#txtdireccion").val()+ "', telefono = '"+$("#txttelefono").val()+ "', email = '"+$("#txtemail").val()+"', ruc = '"+$("#txtruc").val() +"', idnacionalidad = '"+$("#cbonacionalidad").val() +"', idciudad = "+$("#cbociudad").val() +" where idproveedor = " + $("#txtcodigo").val();
            conf = "¿DESEA MODIFICAR ESTE PROVEEDOR?";
            men = "EL PROVEEDOR FUE MODIFICADO CON EXITO";
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
    var sql = "select * from verproveedores where razon_social||direccion||telefono ilike '%"+filtro+"%' order by idproveedor";
    $.post("get_proveedores", {sql: sql})
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
                    $("#txtrazon").val($(this).text());
                }
                if(index === 2){
                    $("#txtdireccion").val($(this).text());
                }
                if(index === 3){
                    $("#txttelefono").val($(this).text());
                }
                if(index === 4){
                    $("#txtemail").val($(this).text());
                }
                if(index === 5){
                    $("#txtruc").val(parseInt($(this).text())).trigger("chosen:update");
                }
                if(index === 6){
                    $("#cbonacionalidad").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                if(index === 8){
                    $("#cbociudad").val(parseInt($(this).text())).trigger("chosen:updated");
                }
                
              
            });
}

$(function () {
    cargar_tabla("");
});