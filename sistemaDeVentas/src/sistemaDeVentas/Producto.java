package sistemaDeVentas;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario1
 */
public class Producto {
 private String codigo;
 private String descripcion;
 private int precio;
 private int precioCompra;
 private int precioVenta;
 private int stockMinimo;
 private int stockActual;

    public Producto(String codigo, String descripcion, int precio, int precioCompra, int precioVenta, int stockMinimo, int stockActual) {
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
    }

    public Producto() {
    }

  
 
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stockMinimo=" + stockMinimo + ", stockActual=" + stockActual + '}';
    }
  
    
    
    
    
    
    
    
    
  
 
}
