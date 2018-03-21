/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Estudiante;
import DAT.DAT_Conexion;
import DAT.DAT_Estudiante;
import java.sql.SQLException;

/**
 *
 * @author Liz
 */
public class BL_Estudiante {

    DAT_Conexion Conexi = new DAT_Conexion();
    DAT_Estudiante ObjDATEstudiante = new DAT_Estudiante();//

    public int InsertarEstudiante(Estudiante ojbEstudiante) throws SQLException, ClassNotFoundException {
        int retorno = 0;
        //String id = String.valueOf(ojbEstudiante.getId());
        retorno = this.ObjDATEstudiante.InsertarEstudiantes(ojbEstudiante);

        this.cerrarConexion();
        return retorno;
    }

    public void cerrarConexion() throws SQLException {
        Conexi.CerrarConexion();
    }
}
