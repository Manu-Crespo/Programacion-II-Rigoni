public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito #" + numeroTarjeta);
        System.out.println("Monto: " + monto + " dolares");
    }

    @Override
    public void aplicarDescuento(double porcentaje, double monto) {
        System.out.println("Aplicando descuento del " + porcentaje + "% a la tarjeta de crédito #" + numeroTarjeta);
        System.out.println("Monto final: " + (monto-(monto*(porcentaje/100))));
    }
}
