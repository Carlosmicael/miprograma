import java.util.Scanner;

public class CondicionalCompuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad > 0 && edad < 18){
            System.out.println("Eres mayor de edad");
            System.out.println("Eres un niño");
        }else if (edad >= 18 && edad <= 65 ){
            System.out.println("Aun eres mayor de edad");
        }else if (edad > 65 && edad <=100 ){
            System.out.println("Eres de la tercera edad");
        }else if (edad > 100 && edad <=150 ){
            System.out.println("eres una persona sabia");
        }else{
            System.out.println("Edad invalida");
        }
    }
}
