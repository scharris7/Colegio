/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import Modelo.Colegio;
import javax.swing.JOptionPane;

/**
 *
 * @author schar
 */
public class VistaColegio {
    public static void main(String[] args) {
        Colegio col = new Colegio(10, 10);
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "MENÚ COLEGIO\n" +
                "1. Registrar Profesor\n" +
                "2. Registrar Estudiante\n" +
                "3. Reporte de Estudiantes\n" +
                "4. Reporte de Profesores\n" +
                "5. Salir"));

            switch (op) {
                case 1: col.registrarProfesor(); break;
                case 2: col.registrarEstudiante(); break;
                case 3: col.reporteEstudiantes(); break;
                case 4: col.reporteProfesores(); break;
                case 5: JOptionPane.showMessageDialog(null, "Saliendo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (op != 5);
    }
}
