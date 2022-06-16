/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Producto;
import modelo.Factura;
import servicio.ProductoServicio;

/**
 *
 * @author ASUS
 */
public class ProductoControl {
    public ProductoServicio productoServicio = new ProductoServicio() {
        @Override
        public Producto eliminar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Producto modificar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Producto listar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Producto crear(Producto producto) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    
    public Producto crear(Producto producto) {
        var factura = new Factura();
        return producto;
    }
     public Producto eliminar() {
        return this.productoServicio.eliminar();
    }
    
    public Producto modificar() {
        return this.productoServicio.modificar();
    }
    
    public List<Producto> listar()
    {
        return (List<Producto>) this.productoServicio.listar();
    }

    public void crear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
