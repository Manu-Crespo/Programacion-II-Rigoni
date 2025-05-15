public class Main {
    public static void main(String[] args) {
        // Creacion productos
        Producto producto1 = new Producto("Laptop", 1200);
        Producto producto2 = new Producto("Mouse", 25);
        Producto producto3 = new Producto("Teclado", 75);
        Cliente cliente1 = new Cliente("Ana Pérez", "ana.perez@email.com");
        Pedido pedido1 = new Pedido(cliente1);
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        PayPal paypal = new PayPal("usuario@paypal.com");

        double montoAPagar = 100.00, descuento = 10.00;

        // Agregando productos
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);

        // Calculando el total
        double totalPedido = pedido1.calcularTotal();

        // Información del pedido y el total
        System.out.println("--- Detalles del Pedido ---");
        for (Producto producto : pedido1.getProductos()) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + " dolares");
        }
        System.out.println("---------------------------");
        System.out.println("Total a pagar del pedido: " + totalPedido + " dolares\n");

        System.out.println("--- Procesando pago con Tarjeta de Crédito ---");
        tarjeta.procesarPago(montoAPagar);
        tarjeta.aplicarDescuento(descuento, montoAPagar);

        System.out.println("\n--- Procesando pago con PayPal ---");
        paypal.procesarPago(montoAPagar);
        paypal.aplicarDescuento(descuento, montoAPagar);

        System.out.println("\nEstado inicial del pedido: " + pedido1.getEstado());

        // Cambiar el estado del pedido y verificar la notificación
        pedido1.cambiarEstado("Enviado");
        pedido1.cambiarEstado("Entregado");
        pedido1.cambiarEstado("Entregado");

    }
}