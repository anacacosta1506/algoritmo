package algoritmo_lista2;
import java.util.Scanner;

public class Ex_09_Notas {
    public static void main(String[] args) {
        int alunos, i=1;
        double nota, soma=0, media;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o número de alunos da turma: ");
        alunos = scan.nextInt();
        
        while(i<=alunos){
            System.out.printf("Informe a nota do aluno %d: ",i);
            nota = scan.nextDouble();
            soma = soma+nota;
            i++;
        }
        
        media = soma/alunos;
        
        System.out.printf("A média aritmética da turma é %.2f\n",media);
    }
}
