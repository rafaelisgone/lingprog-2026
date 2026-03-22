package ExerciciosVetor;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[5];

        // LEITURA DOS NÚMEROS
        for (int i = 0; i < num.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º número: ");
            num[i] = entrada.nextInt();
        }

        // BUBBLE SORT
        for (int i = 0; i < num.length - 1; i++){
            for (int j = 0; j < num.length - 1; j++){

                if (num[j] > num[j + 1]){
                    // troca
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // EXIBIÇÃO
        System.out.println("\nNúmeros em ordem crescente:");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
