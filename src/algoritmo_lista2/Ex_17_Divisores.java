package algoritmo_lista2;
import java.util.Scanner;

public class Ex_17_Divisores {
    public static void main(String[] args) {
        int x, i=1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        x = scan.nextInt();
        
        while(i<=x){
            if(x%i==0){
                System.out.printf("%d é divisor de %d\n",i,x);
            }
        i++;
        }
    }
}
