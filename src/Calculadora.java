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

    //metodo mayor que otro
    public void Esmayor(int num1, int num2)
    {
        if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num1);
        }
        else if (num2 > num1)
        {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
    }

    //metodo numero primo
    public void esprimo (int num)
    {
        if (num <= 1)
        {
            JOptionPane.showMessageDialog(null, "El numero no es primo");
            return;
        }
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                JOptionPane.showMessageDialog(null, "El numero no es primo");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero es primo");
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
        calculadora.Esmayor(num1, num2);
        calculadora.esprimo(num1);
    }
}
