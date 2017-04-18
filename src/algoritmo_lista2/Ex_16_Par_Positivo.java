package algoritmo_lista2;
import java.util.Scanner;

public class Ex_16_Par_Positivo {
    public static void main(String[] args) {
        int x,y, i=1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        x = scan.nextInt();
        
        do{
            System.out.print("\nDigite um número: ");
            y = scan.nextInt();
            
            if(y==0){
                System.out.println("NULO");
            }else if(y>0){
                System.out.println("Número positivo");
            }else{
                System.out.println("Número negativo");
            }
            if(y%2==0 && y!=0){
                System.out.println("Número par");
            }
            if(y%2==1){
                System.out.println("Número ímpar");
            }
            i++;
        }while(i<=x);
    }
}
