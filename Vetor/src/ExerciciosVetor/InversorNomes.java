package ExerciciosVetor;

import java.util.Scanner;

public class InversorNomes {

    // FUNÇÃO QUE LÊ OS NOMES
    public static void leitorNomes (String[] nomes){
        Scanner entrada = new Scanner(System.in);
        // COLETA DE NOMES
        for (int i=0; i<nomes.length; i++){
            System.out.println("Digite o nome:");
            nomes [i] = entrada.next();
        }
    }

    // FUNÇÃO INVERSORA
    public static void inversor (String[] nomes){
        System.out.println("\nNomes invertidos:");
        for(int i = nomes.length -1; i >= 0; i--){
            System.out.println(nomes[i]);
        }
    }
    public static void main(String[] args){
        String[] nomes = new String[5];
        leitorNomes(nomes);
        inversor(nomes);
    }
}
