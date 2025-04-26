import java.util.ArrayList;
import java.util.List;

class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        System.out.println("Listado de productos:\n");
        for(Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for(Producto p : productos) {
            if(p.getId().equals(id))
                return p;
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if(p != null) {
            productos.remove(p);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if(p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Producto actualizado con exito");
        }
        System.out.println("Error al actualizar producto");
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Buscando productos de la categoria " + categoria);
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos) {
            if(p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for(Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if(productos.isEmpty()) return null;

        Producto mayor = productos.get(0);
        for(Producto p : productos) {
            if(p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtro = new ArrayList<>();
        for(Producto p : productos) {
            if(p.getPrecio() >= min && p.getPrecio() <= max) {
                filtro.add(p);
            }
        }
        return filtro;
    }

    public void mostrarCategoriasDisponibles() {
        for(CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.name() + " - " + categoria.getDescripcion());
        }
    }
}