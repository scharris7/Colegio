/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author schar
 */
public class Colegio {
    Profesor[] profesores;
    Estudiante[] estudiantes;
    int contPro = 0, contEst = 0;

    public Colegio(int numProfesores, int numEstudiantes) {
        profesores = new Profesor[numProfesores];
        estudiantes = new Estudiante[numEstudiantes];
    }

    public void registrarProfesor() {
        String nombre = JOptionPane.showInputDialog("Nombre del profesor:");
        String dir = JOptionPane.showInputDialog("Dirección:");
        String tel = JOptionPane.showInputDialog("Teléfono:");
        String fecha = JOptionPane.showInputDialog("Fecha de nacimiento:");
        String ced = JOptionPane.showInputDialog("Cédula:");
        String area = JOptionPane.showInputDialog("Área de trabajo:");
        double salHora = Double.parseDouble(JOptionPane.showInputDialog("Salario por hora:"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas dictadas en el mes:"));

        profesores[contPro] = new Profesor(nombre, dir, tel, fecha, ced, area, salHora, horas);

        int op = Integer.parseInt(JOptionPane.showInputDialog(
            "¿Desea agregar un bono extra para este profesor?\n1. Sí\n2. No"));

        if (op == 1) {
            double bono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del bono:"));
            double pagoConBono = profesores[contPro].calcularPago(bono); // aquí se usa la sobrecarga
            JOptionPane.showMessageDialog(null, "El salario total con bono es: " + pagoConBono);
        } else {
            JOptionPane.showMessageDialog(null, "El salario total sin bono es: " + profesores[contPro].calcularPago());
        }

        contPro++;
    }

    public void registrarEstudiante() {
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        String dir = JOptionPane.showInputDialog("Dirección:");
        String tel = JOptionPane.showInputDialog("Teléfono:");
        String fecha = JOptionPane.showInputDialog("Fecha de nacimiento:");
        String grado = JOptionPane.showInputDialog("Grado:");
        double prom = Double.parseDouble(JOptionPane.showInputDialog("Promedio:"));

        estudiantes[contEst] = new Estudiante(nombre, dir, tel, fecha, grado, prom);
        contEst++;
    }

    public void reporteEstudiantes() {
        if (contEst == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
            return;
        }

        String rep = "=== LISTA DE ESTUDIANTES ===\n\n";
        for (int i = 0; i < contEst; i++) {
            rep += estudiantes[i].mostrar() + "\n";
        }
        JOptionPane.showMessageDialog(null, rep);
    }

    public void reporteProfesores() {
        if (contPro == 0) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
            return;
        }

        for (int i = 0; i < contPro - 1; i++) {
            for (int j = 0; j < contPro - 1 - i; j++) {
                if (profesores[j].calcularPago() > profesores[j + 1].calcularPago()) {
                    Profesor aux = profesores[j];
                    profesores[j] = profesores[j + 1];
                    profesores[j + 1] = aux;
                }
            }
        }

        String rep = "=== LISTA DE PROFESORES ===\n\n";
        double totalPrestaciones = 0;

        for (int i = 0; i < contPro; i++) {
            rep += profesores[i].mostrar() + "\n";
            totalPrestaciones += profesores[i].calcularPrestaciones();
        }

        rep += "\nTOTAL PRESTACIONES SOCIALES: " + totalPrestaciones;
        JOptionPane.showMessageDialog(null, rep);
    }
}
