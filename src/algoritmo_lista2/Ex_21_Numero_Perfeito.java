package algoritmo_lista2;
import java.util.Scanner;

public class Ex_21_Numero_Perfeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y=0;
        
        System.out.print("Digite um número: ");
        x = scan.nextInt();
        
        for(int i=1;i<x;i++){
        if(x%i==0){
        y = y + i;
        }
        }
        
        if(y==x){
            System.out.println("Número perfeito");
        }else{
            System.out.println("Número imperfeito");
        }
    }
}
