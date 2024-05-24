public class CalculoMedia{
    public static void main(String[] args) {
    
        //ler 4 notas e dividir por 4 - media das 4 notas, imprimir o resultado no console

        var result = tirarMedia(8.5,8,9.6,10);

        System.out.printf("Sua média é: %.2f", result);

    }

    private static double tirarMedia(double num1, double num2, double num3, double num4) {
        double media = 0;
        media = (num1 + num2 + num3 + num4)/4;
        return media;
    }
}