package ExercicosEstruturaDeRepeticao;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int termos = entrada.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci:");
        for (int i = 1; i <= termos; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}