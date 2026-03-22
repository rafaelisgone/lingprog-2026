package ExerciciosVetor;

import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] estoque = new int[5];

        // LEITURA DOS DADOS
        for (int i = 0; i < 5; i++){
            System.out.print("Digite o nome do produto: ");
            produtos[i] = entrada.next();

            System.out.print("Digite a quantidade em estoque: ");
            estoque[i] = entrada.nextInt();
        }

        // VERIFICAR ESTOQUE CRÍTICO
        System.out.println("\nProdutos com estoque crítico (menos de 5):");

        boolean encontrou = false;

        for (int i = 0; i < 5; i++){
            if (estoque[i] < 5){
                System.out.println(produtos[i] + " - Quantidade: " + estoque[i]);
                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("Nenhum produto com estoque crítico.");
        }
    }
}
