package algoritmo_lista2;
import java.util.Scanner;

public class Ex_12_Soma_Dupla {
    public static void main(String[] args) {
        int n, cont;
        double res=0,res2=0, soma=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n = scan.nextInt();
        cont = n;
        
        for(int i=1;i<=n;i++){
            double x = i;
            res = x/cont;
            soma = soma+res;
            
            res2 = cont/x;
            soma = soma+res2;
            
            cont--;                 
        }
       System.out.printf("O resultado da soma é %.2f\n",soma);
    }
}
