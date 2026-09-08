package pe.edu.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraVentaTest {

    @Test
    void debeCalcularTotalDeVenta() {
        CalculadoraVenta calculadora = new CalculadoraVenta();

        double resultado = calculadora.calcularTotal(100, 2);

        assertEquals(200, resultado);
    }

    @Test
    void debeAplicarDescuento() {
        CalculadoraVenta calculadora = new CalculadoraVenta();

        double resultado = calculadora.aplicarDescuento(200, 10);

        assertEquals(180, resultado);
    }
}