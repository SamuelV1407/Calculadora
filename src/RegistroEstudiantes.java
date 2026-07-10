import javax.swing.*;

public class RegistroEstudiantes {
    public void Registro() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del estudiante: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la primera nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la tercera nota: "));

        //Promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 3.0) {
            JOptionPane.showMessageDialog(null,
                    "Nombre: " + nombre +
                            "\nedad: " + edad +
                            "\npromedio: " + promedio +
                            "\nEstado: El estudiante esta en riesgo academico.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nombre: " + nombre +
                            "\nedad: " + edad +
                            "\npromedio: " + promedio +
                            "\nEstado: El estudiante no esta en riesgo academico.");
        }
    }

    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        registro.Registro();
    }
}
