
package prg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class Conexion {

    private static Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection cn;
    public Statement st;
    public ResultSet rs;
    private Object conexion;
    private Object statement;
      public ResultSet resultado;
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Joyeria","postgres","123456");
    }
    
    public ResultSet consultar(String sql) throws SQLException{
        st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = st.executeQuery(sql);
        return rs;
    }
    
    public void actualizar(String sql) throws SQLException{
        st = cn.createStatement();
        st.executeUpdate(sql);
    }
    
    public void desconectar() throws SQLException{
        st.close();
        cn.close();
    }
    
    public void cargatabla(String sql) {

        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al listar datos" + e);
        }
    
    /**
     *
     * @param sql
     */
    
    
    }     
   public void autonumerico (String sql) {
       try {
           st = cn.createStatement();
           rs = st.executeQuery(sql);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "error en el autonumerico");
       }
   }
   public static String autonumerico(String campo, String tabla){
        String cod = "";
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet codigo = cn.consultar("select coalesce(max("+campo+"),0)+1 as codigo from "+tabla);
            codigo.next();
            cod = codigo.getString("codigo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cod;
    }
   public ResultSet combo(String sql) throws SQLException{
        st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = st.executeQuery(sql);
        return rs;
    }
   public static String formatoFecha(java.util.Date fecha){
        String salida=null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        salida = sdf.format(fecha);
        return salida;
    }
  
}
