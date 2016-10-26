/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author user
 */
public class Servicios {
    private int codigo;
     private String descripcion;
      private double valor_unitario;
    private String nombre;
    private Boolean estado;

    public Servicios() {
         this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor_unitario = valor_unitario;
        this.nombre = nombre;
        this.estado = estado;
      
    }

    public Servicios( String descripcion, double valor_unitario, String nombre, Boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valor_unitario = valor_unitario;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Servicios(int parseInt, String text, double parseDouble, String text0, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
        
    
}
