package algoritmo_lista2;
import java.util.Scanner;

public class Ex_07_Multiplos {
    public static void main(String[] args) {
        int i=1;
        
        while(i<=200){
        if(i%7==0){
            System.out.printf("Múltiplo de 7: %d\n",i);
        }
        i++;
        }
        
    }
}
