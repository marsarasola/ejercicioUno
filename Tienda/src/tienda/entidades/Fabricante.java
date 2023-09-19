/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

/**
 *
 * @author saras
 */
public class Fabricante {
    private String nombre;
    private int codigo;

    public Fabricante() {
    }

    public Fabricante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Fabricante codigo(int codigo) {
        setCodigo(codigo);
        return this;
    }

    public Fabricante nombre(String nombre) {
        setNombre(nombre);
        return this;
    }
    
     @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'" + "}";
    }
    
}
