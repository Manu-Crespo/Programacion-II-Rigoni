public class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal asociado a " + email);
        System.out.println("Monto: " + monto + " dolares");
    }

    @Override
    public void aplicarDescuento(double porcentaje, double monto) {
        System.out.println("Aplicando descuento del " + porcentaje + "% a la cuenta de PayPal " + email);
        System.out.println("Monto final: " + (monto-(monto*(porcentaje/100))));
    }
}
