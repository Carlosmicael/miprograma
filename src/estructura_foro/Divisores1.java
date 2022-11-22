package estructura_foro;

import java.util.Scanner;

public class Divisores1 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for (int contador = 1 ; contador<=numero; contador++){
            if (numero % contador == 0)
                System.out.println("los divisores son: "+contador);

    }
}
}