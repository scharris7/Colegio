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
public class PersonaTest {

    @Test
    public void testConstructorYMostrar() {
        Persona p = new Persona("Juan", "Calle 123", "3001112233", "01/01/2000");

        assertEquals("Juan", p.nombre);
        assertEquals("Calle 123", p.direccion);
        assertEquals("3001112233", p.telefono);
        assertEquals("01/01/2000", p.fechaNacimiento);

        String texto = p.mostrar();
        assertTrue(texto.contains("Juan"));
        assertTrue(texto.contains("Calle 123"));
        assertTrue(texto.contains("3001112233"));
        assertTrue(texto.contains("01/01/2000"));
    }
}
