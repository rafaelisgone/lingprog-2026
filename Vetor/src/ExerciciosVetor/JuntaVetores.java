package ExerciciosVetor;

import java.util.Scanner;

public class JuntaVetores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        // LEITURA DO VETOR 1
        System.out.println("VETOR 1:");
        for (int i = 0; i < v1.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º número: ");
            v1[i] = entrada.nextInt();
        }

        // LEITURA DO VETOR 2
        System.out.println("\nVETOR 2:");
        for (int i = 0; i < v2.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º número: ");
            v2[i] = entrada.nextInt();
        }

        // JUNTANDO OS VETORES
        for (int i = 0; i < v1.length; i++){
            v3[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++){
            v3[i + v1.length] = v2[i];
        }

        // MOSTRAR RESULTADO
        System.out.println("\nVetor resultante:");
        for (int i = 0; i < v3.length; i++){
            System.out.print(v3[i] + " ");
        }
    }
}
