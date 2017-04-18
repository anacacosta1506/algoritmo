package algoritmo_lista2;

import java.util.Scanner;

public class Ex_15_Fatorial {

    public static void main(String[] args) {
        int n, res = 0, soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            n = scan.nextInt();
        } while (n <= 0);

        res=n;
        for (int i = n; i > 1; i--) {
            soma = res * (i - 1);
            res = soma;
        }
        System.out.println("Resultado: "+soma);
    }
}
