package ExerciciosVetor;

import java.util.Scanner;

public class InversorNomes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        int i = 0;

        // COLETA DE NOMES
        for (i=0; i<nomes.length; i++){
            System.out.println("Digite o nome:");
            nomes [i] = entrada.next();
        }

        // INVERSÃO DO VETOR
        for (int j=0; j<nomes.length /2; j++) {
            // (.length): Remete ao tamanho do vetor nomes (.length = [5])
            // O (/2) faz trocar de par, do primeiro com o último e assim por diante
            String temp = nomes[j]; //Vai guardar temporariamente
            nomes[j] = nomes[nomes.length - 1 - j];
            nomes[nomes.length - 1 - j] = temp;
        }

        // EXIBIÇÃO
        System.out.println("\nNomes invertidos:");
        for (int j = 0; j < nomes.length; j++) {
            System.out.println(nomes[j]);
        }
    }
}
