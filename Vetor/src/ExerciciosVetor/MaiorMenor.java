package ExerciciosVetor;

import java.util.Scanner;

public class MaiorMenor {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];

        // LEITURA DO PRIMEIRO NÚMERO
        System.out.print("Digite o 1º número: ");
        num[0] = entrada.nextInt();

        int maior = num[0];
        int menor = num[0];
        int indiceMa = 0;
        int indiceMe = 0;

        // LEITURA DOS OUTROS NÚMEROS
        for(int i = 1; i < num.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º número: ");
            num[i] = entrada.nextInt();

            if (num[i] > maior){
                maior = num[i];
                indiceMa = i;
            }
            if(num[i] < menor){
                menor = num[i];
                indiceMe = i;
            }
        }

        // RESULTADO
        System.out.println("\nO maior valor foi o "+ (indiceMa + 1) +"º número digitado: "+ maior);
        System.out.println("O menor valor foi o "+ (indiceMe + 1) +"º número digitado: "+ menor);
    }
}