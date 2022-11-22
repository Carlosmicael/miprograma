import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 3");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("escribir base");
                int base = teclado.nextInt();
                System.out.println("escribir altura");
                int altura = teclado.nextInt();
                double area = (base * altura)/2;
                System.out.println("area final= "+area);
                break;//salta al final de la estructura switch
            case 2:
                System.out.println("escribir radio");
                int radio = teclado.nextInt();
                double area_C = Math.pow(radio,2) * Math.PI;
                System.out.println("area final= "+area_C);
                break;
            case 3:
                System.out.println("escribir LADO");
                int LADO = teclado.nextInt();
                double LADO_1 = Math.pow(LADO,2);
                System.out.println("area final= "+LADO_1);

            default:
                System.out.println("ese no es un numero gil");
        }

    }
}
