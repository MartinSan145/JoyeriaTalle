

import prg.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JUAN
 */
@WebServlet(urlPatterns = {"/detalle_ordenservicio"})
public class detalle_ordenservicio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Conexion cn = new Conexion();
            try {
                cn.conectar();
                DecimalFormat format = new DecimalFormat("###,###");
                ResultSet rs = cn.consultar(request.getParameter("sql"));
                while(rs.next()){
                    
                      int preciototalservicio = rs.getInt("cantidad")*rs.getInt("preciou_servicio");
                     int preciototalrepuesto = rs.getInt("cantidad")*rs.getInt("preciou_repuesto");
                    // int iva10 = precioT/11;
                 //    int gravada = precioT-iva10;
                   int precioservicio = rs.getInt("preciou_servicio");
                     int preciorepuesto = rs.getInt("preciou_repuesto");
                     
                    out.println("<tr onclick=\"recupera_datos($(this));\">");
                    out.println("<td hidden>");
                    out.println(rs.getString("id_presupuesto"));
                    out.println("</td>");
                     out.println("<td>");
                    out.println(rs.getString("idjoyarep"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("joya"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("cantidad"));
                    out.println("</td>");
                    out.println("<td hidden>");
                    out.println(rs.getString("idservicio"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("servicio"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("preciou_servicio"));
                    out.println("</td>");
                     out.println("<td>");
                    out.println("Gs. "+format.format(preciototalservicio));
                    out.println("</td>");
                    out.println("<td hidden>");
                    out.println(rs.getString("idrepuesto"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("repuesto"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("preciou_repuesto"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println("Gs. "+format.format(preciototalrepuesto));
                    out.println("</td>");
              
                    out.println("</tr>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(detalle_ordenservicio.class.getName()).log(Level.SEVERE, null, ex);
                out.println(ex.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
