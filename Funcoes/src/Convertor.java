import java.util.Scanner;

public class Convertor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de graus em Celsius: ");
        float celsius = entrada.nextFloat();

        System.out.print("O valor convertido para Farenheit é: "+ convertor(celsius));
    }
    public static float convertor(float celsius){
        float resultado = (celsius * 1.8f) + 32;
        return resultado;
    }
}
