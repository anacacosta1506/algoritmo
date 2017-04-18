package algoritmo_lista2;

public class Ex_08_Pares_2 {
    public static void main(String[] args) {
        double media;
        int soma=0,num=0;
        
        for(int i =13;i<=73;i++){
        if(i%2==0){
        soma = soma+i;
        num=num+1;
        }
        }
        media = soma/num;
        System.out.println("A média aritmética dos números pares é "+media);
    }
}
