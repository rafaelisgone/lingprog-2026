package ExercicosEstruturaDeRepeticao;
import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números você deseja somar?");
        int quantidade = entrada.nextInt();

        int soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o número " + i + ":");
            int numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma total é: " + soma);
    }
}