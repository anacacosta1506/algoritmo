package algoritmo_lista2;

import java.util.Scanner;

public class Ex_13_Multiplicacao {

    public static void main(String[] args) {
        int n;
        double aux = 3, res = 1, res2 = 1, soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = scan.nextInt();

        for (int i = 2; i <= n; i++) {
            res = (res * i);

            res2 = (res2 * aux);

            soma = (res / res2) + soma;

            aux = aux + 2;
        }
        soma = soma + 1;
        System.out.printf("Resultado: %.3f\n", soma);
    }
}
