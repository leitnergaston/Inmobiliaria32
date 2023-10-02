
package accesoADatos;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    // Atributos estaticos constantes
    private static final String URL = "jdbc:mariadb://localhost/"; // url de conex a la bd
    private static final String DB = ""; // nombre de la bd
    private static final String USER = "root"; // usuario de la bd
    private static final String PASS = ""; // contraseña de la bd
    private static Connection connection; // tipo connection q usan las clases Data para poder enviar sentencias sql a la bd
    
    // Constructor privado vacio
    private Conexion(){}
    
    // metodo estatico q devuelve un objeto de tipo Connection
    public static Connection getConnection(){
        
        // si es la primera vez q se llama al metodo Connection
        // procedo a cargar drivers y hacer la conexion
        if(connection == null){
            try {
                
                // Cargar los drivers de conexion   
                Class.forName("org.mariadb.jdbc.Driver");
                
                // Conexion a la base de datos
                connection = DriverManager.getConnection(URL+DB, USER, PASS);
                //JOptionPane.showMessageDialog(null, "Conectado a la base de datos correctamente.", "CONEXION EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver.", "ERROR",  JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la conexion", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Devuelve la conexion
        return connection;
    } 

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String sql, int RETURN_GENERATED_KEYS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
