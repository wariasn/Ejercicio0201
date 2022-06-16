/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Factura {
    private int codigo;
    private int cod_cliente;
    private double descuento;
    private int cantidad;
    private double total;

    public Factura(int codigo, int cod_cliente, double descuento, int cantidad, double total) {
        this.codigo = codigo;
        this.cod_cliente = cod_cliente;
        this.descuento = descuento;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Factura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", cod_cliente=" + cod_cliente + ", descuento=" + descuento + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
}
