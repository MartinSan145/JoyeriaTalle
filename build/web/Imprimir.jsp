

<%@page import="prg.Conexion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="javax.swing.JOptionPane"%>
<<%@ page language="java" import="java.sql.*" %>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.engine.JRException"%>
<%@page import="net.sf.jasperreports.engine.util.JRLoader"%>
<%@page import="net.sf.jasperreports.engine.util.*"%>
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="net.sf.jasperreports.engine.JRRuntimeException"%>


<%

    String condicion = request.getParameter("condicion");
    String nombre = request.getParameter("nombre");
    String codigo = request.getParameter("codigo");
    ResultSet resultado=null ;

   Conexion bd = new Conexion(); 
   bd.conectar();


%>

<%


    File Reportes = new File(application.getRealPath("/Reportes/"+nombre +".jasper"));
    if (!Reportes.exists()) {
        throw new JRRuntimeException("No se encuentra el archivo reporte.");
    } else {
        JasperReport masterReport = null;
        try {
            masterReport = (JasperReport) JRLoader.loadObject(Reportes);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            e.printStackTrace();
            System.exit(3);
        }
    }
    try {

       Statement st = bd.cn.createStatement();
       
        
        if(condicion.equals("productos")){
        resultado = st.executeQuery("SELECT * FROM verproductos");
        }
         if(condicion.equals("clientes")){
        resultado = st.executeQuery("SELECT * FROM listaclientes");
        }
          if(condicion.equals("ciudad")){
        resultado = st.executeQuery("SELECT * FROM ciudades");
        }
           if(condicion.equals("empleado")){
        resultado = st.executeQuery("SELECT * FROM verempleados");
        }
              if(condicion.equals("proveedores")){
        resultado = st.executeQuery("SELECT * FROM verproveedores");
        }
              if(condicion.equals("pedidoventa")) {
                  resultado = st.executeQuery("select * from reportepedidov where idpedido="+codigo);
              }
              if(condicion.equals("ventafactura")) {
                  resultado = st.executeQuery("select * from reportefacturav where idfactura_v="+codigo);
              }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "error de conexion" + e);
    }
    JRResultSetDataSource jrRS = new JRResultSetDataSource(resultado);
    Map masterParams = new HashMap();
    //Aqui se envia los parametros al jasper
    //masterParams.put("anho", ano);
    byte[] bytes = JasperRunManager.runReportToPdf(Reportes.getPath(), masterParams, jrRS);

    response.setContentType(
            "application/pdf");
    response.setContentLength(bytes.length);
    ServletOutputStream ouputStream = response.getOutputStream();

    ouputStream.write(bytes,
            0, bytes.length);
    ouputStream.flush();

    ouputStream.close();
    //  }
%>