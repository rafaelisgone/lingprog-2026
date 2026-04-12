package ExerciciosVetor;

import java.util.Scanner;

public class SistemaEstoque {

    public static void cadastrarProdutos(String[] nomes, int[] quantidades, Scanner entrada){
        System.out.println("--- CADASTRO DE PRODUTOS ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\nNome do produto " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Quantidade em estoque de " + nomes[i] + ": ");
            quantidades[i] = entrada.nextInt();
        }
    }

    public static void mostrarCriticos(String[] nomes, int[] quantidades){
        System.out.println("\n----------------------------------");
        System.out.println("ALERTA: PRODUTOS COM ESTOQUE CRÍTICO");
        System.out.println("(Menos de 5 unidades)");
        System.out.println("----------------------------------");

        boolean temCritico = false;

        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println("-> " + nomes[i] + ": apenas " + quantidades[i] + " unidades.");
                temCritico = true;
            }
        }

        if (!temCritico) {
            System.out.println("Tudo em ordem! Nenhum item abaixo do limite.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quantidades = new int[5];

        cadastrarProdutos(nomes, quantidades, entrada);
        mostrarCriticos(nomes, quantidades);
    }
}