/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private String tamaño;
    private String material;

    
    public Producto(int codigo, String nombre, double precio, String tamaño, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
        this.material = material;
    }
    
    public String paisDeOrigen(String pais){
        var retorno = pais;
        return retorno;
    }
    
    public String fechaCaducidad(int año, String mes, String dia){
        var retorno = año + mes + dia;
        return retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", tama\u00f1o=" + tamaño + ", material=" + material + '}';
    }

    private static class date {

        public date() {
        }
    }
    
    
}
