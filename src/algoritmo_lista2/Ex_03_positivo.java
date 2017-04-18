package algoritmo_lista2;
import java.util.Scanner;

public class Ex_03_positivo {
    public static void main(String[] args) {
        int x, maior=0;
        Scanner scan = new Scanner(System.in);
        
        
        for(int i=1;i<=10; i++){
        System.out.printf("Digite o %dº número: ",i);
        x = scan.nextInt();
        
        if(maior<x){
        maior=x;
        }
        }
        System.out.println("O maior número digitado foi "+maior);
    }
}
