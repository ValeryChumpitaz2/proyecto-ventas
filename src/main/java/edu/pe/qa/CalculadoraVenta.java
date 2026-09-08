package pe.edu.qa;

public class CalculadoraVenta {

    public double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public double aplicarDescuento(double total, double descuento) {
        return total - (total * descuento / 100);
    }
}