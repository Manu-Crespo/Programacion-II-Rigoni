import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("1", "Leche", 1.25, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Telefono Movil", 500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Remera", 20, 100, CategoriaProducto.ROPA);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.listarProductos();

        Producto p4 = new Producto("4", "Notebook", 950, 10, CategoriaProducto.ELECTRONICA);
        inventario.agregarProducto(p4);
        Producto encontrado = inventario.buscarProductoPorId("2");
        if(encontrado != null){
            encontrado.mostrarInfo();
        }
        List<Producto> categoria = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for(Producto p : categoria) p.mostrarInfo();
        inventario.eliminarProducto("3");
        inventario.listarProductos();

        Producto p5 = new Producto("5", "Aspiradora", 300, 10, CategoriaProducto.HOGAR);
        Producto p6 = new Producto("6", "Pan", 1.25, 200, CategoriaProducto.ALIMENTOS);
        Producto p7 = new Producto("7", "Zapatos", 80, 50, CategoriaProducto.ROPA);
        Producto p8 = new Producto("8", "Tablet", 320, 30, CategoriaProducto.ELECTRONICA);
        Producto p9 = new Producto("9", "Sarten", 45, 60, CategoriaProducto.HOGAR);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        System.out.println("Total stock: " + inventario.obtenerTotalStock());
        System.out.println("\nProducto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();
        System.out.println("Productos entre $100 y $300:");
        List<Producto> porPrecio = inventario.filtrarProductosPorPrecio(100, 300);
        for(Producto p : porPrecio) p.mostrarInfo();
        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }

}