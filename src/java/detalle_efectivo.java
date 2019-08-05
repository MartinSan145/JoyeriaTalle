

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
 * @author JUAN
 */
@WebServlet(urlPatterns = {"/detalle_efectivo"})
public class detalle_efectivo extends HttpServlet {

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
                    out.println("<tr onclick=\"seleccion($(this));\">");
                    out.println("<td>");
                    out.println(rs.getString("idcobro"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("caja"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("fecha_cobro"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("tipo_cobro"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("sucursal"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("usuario"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("montocobrado"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("montopagado"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("devolucion"));
                    out.println("</td>");
                    
                    out.println("</tr>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(detalle_efectivo.class.getName()).log(Level.SEVERE, null, ex);
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
