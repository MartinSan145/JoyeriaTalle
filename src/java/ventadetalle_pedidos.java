

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
@WebServlet(urlPatterns = {"/ventadetalle_pedidos"})
public class ventadetalle_pedidos extends HttpServlet {

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
                     int precioT = rs.getInt("cantidad")*rs.getInt("precio");
                     int iva10 = precioT/11;
                     int gravada = precioT-iva10;
                     int preciou = rs.getInt("precio");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println(rs.getString("idproducto"));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(rs.getString("descripcion"));
                    out.println("</td>");
                   
                    out.println("<td onclick=\"editarValorGrilla($(this));\">");
                    out.println(rs.getString("cantidad"));
                    out.println("</td>");
                    out.println("<td onclick=\"editarValorGrilla($(this));\">");
                    out.println(" "+format.format(preciou));
                    out.println("</td>");
                    
                    out.println("<td onclick=\"editarValorGrilla($(this));\">");
                    out.println(" "+(precioT));
                    out.println("</td>");
                    
                    
                    out.println("<td>");
                    out.println("Gs. "+format.format(iva10));
                    out.println("</td>");
           
                    
                    out.println("<td class=\"danger\" onclick=\"eliminarFilas($(this).parent());\">");
                    out.println("Eliminar");
                    out.println("</td>");
                    out.println("</tr>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ventadetalle_pedidos.class.getName()).log(Level.SEVERE, null, ex);
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
