package ExerciciosVetor;

import java.util.Scanner;

public class FibonnaciVetor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor (N): ");
        int N = entrada.nextInt();

        int[] fib = new int[N];

        // CASOS INICIAIS
        if (N > 0) fib[0] = 0;
        if (N > 1) fib[1] = 1;

        // PREENCHIMENTO
        for (int i = 2; i < N; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // EXIBIÇÃO
        System.out.println("\nSequência de Fibonacci:");
        for (int i = 0; i < N; i++){
            System.out.print(fib[i] + " ");
        }
    }
}
