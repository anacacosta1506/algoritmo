package algoritmo_lista2;

import java.util.Scanner;

public class Ex_06_Dados {

    public static void main(String[] args) {
        String nome, sexo, nome_="", sexo_="";
        int i = 1, idade, older=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("\nDigite seu nome: ");
            nome = scan.next();
            System.out.print(nome+", digite sua idade: ");
            idade = scan.nextInt();
            System.out.print(nome+", qual o seu sexo? ");
            sexo = scan.next();
   
            if(older<=idade){
            older=idade;
            nome_=nome;
            sexo_=sexo;
            }
            i++;
        } while (i <= 5);
        
        System.out.println("\n\nALUNO MAIS VELHO: ");
        System.out.println("NOME: "+nome_);
        System.out.println("IDADE: "+idade);
        System.out.println("SEXO: "+sexo_);
        
    }
}
