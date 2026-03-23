package ExerciciosVetor;

import java.util.Scanner;

public class InversorNomes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        // COLETA DE NOMES
        for (int i=0; i<nomes.length; i++){
            System.out.println("Digite o nome:");
            nomes [i] = entrada.next();
        }

        // INVERSÃO DO VETOR
        System.out.println("\nNomes invertidos:");
        for(int i = nomes.length -1; i >= 0; i--){
            System.out.println(nomes[i]);
        }
    }
}
