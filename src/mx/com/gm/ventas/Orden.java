package mx.com.gm.ventas;

/**
 * Titulo          : Sistema de ventas
 * Descripcion     : Clase para definir atributos de orden.
 * Compañia        : Transportes Castores de Baja California S.A de C.V - Area de Desarrollo
 * Fecha Creación  : 2021-12-14
 * Autor           : Oscar Eduardo Guerra Salcedo
 * Version         : V 1.0
 */
public class Orden {

    protected int idOrden;
    protected Producto producto[];
    protected static int contadorOrdenes;
    private int contadorProductos;
    protected static final int MAX_PRODUCTOS = 10;

    public Orden() {

        this.idOrden = ++Orden.contadorOrdenes;
        this.producto = new Producto[Orden.MAX_PRODUCTOS];
    }

//    public void agregarProduco(Producto producto) {
//
//        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
//            this.producto[this.contadorProductos++] = producto;
//        } else {
//            System.out.println("Se superó el limite de productos");
//        }
//    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.producto[i];
            total += producto.getPrecio();
        }

        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Order:" + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);

        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.producto[i]);
        }
    }

}
