import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable{
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        if (!this.estado.equals(nuevoEstado)) {
            String mensaje = "Tu pedido ha cambiado de estado: " + this.estado + " -> " + nuevoEstado;
            this.estado = nuevoEstado;
            cliente.notificar(mensaje);
        } else {
            System.out.println("El pedido ya está en el estado: " + nuevoEstado);
        }
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
