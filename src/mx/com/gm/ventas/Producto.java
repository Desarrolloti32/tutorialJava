package mx.com.gm.ventas;

/**
 * Titulo          : Sistema de ventas
 * Descripcion     : Subclase para crear productos.
 * Compañia        : Transportes Castores de Baja California S.A de C.V - Area de Desarrollo
 * Fecha Creación  : 2021-12-14
 * Autor           : Oscar Eduardo Guerra Salcedo
 * Version         : V 1.0
 */
public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadoreProductos;

    private Producto() {
        this.idProducto = ++Producto.contadoreProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idProducto=").append(this.idProducto);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", precio=").append(this.precio);
        sb.append(", ").append(super.toString()).append("}");
        sb.append("}");
        return sb.toString();
    }
    
}
