/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author schar
 */
public class ProfesorTest {

    @Test
    public void testCalcularPagoSinBono() {
        Profesor prof = new Profesor("Ana", "Av. 10", "3205556677", "02/02/1980",
                                     "12345", "Matemáticas", 10000, 10);

        double pagoEsperado = (10000 * 10) * 1.20;
        assertEquals(pagoEsperado, prof.calcularPago(), 0.01);
    }

    @Test
    public void testCalcularPagoConBono() {
        Profesor prof = new Profesor("Carlos", "Cra 5", "3107778899", "03/03/1975",
                                     "98765", "Ciencias", 8000, 8);

        double pagoBase = (8000 * 8) * 1.20;
        double bono = 20000;
        double pagoConBono = pagoBase + bono;

        assertEquals(pagoConBono, prof.calcularPago(bono), 0.01);
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor prof = new Profesor("Sofía", "Calle 8", "3012223344", "05/05/1985",
                                     "11111", "Historia", 12000, 5);

        double esperado = prof.calcularPago() * 0.17;
        assertEquals(esperado, prof.calcularPrestaciones(), 0.01);
    }
}