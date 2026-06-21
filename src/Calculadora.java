import javax.swing.*;

//Clase Calculadora
public class Calculadora
{
    //Metodo sumar
    public int sumar(int num1, int num2)
    {
        return num1 + num2;
    }

    //metodo resta
    public int resta(int num1, int num2)
    {
        return num1 - num2;
    }

    //metodo multiplicar
    public int multiplicar(int num1, int num2)
    {
        return num1 * num2;
    }

    //metodo dividir
    public double dividir(double num1, double num2)
    {
        return num1 / num2;
    }

    //psvm
    static void main()
    {
        //NombreClase nombreObjeto = new NombreClase();
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor numero 2"));
        //Se muestra el resultado por consola
        System.out.println("El resultado de la suma es: " + calculadora.sumar(num1,num2));
        //Se muestra el resultado por pantalla
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + calculadora.sumar(num1,num2) );
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + calculadora.resta(num1,num2) );
        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + calculadora.dividir(num1,num2) );
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación  es: " + calculadora.multiplicar(num1,num2) );
    }
}

