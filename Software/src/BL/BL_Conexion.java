/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DAT.DAT_Conexion;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class BL_Conexion {
    DAT_Conexion ManejadorConexion = new DAT_Conexion();
    public void CerrarConexion() throws SQLException
    {
        ManejadorConexion.CerrarConexion();
    }    
}
