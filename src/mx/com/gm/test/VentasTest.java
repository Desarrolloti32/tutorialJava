package mx.com.gm.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args){
        Producto producto1  = new Producto("Caguamas", 36.50);
        Producto producto2  = new Producto("Pantalon", 299.00);
        Producto producto3  = new Producto("Camisa", 199.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProduco(producto1);
        orden1.agregarProduco(producto2);
        orden1.agregarProduco(producto3);
        orden1.mostrarOrden();

    }
}
