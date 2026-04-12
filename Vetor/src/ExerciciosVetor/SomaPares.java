package ExerciciosVetor;

import java.util.Scanner;

public class SomaPares {

    public static void lerNumeros(int[] num, Scanner entrada){
        for (int i = 0; i < num.length; i++){
            System.out.print("Digite o número: ");
            num[i] = entrada.nextInt();
        }
    }

    public static int somarPares(int[] num){
        int soma = 0;

        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0){
                soma += num[i];
            }
        }

        return soma;
    }

    public static void mostrarResultado(int soma){
        System.out.print("\n=====================================================");
        System.out.println("\nA soma de números pares foi: " + soma);
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[8];

        lerNumeros(num, entrada);
        int soma = somarPares(num);
        mostrarResultado(soma);
    }
}