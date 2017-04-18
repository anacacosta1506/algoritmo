package algoritmo_lista2;
import java.util.Scanner;

public class Ex_20_Deposito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo=0, deposito=0, saque=0;
        int op=0;
        
        System.out.print("Informe o seu saldo inicial: ");
        saldo = scan.nextDouble();
        
        do{
            System.out.println("Informe a operação desejada: ");
            op = scan.nextInt();
            
            if(op==1){
                System.out.println("Informe o valor a ser depositado: ");
                deposito = scan.nextDouble();
                saldo = saldo+deposito;
            }
            if(op==2){
                System.out.println("Informe o valor a ser sacado: ");
            saque = scan.nextDouble();
            saldo = saldo-saque;
            }
            if(op==3){
                if(saldo==0){
                    System.out.printf("R$%.2f \nConta Zerada\n",saldo);
                }else if(saldo>0){
                System.out.printf("R$%.2f \nConta Preferencial\n",saldo);
                }else{
                System.err.printf("R$%.2f \nConta Estourada\n",saldo);
                }

            }
        }while(op!=3);
        
        
    }
}
