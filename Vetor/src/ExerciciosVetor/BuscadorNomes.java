package ExerciciosVetor;

import java.util.Scanner;

public class BuscadorNomes {

    public static void leitura (String[] nome){
        Scanner entrada = new Scanner(System.in);
        // LEITURA
        for (int i = 0; i < nome.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º nome: ");
            nome[i] = entrada.next();
        }
    }

    public static void busca (String[] nome){
        Scanner entrada = new Scanner(System.in);
        // BUSCA
        System.out.println("\nQual nome deseja buscar? ");
        String busca = entrada.next();

        int pos = -1; // -1 significa "não encontrado"

        for(int i = 0; i < nome.length; i++){
            if (busca.equalsIgnoreCase(nome[i])) { // EQUALS COMPARA STRINGS (BUSCA = NOME[I])
                pos = i;
                break; // para o loop quando encontra
            }
        }

        // RESULTADO
        if (pos != -1){
            System.out.println("Nome encontrado na "+ (pos + 1) +"º posição.");
        } else {
            System.out.println("Nome não encontrado.");
        }
    }


    public static void main(String[] args){
        String[] nome = new String[10];
        leitura(nome);
        busca(nome);
    }
}