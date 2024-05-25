package tarefa_wrapper;

import java.util.Scanner;

public class ExercicioWrapper{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    
    /*
     *criar uma classe e dentro dela ler do console um valor numerico, 
     coloque numa variavel primitiva, faça conversão pro tipo wrapper dessa variavel   
     */
        System.out.println("Informe um numero inteiro: ");
        int numero = scanner.nextInt();
        Integer numInteger = numero;

        System.out.println("Esse numero em Integer é: "+ numInteger);

        scanner.close();
    }
}