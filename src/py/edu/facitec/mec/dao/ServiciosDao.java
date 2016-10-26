/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import py.edu.facitec.mec.model.Servicios;

/**
 *
 * @author user
 */
public interface ServiciosDao {
    void guardar(Servicios servicios);
    void eliminar(int codigo);
    boolean modificar(Servicios servicios);
}
