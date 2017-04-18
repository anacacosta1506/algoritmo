package algoritmo_lista2;

import java.util.Scanner;

public class Ex_11_Soma_Fracao2 {

    public static void main(String[] args) {
        int x;
        double res = 0, sub = 0, soma = 0, div;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = scan.nextInt();

        for (int i = 1; i <= x; i++) {
            div = 1d / i;
            if (i % 2 == 0) {
                sub = sub - div;
                //System.out.println("SUBTRAÇÃO: " + sub);
            } else {
                soma = soma + div;
                //System.out.println("SOMA: " + soma);
            }
        }
        res = soma - sub;
        System.out.println("Resultado: " + res);
    }
}
