package ExerciciosVetor;

import java.util.Scanner;

public class Salarios {

    public static void lerSalarios(double[] salarios){
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < salarios.length; i++){
            System.out.print("Digite o salário do " + (i + 1) + "º funcionário: ");
            salarios[i] = entrada.nextDouble();
        }
    }

    public static double calcularMedia(double[] salarios){
        double soma = 0;

        for (int i = 0; i < salarios.length; i++){
            soma += salarios[i];
        }

        return soma / salarios.length;
    }

    public static int contarIguais(double[] salarios, double media){
        int count = 0;

        for (int i = 0; i < salarios.length; i++){
            if (salarios[i] == media){
                count++;
            }
        }

        return count;
    }

    public static int contarAcima(double[] salarios, double media){
        int count = 0;

        for (int i = 0; i < salarios.length; i++){
            if (salarios[i] > media){
                count++;
            }
        }

        return count;
    }

    public static int contarAbaixo(double[] salarios, double media){
        int count = 0;

        for (int i = 0; i < salarios.length; i++){
            if (salarios[i] < media){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        double[] salarios = new double[5];

        lerSalarios(salarios);

        double media = calcularMedia(salarios);
        int iguais = contarIguais(salarios, media);
        int acima = contarAcima(salarios, media);
        int abaixo = contarAbaixo(salarios, media);

        // RESULTADO
        System.out.println("\nMédia salarial: " + media);
        System.out.println("Funcionários com salário igual à média: " + iguais);
        System.out.println("Funcionários acima da média: " + acima);
        System.out.println("Funcionários abaixo da média: " + abaixo);
    }
}