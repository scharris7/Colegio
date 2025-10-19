/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author schar
 */
public class Estudiante extends Persona {
    String grado;
    double promedio;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String grado, double promedio) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.grado = grado;
        this.promedio = promedio;
    }

    @Override
    public String mostrar() {
        return "ESTUDIANTE\n" + super.mostrar() +
               "\nGrado: " + grado +
               "\nPromedio: " + promedio + "\n";
    }
}
