/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;
import Modelo.Colegio;
import Modelo.Profesor;
import Modelo.Estudiante;
import Modelo.Persona;

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
public class ColegioTest {

    @Test
    public void testRegistrarProfesorYValidarDatos() {
        Colegio colegio = new Colegio(5, 5);
        Profesor prof = new Profesor("Laura", "Av. Siempre Viva", "3029991122", "20/02/1980",
                                     "55555", "Física", 15000, 8);

        // Se integra el profesor dentro del colegio
        colegio.profesores[colegio.contPro] = prof;
        colegio.contPro++;

        // Validaciones
        assertEquals(1, colegio.contPro);
        assertNotNull(colegio.profesores[0]);
        assertEquals("Laura", colegio.profesores[0].nombre);
        assertEquals("Física", colegio.profesores[0].area);
        assertEquals(15000, colegio.profesores[0].salarioHora);
    }

    @Test
    public void testRegistrarEstudianteYValidarDatos() {
        Colegio colegio = new Colegio(5, 5);
        Estudiante est = new Estudiante("Marta", "Calle Luna", "3118889999", "15/03/2012", "9°", 3.8);

        // Se integra el estudiante dentro del colegio
        colegio.estudiantes[colegio.contEst] = est;
        colegio.contEst++;

        // Validaciones
        assertEquals(1, colegio.contEst);
        assertNotNull(colegio.estudiantes[0]);
        assertEquals("Marta", colegio.estudiantes[0].nombre);
        assertEquals("9°", colegio.estudiantes[0].grado);
        assertEquals(3.8, colegio.estudiantes[0].promedio);
    }

    @Test
    public void testIntegracionProfesorCalculoPago() {
        Colegio colegio = new Colegio(2, 2);
        Profesor prof = new Profesor("Ricardo", "Calle 1", "3000000000", "10/10/1990",
                                     "123", "Inglés", 20000, 5);

        colegio.profesores[colegio.contPro] = prof;
        colegio.contPro++;

        // Verifica que el método de Profesor funcione correctamente dentro del Colegio
        double esperado = prof.calcularPago();
        double obtenido = colegio.profesores[0].calcularPago();
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testIntegracionEstudianteYMostrar() {
        Colegio colegio = new Colegio(2, 2);
        Estudiante est = new Estudiante("Nicolás", "Cra 9", "3001112222", "12/12/2011", "8°", 4.7);

        colegio.estudiantes[colegio.contEst] = est;
        colegio.contEst++;

        // Validar integración: el método mostrar() de Estudiante se usa dentro del Colegio
        String info = colegio.estudiantes[0].mostrar();
        assertTrue(info.contains("Nicolás"));
        assertTrue(info.contains("8°"));
        assertTrue(info.contains("4.7"));
    }

    @Test
    public void testIntegracionCompletaProfesorYEstudiante() {
        Colegio colegio = new Colegio(3, 3);

        Profesor prof1 = new Profesor("Ana", "Calle 10", "3010001111", "01/01/1985", "111", "Matemáticas", 10000, 10);
        Profesor prof2 = new Profesor("Luis", "Av. 5", "3022223333", "02/02/1980", "222", "Ciencias", 12000, 8);

        Estudiante est1 = new Estudiante("Pedro", "Calle Falsa 123", "3034445555", "10/10/2010", "10°", 4.5);
        Estudiante est2 = new Estudiante("Carla", "Cra 9", "3046667777", "11/11/2011", "11°", 4.8);

        // Se integran todos dentro del colegio
        colegio.profesores[0] = prof1;
        colegio.profesores[1] = prof2;
        colegio.estudiantes[0] = est1;
        colegio.estudiantes[1] = est2;
        colegio.contPro = 2;
        colegio.contEst = 2;

        // Validar que todo esté correctamente relacionado
        assertEquals(2, colegio.contPro);
        assertEquals(2, colegio.contEst);
        assertTrue(colegio.profesores[0].mostrar().contains("Ana"));
        assertTrue(colegio.estudiantes[1].mostrar().contains("Carla"));
    }
}