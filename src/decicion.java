import java.util.Scanner;

/**
 * programa para determinar si una persona es mayor o menor de edad
 */
public class decicion {
    public static void main(String[] args) {
        System.out.println("programa para determinar si una persona es mayor de edad");
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = teclado.nextInt();

        if (edad>= 18 )
            System.out.println("Eres mayor de edad");
        else {
            System.out.println("Eres menor de edad");
            System.out.println("Te falta madurar ");
        }

        if (edad>= 30 )
            System.out.println("estas viejo");


    }
}