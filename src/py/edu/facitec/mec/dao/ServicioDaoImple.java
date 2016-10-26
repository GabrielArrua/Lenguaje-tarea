/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Servicios;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author user
 */
public class ServicioDaoImple implements ServiciosDao{

    private String sql;

    @Override
    public void guardar(Servicios servicios) {
      String sql =" INSERT INTO servicios(descripcion, valor_unitario, nombre, estado)"
              + "VALUES ('"+servicios.getDescripcion()+"',"
              + " '"+servicios.getValor_unitario()+"','"+servicios.getNombre()+"',"
              + ""+servicios.getEstado()+")";
               
                System.out.println("SQL="+ sql);
                ConexionManager.conectar();
                
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConexionManager.desconectar();
    }

    @Override
    public void eliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Servicios servicios) {
    
    sql = "UPDATE public.servicio "
                + "SET nombre='"+servicios.getNombre()+"', descripcion='"+servicios.getDescripcion()+"', "
                + "valor_unitario="+servicios.getValor_unitario()+", estado="+servicios.getEstado()+" "
                + "WHERE codigo="+servicios.getCodigo()+";";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.stm.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImple.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
    
    

   
  

    
    
