/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Mantenimientos;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author user
 */
public class MantenimientoDaoImple implements MantenimientoDao{

    @Override
    public void Guardar(Mantenimientos mantenimientos) {
 String sql="  INSERT INTO public.mantenimientos"
         + "( cliente_codigo, condicion, fecha, importe_total, observacion,  situacion)"
         + " VALUES ('"+mantenimientos.getCliente_codigo()+"','"+mantenimientos.getCondicion()+"',"
         + " '"+mantenimientos.getFecha()+"','"+mantenimientos.getImporte_total()+"',"
         + " '"+mantenimientos.getObservacion()+"',"
         + " '"+mantenimientos.getSituacion()+"');";
         
       ConexionManager.conectar();
       
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       ConexionManager.desconectar();

    
    }

    

    @Override
    public void eliminar(int codigo) {
  String sql =" DELETE FROM mantenimientos WHERE codigo="+codigo+",";
        System.out.println("SQL="+ sql);
        ConexionManager.conectar();
        
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }
    ConexionManager.desconectar();
    }

    @Override
    public boolean modificar(Mantenimientos mantenimientos) {
   String sql =" UPDATE mantenimientos"
           + "SET cliente_codigo ='"+mantenimientos.getCliente_codigo()+"', ,"
           + " condicion='"+mantenimientos.getCondicion()+"', fecha='"+mantenimientos.getFecha()+"',"
           + " importe_total="+mantenimientos.getImporte_total()+","
           + "observacion='"+mantenimientos.getObservacion()+"',"
           + " situacion='"+mantenimientos.getSituacion()+"'"
           + " WHERE odigo="+mantenimientos.getCodigo()+";";

    
    boolean resultodo= false;
    ConexionManager.conectar();
    
        try {
            resultodo = ConexionManager.stm.execute(sql);
            System.out.println("Ejecutando: "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDaoImple.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);
            
        }
    
    ConexionManager.desconectar();
    return resultodo;
    }
    
    }
    
