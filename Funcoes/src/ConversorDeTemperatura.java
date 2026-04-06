import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        // LEITURA DE VALORES
        System.out.print("Digite o valor da base do retângulo: ");
        double base = entrada.nextFloat();
        System.out.print("Digite o valor da altura: ");
        double alt = entrada.nextDouble();

        // VARIÁVEL QUE VAI RETORNAR O RESULTADO
        double resposta = area(base, alt);

        System.out.print("A área do retângulo é: "+ resposta );
    }

    // MÉTODO QUE CALCULA A ÁREA
    public static double area(double base, double alt){
        double resultado = base * alt;
        return resultado;
    }


}
