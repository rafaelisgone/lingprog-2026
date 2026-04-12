package ExerciciosVetor;

import java.util.Scanner;

public class OrdenacaoBolha {

    public static void entradaDados (int[] numeros){
        // 1. Entrada de dados
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }
    }

    public static void bubbleSort (int[] numeros){
        // 2. O Algoritmo Bubble Sort
        // O primeiro 'for' controla quantas passadas daremos no vetor
        for (int i = 0; i < numeros.length - 1; i++) {

            // O segundo 'for' faz as comparações entre vizinhos
            for (int j = 0; j < numeros.length - 1 - i; j++) {

                // Se o atual for MAIOR que o próximo, eles trocam!
                if (numeros[j] > numeros[j + 1]) {

                    // A "Troca de Copos" (Variável Auxiliar)
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }

    public static void exibicao (int[] numeros){
        // 3. Exibição do vetor ordenado
        System.out.println("\n--- VETOR EM ORDEM CRESCENTE ---");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] numeros = new int[5];
        entradaDados(numeros);
        bubbleSort(numeros);
        exibicao(numeros);
    }
}
