import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Escribe un número entero:");
            int numero = input.nextInt();

            if (numero < 2 ) {
                System.out.println("El número debe ser mayor que 1");
            } else {

                String solucion = STR."El número \{numero} es primo";
                for (int num = 2; num < numero; num++) {
                    if (numero % num == 0) {
                        solucion = STR."El número \{numero} no es primo";
                        break;
                    }
                }

                System.out.println(solucion);
            }

        } catch (Exception e) {
            System.out.println("Error : número inválido");
        }


    }
}