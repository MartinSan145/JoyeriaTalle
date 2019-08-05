

import prg.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MARTIN
 */
@WebServlet(urlPatterns = {"/get_pedidosv"})
public class get_pedidosv extends HttpServlet {

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
                ResultSet rs = cn.consultar(request.getParameter("sql"));
                while(rs.next()){
                    out.println("<tr onclick=\"recupera_datos($(this));\">");
                    out.println("<td>");
                    out.println(rs.getString("idpedido"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("fecha"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("usuario"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("nombre"));
                    out.println("</td>");
                     out.println("<td>");
                    out.println(rs.getString("estado"));
                    out.println("</td>");
                     out.println("<td>");
                //  out.println("<input  type=\"submit\" name=\"btconfirma\" value=\"idfactura_v\" href=cobros.jsp>");
                    out.println("<a href='Imprimir.jsp?condicion=pedidoventa&nombre=pedidoventa&codigo="+rs.getString("idpedido")  +"'<button class='btn btn-lg btn-primary btn-block' type=\"submit\">IMPRIMIR</button></a>");
                    out.println("</td>");
                  
                    out.println("</tr>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(get_pedidosv.class.getName()).log(Level.SEVERE, null, ex);
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
