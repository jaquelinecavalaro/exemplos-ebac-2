import java.util.Scanner;

public class CalculoMedia{
    public static void main(String[] args) {
    
        //ler 4 notas e dividir por 4 - media das 4 notas, imprimir o resultado no console

        var result = tirarMedia();

        System.out.printf("Sua média é: %.2f", result);

    }

    private static double tirarMedia() {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for(int i = 1; i<5; i++){
            System.out.println("Informe sua "+ i + " nota: ");
            double valor = scanner.nextDouble();
            media += valor;
            System.out.println(media);
        }
        
        return media/4;
    }
}