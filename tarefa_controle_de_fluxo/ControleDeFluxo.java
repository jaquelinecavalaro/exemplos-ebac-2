package tarefa_controle_de_fluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    
    public static void main(String[] args) {
        
        //ler nota do aluno
        //ler 4 notas, dividir por 4
        //fazer condição
        //maior igual 7 aprovado
        //maior igual a cinco de recuperação
        //menor ta reprovado

        double notas = 0;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Olá, vamos verificar suas notas!");

        for(int i = 1; i <= 4 ; i++){
            System.out.println("Informe sua "+i+" nota:");
            notas = scanner.nextDouble();
            notas += notas;
        }
        notas = notas/4;
        System.out.println(notas);
        if(notas>=7){
            System.out.printf("Aprovado, com média: %.2f", notas);
        }
        else if(notas>=5){
            System.out.printf("Recuperação, com média: %.2f", notas);
        }else{
            System.out.printf("Reprovado, com média: %.2f", notas);
        }
    }
}
