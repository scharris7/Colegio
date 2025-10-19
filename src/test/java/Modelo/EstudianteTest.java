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
public class EstudianteTest {

    @Test
    public void testConstructorYMostrar() {
        Estudiante e = new Estudiante("Pedro", "Calle Falsa 123", "3015557788", "10/10/2010", "10°", 4.5);

        assertEquals("Pedro", e.nombre);
        assertEquals("Calle Falsa 123", e.direccion);
        assertEquals("3015557788", e.telefono);
        assertEquals("10/10/2010", e.fechaNacimiento);
        assertEquals("10°", e.grado);
        assertEquals(4.5, e.promedio);

        String texto = e.mostrar();
        assertTrue(texto.contains("Pedro"));
        assertTrue(texto.contains("10°"));
        assertTrue(texto.contains("4.5"));
    }
}