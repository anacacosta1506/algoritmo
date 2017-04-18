package algoritmo_lista2;

import java.util.Scanner;

public class Ex_14_Soma {

    public static void main(String[] args) {
        int x;
        double soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = scan.nextInt();

        x = x * 2;
        for (int i = 2; i <= x; i = i + 2){
            double y=i;
            soma = soma + (y/(y+1));
        }
        soma = soma +1;
        System.out.printf("Resultado: %.2f\n",soma);
    }
}
