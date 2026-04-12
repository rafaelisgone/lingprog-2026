package ExerciciosVetor;

import java.util.Scanner;

public class SubstituicaoValores {

    public static void lerValores(int[] num, Scanner entrada){
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o valor: ");
            num[i] = entrada.nextInt();
        }
    }

    public static void substituirNegativos(int[] num){
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                num[i] = 0;
            }
        }
    }

    public static void mostrarValores(int[] num){
        System.out.println("Valores:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[10];

        lerValores(num, entrada);
        substituirNegativos(num);
        mostrarValores(num);
    }
}