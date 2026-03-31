package Exercícios;

import java.util.Scanner;

public class ExibirSomaDaDiagonalSecundária {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o tamanho da matriz: ");
        int n = entrada.nextInt();
        int[][] mat = new int[n][n];

        // ENTRADA DE DADOS
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][i] = (int) (Math.random() * 10);
            }
        }

        System.out.print("\n\n");

        // EXIBIÇÃO DA MATRIZ
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println("");
        }

        // DIAGONAL
        int soma = 0;
        System.out.print("\n\n");
        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    System.out.print(mat[i][j]+ "  ");
                    soma += mat[i][j];
                }
            }
        }

        //SOMA
        System.out.println("\nA soma dos elementos da diagonal principal é: "+ soma);
    }
}
