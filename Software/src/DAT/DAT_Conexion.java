/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class DAT_Conexion {
    //Conectarse a la BDD
    public static Connection con;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/estudiante";
            Class.forName(driver);
            return DriverManager.getConnection(url,"root","");
    }
    
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException
    {
        con = getConnection();
        return con;
    }
    
    public void CerrarConexion() throws SQLException
    {
       con.close();
    } 
}
