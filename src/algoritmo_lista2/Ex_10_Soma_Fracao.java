package algoritmo_lista2;

public class Ex_10_Soma_Fracao {
    public static void main(String[] args) {
        double soma=0;
        
        for(int i=1;i<=20;i++){
        soma = (1d/i)+soma;
        }
        System.out.println("Resultado: "+soma);
    }
}