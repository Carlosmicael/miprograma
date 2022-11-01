import java.util.Scanner;

public class diasdelasemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese los dias de la semana\n");
        System.out.println("ingrese un numero del 1-7: ");
        int numero = teclado.nextInt();
        if (numero == 1)
            System.out.println("lunes");
        else if (numero == 2)
                System.out.println("martes");
        else if (numero == 3)
                System.out.println("miercoles");
        else if (numero == 4)
                System.out.println("jueves");
        else if (numero == 5)
            System.out.println("viernes");
        else if (numero == 6)
            System.out.println("sabado");
        else if (numero == 7)
            System.out.println("domingo");
        else
            System.out.println("7 dias de la semana");







        }

    }
}
