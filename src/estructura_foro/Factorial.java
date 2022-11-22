package estructura_foro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int mult= 1;
        for (int contador = 1;contador <= numero;contador++){
            mult = mult * numero;
    }
        System.out.println("el factorial es = "+mult);
}
}
