function crearreporte() {
    var pdf = new jsPDF();
    pdf.text(20, 20, "Reporte Ciudades");
    var source = $("#contenedor_grilla")[0];
    margins = {
        top: 20,
        bottom: 60,
        left: 40,
        width: 300
    };
    pdf.fromHTML(
            source, // HTML string or DOM elem ref.
            20, 40); 
            pdf.save('Test.pdf');
            
}
