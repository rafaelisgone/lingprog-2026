package ExerciciosVetor;

import java.util.Scanner;

public class SubstituicaoValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];
        int i = 0;

        // COLETA DE VALORES
        for (i = 0; i < num.length; i++) {
            System.out.println("Digite o valor: ");
            num[i] = entrada.nextInt();
            // SUBSTITUIÇÃO
            if (num[i] < 0) {
                num[i] = 0;
            }
        }
        // EXIBIÇÃO
        System.out.println("Valores:");
        for (i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
