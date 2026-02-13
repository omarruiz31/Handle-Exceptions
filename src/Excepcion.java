/*Escriba un programa Java para crear un metodo que
 tome un número entero como parámetro y produzca una excepción si el número es impar.
*/

import java.util.Scanner;

public class Excepcion {

    public void esPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("Se esperaba un numero par");
        }
    }

    public static void main(String[] args) {
        Excepcion ex = new Excepcion();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingresa un numero par");
            int num = sc.nextInt();
            ex.esPar(num);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
