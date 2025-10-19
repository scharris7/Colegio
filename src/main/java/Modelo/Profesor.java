/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author schar
 */
public class Profesor extends Persona {
    String cedula;
    String area;
    double salarioHora;
    int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public double calcularPago() {
        double pagoBase = salarioHora * horasMes;
        return pagoBase + (pagoBase * 0.20);
    }

    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    public double calcularPrestaciones() {
        return calcularPago() * 0.17;
    }

    @Override
    public String mostrar() {
        return "PROFESOR\n" + super.mostrar() +
               "\nCédula: " + cedula +
               "\nÁrea: " + area +
               "\nSalario por hora: " + salarioHora +
               "\nHoras trabajadas: " + horasMes +
               "\nSalario Total: " + calcularPago() +
               "\nPrestaciones Sociales: " + calcularPrestaciones() + "\n";
    }
}
