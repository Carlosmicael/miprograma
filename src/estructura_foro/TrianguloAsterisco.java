package estructura_foro;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        //System.out.println("ingrese el numero de columnas: ");
        //int columnas = teclado.nextInt();
        for (int fila = 1;fila<=filas; fila++){//controlamos numero de filas
            String fila_asterisco = "";
            for (int col = 1; col<=fila; col++){//controlamos numero de columnas
                fila_asterisco = fila_asterisco + "*";

}
        }
    }
}
