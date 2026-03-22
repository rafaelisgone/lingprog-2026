package ExerciciosVetor;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double[] salarios = new double[5];
        double soma = 0;

        // LEITURA DOS SALÁRIOS
        for (int i = 0; i < salarios.length; i++){
            System.out.print("Digite o salário do "+ (i + 1) +"º funcionário: ");
            salarios[i] = entrada.nextDouble();
            soma += salarios[i];
        }

        // CÁLCULO DA MÉDIA
        double media = soma / salarios.length;

        int iguais = 0;
        int acima = 0;
        int abaixo = 0;

        // COMPARAÇÃO COM A MÉDIA
        for (int i = 0; i < salarios.length; i++){
            if (salarios[i] == media){
                iguais++;
            } else if (salarios[i] > media){
                acima++;
            } else {
                abaixo++;
            }
        }

        // RESULTADO
        System.out.println("\nMédia salarial: " + media);
        System.out.println("Funcionários com salário igual à média: " + iguais);
        System.out.println("Funcionários acima da média: " + acima);
        System.out.println("Funcionários abaixo da média: " + abaixo);
    }
}
