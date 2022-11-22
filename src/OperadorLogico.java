public class OperadorLogico {
    private static boolean valor;

    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LOGICOS O BOOLEANOS");
        boolean VALOR = (5 == 5);//operador relacional
        boolean valor_logico = ( (5 == 5) || (4 >= 3) );// v or v ->v
        boolean valor_logico_and = ( (5 == 5) && (4 >= 3) );// V and F ->F
        System.out.println("valor: "+ valor);
        System.out.println("valor_logico: "+valor_logico );
        System.out.println("valor_logico_and: "+valor_logico_and);
        System.out.println("negacion de valor_logico: "+ !valor_logico);
    }
}
