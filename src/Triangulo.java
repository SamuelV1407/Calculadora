import javax.swing.*;

//clase triangulo
public class Triangulo
{
    //Metodo para determinar el tipo de triangulo
    public void triangulo(int lado1, int lado2, int lado3)
    {
        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triangulo es Equilatero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            JOptionPane.showMessageDialog(null, "El triangulo es Escaleno");
        } else {
            JOptionPane.showMessageDialog(null, "El triangulo es Isoceles");
        }
    }
    //psvm
    public static void main(String[] args)
    {
        Triangulo triangulo = new Triangulo();

        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 3"));

        //Resultado en pantalla
        triangulo.triangulo(lado1, lado2, lado3);
    }
}