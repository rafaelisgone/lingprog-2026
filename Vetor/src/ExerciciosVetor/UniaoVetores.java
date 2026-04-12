package ExerciciosVetor;

import java.util.Scanner;

public class UniaoVetores {

    public static void lerVetor(int[] v, Scanner entrada, String nome){
        System.out.println(nome + ":");
        for (int i = 0; i < v.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = entrada.nextInt();
        }
    }

    public static int[] unirVetores(int[] v1, int[] v2){
        int[] v3 = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++){
            v3[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++){
            v3[i + v1.length] = v2[i];
        }

        return v3;
    }

    public static void mostrarVetor(int[] v){
        System.out.println("\nVetor resultante:");
        for (int num : v){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];

        lerVetor(v1, entrada, "VETOR 1");
        lerVetor(v2, entrada, "\nVETOR 2");

        int[] v3 = unirVetores(v1, v2);

        mostrarVetor(v3);
    }
}