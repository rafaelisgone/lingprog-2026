package ExerciciosVetor;

import java.util.Scanner;

public class MaiorMenor {

    public static void leitorNumeros(int[] num){
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }
    }

    public static void main (String[] args){
        int[] num = new int[10];

        leitorNumeros(num);

        int maior = num[0];
        int menor = num[0];
        int indiceMa = 0;
        int indiceMe = 0;

        for(int i = 1; i < num.length; i++){
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
        System.out.println("\nO maior valor foi o " + (indiceMa + 1) + "º número digitado: " + maior);
        System.out.println("O menor valor foi o " + (indiceMe + 1) + "º número digitado: " + menor);
    }
}