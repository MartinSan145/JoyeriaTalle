

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
@WebServlet(urlPatterns = {"/get_apertura"})
public class get_apertura extends HttpServlet {

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
        String accion = request.getParameter("accion");
        
        if (accion.equals("comprobar")) {
            PrintWriter out = response.getWriter();
            try {
                Conexion con = new Conexion();
                con.conectar();
                ResultSet res = con.consultar(request.getParameter("sql"));
                if (res.next()) {
                    out.print("ABIERTO");
                }else{
                    out.print("CERRADO");
                }
                
            } catch (Exception e) {
                out.print(e);
            }
        }else{
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Conexion cn = new Conexion();
            try {
                cn.conectar();
                ResultSet rs = cn.consultar(request.getParameter("sql"));
                while(rs.next()){
                    out.println("<tr onclick=\"recupera_datos($(this));\">");
                    out.println("<td>");
                    out.println(rs.getString("id_apertura"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("sucursal"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("caja"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("fecha_apertura"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("monto_apertura"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("fecha_cierre"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("monto_cierre"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("usuario"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("estado"));
                    out.println("</td>");
                    out.println("</tr>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(get_apertura.class.getName()).log(Level.SEVERE, null, ex);
                out.println(ex.getMessage());
            }
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
