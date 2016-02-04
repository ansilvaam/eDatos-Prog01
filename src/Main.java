
import java.util.Scanner;

//Programa1
public class Main {

    public static void main(String[] args) {

        int valor, num1, num2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la Matriz: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el tamaño de la Matriz: ");
        num2 = leer.nextInt();

        int[][] Matriz = new int[num1][num2];

        if (Matriz.length == Matriz[0].length) {
            System.out.println("Es cuadrada, podemos continuar");
        } else {
            System.out.println("No es cuadrada, saliendo...");
            System.exit(0);
        }

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {

                System.out.println("Ingresa: ");
                valor = leer.nextInt();

                Matriz[i][j] = valor;
            }
        }

        System.out.println("Imprime matriz: ");

        for (int i = 0; i < Matriz.length; i++) {

            for (int j = 0; j < Matriz[0].length; j++) {

                System.out.print(Matriz[i][j]);

            }

            System.out.println();
        }

        System.out.println("");
        System.out.println("Diagonal Principal");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(Matriz[i][j] + " ");
                }
            }
        }

        boolean change = true;

        System.out.println("\nInferior");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {

                if (change) {

                    if (j == (i - 1)) {
                        System.out.print(Matriz[i][j] + " ");
                        change = false;
                    }

                } else if (j == (i - 2)) {
                    System.out.print(Matriz[i][j] + " ");
                    change = true;

                }
            }

        }

        System.out.println("\nSuperior");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {

                if (change) {

                    if (j == (i + 2)) {
                        System.out.print(Matriz[i][j] + " ");
                        change = false;
                    }

                } else if (j == (i + 1)) {
                    System.out.print(Matriz[i][j] + " ");
                    change = true;

                }
            }

        }
    }
}
