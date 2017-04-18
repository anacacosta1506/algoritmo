package algoritmo_lista2;

import java.util.Scanner;

public class Ex_19_Senha {

    public static void main(String[] args) {
        int senha;
        String teste;
        Scanner scan = new Scanner(System.in);

        do{
        System.out.print("Digite sua senha: ");
        senha = scan.nextInt();
        

        if (senha == 2002) {
            System.out.println("Acesso Permitido");
        } else {
            System.err.println("Senha Incorreta");
        }
        }while(senha!=2002);

    }
}
