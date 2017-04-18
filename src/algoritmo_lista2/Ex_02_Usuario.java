package algoritmo_lista2;

import java.util.Scanner;

public class Ex_02_Usuario {

    public static void main(String[] args) {
        int i = 1, x, soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        x = scan.nextInt();

        while (i <= x) {
            soma = soma + i;
            i++;
        }
        System.out.println(soma);
    }
}
