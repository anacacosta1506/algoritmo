package algoritmo_lista2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex_19_Senha {

    public static void main(String[] args) {
        int senha;
        String teste;
        Scanner scan = new Scanner(System.in);


        //System.out.print("Digite sua senha: ");
        teste = JOptionPane.showInputDialog(null, "Digite sua senha: ");
                
                
       // senha = scan.nextInt();
        
       
       if(teste.equals("2002")){
       JOptionPane.showMessageDialog(null, "Acesso Permitido");
       }else{
       JOptionPane.showMessageDialog(null, "Senha Incorreta");
       }

       /* if (senha == 2002) {
            System.out.println("Acesso Permitido");
        } else {
            System.err.println("Senha Incorreta");
        }*/



    }
}
