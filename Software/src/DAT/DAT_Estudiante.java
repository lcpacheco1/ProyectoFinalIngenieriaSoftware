/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import Clases.Estudiante;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Liz
 */
public class DAT_Estudiante {
       DAT_Conexion c = new DAT_Conexion();
      public int InsertarEstudiantes( Estudiante objEstudiante ) throws SQLException, ClassNotFoundException{
        int intRetorno=0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO estudiante VALUES (0,'"+objEstudiante.getCedula() + "','"+objEstudiante.getNombre()+"','"+objEstudiante.getApellido()+
                "','"+objEstudiante.getFNac()+"','"+objEstudiante.getGenero()+"','"+objEstudiante.getCiudad()+"','"+objEstudiante.getEmal()+
                "','"+objEstudiante.getCategoria()+"','"+objEstudiante.getCurso()+"')";
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
    }
}
