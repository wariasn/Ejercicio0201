/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ProductoControl;
import modelo.Producto;
import modelo.Factura;
/**
 *
 * @author ASUS
 */
public class ProductoVista {
  public static void main(String [] args){
      var productoControl = new ProductoControl();
      productoControl.crear();
  }  
}
