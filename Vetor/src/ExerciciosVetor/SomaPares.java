package ExerciciosVetor;

import java.util.Scanner;

public class SomaPares {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[8];
        int i = 0;
        int maior = num[0];

        // COLETA DE NÚMEROS
        for (i = 0; i < num.length; i++){
            System.out.println("Digite o número:");
            num[i] = entrada.nextInt();
            if (num[i] > maior){
                maior = num[i];
            }
        }

        // RESUMO
        System.out.print("\n=====================================================");
        System.out.println("\nO maior número foi: "+ maior);
    }
}
