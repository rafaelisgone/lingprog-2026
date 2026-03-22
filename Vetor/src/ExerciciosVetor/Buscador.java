package ExerciciosVetor;

import java.util.Scanner;

public class Buscador {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[10];

        // LEITURA
        for (int i = 0; i < nome.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º nome: ");
            nome[i] = entrada.next();
        }

        // BUSCA
        System.out.print("\nQual nome deseja buscar? ");
        String busca = entrada.next();

        int pos = -1; // -1 significa "não encontrado"

        for(int i = 0; i < nome.length; i++){
            if (busca.equals(nome[i])) {
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
}