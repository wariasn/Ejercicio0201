/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Producto;

/**
 *
 * @author ASUS
 */
public interface IProductoServicio {
    public Producto crear(Producto producto);
    public Producto listar();
    public Producto modificar();
    public Producto eliminar();
    
}
