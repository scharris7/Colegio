/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author schar
 */
public class Persona {
    String nombre;
    String direccion;
    String telefono;
    String fechaNacimiento;

    public Persona(String nombre, String direccion, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String mostrar() {
        return "Nombre: " + nombre +
               "\nDirección: " + direccion +
               "\nTeléfono: " + telefono +
               "\nFecha de Nacimiento: " + fechaNacimiento;
    }
}
