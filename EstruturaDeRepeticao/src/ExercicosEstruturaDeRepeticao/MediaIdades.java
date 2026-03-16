package ExercicosEstruturaDeRepeticao;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int soma = 0;
        double contador = 0;

        System.out.println("Digite as idades dos alunos (digite um número negativo para parar):");

        // Lê a primeira idade antes do loop
        System.out.print("Idade: ");
        idade = entrada.nextInt();

        while (idade >= 0) {
            soma += idade;
            contador++;

            System.out.print("Idade: ");
            idade = entrada.nextInt();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }
    }
}