package algoritmo_lista2;
import java.util.Scanner;

public class Ex_18_Sequencia {

    public static void main(String[] args) {
        int x, valor1 = 1, valor2 = 1, soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um número até 46: ");
            x = scan.nextInt();
        } while (x > 46);

        System.out.println("0\n1\n1");
        for (int i = 1; i <= x-3; i++) {

            soma = valor1 + valor2;

            valor1 = valor2;

            valor2 = soma;

            System.out.println(soma);
        }
    }
}
