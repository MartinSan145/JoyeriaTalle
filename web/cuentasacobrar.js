
function get_tabla(filtro) {
    var sql = "select * from facturas_a_cobrar where caja ilike '%"+filtro+"%' order by nro_factura";
    $.post("get_cuenta", {sql: sql})
            .done(function (data) {
                $("#grilla tbody").html(data);
            });
}
$(function () {
    get_tabla("");
});


