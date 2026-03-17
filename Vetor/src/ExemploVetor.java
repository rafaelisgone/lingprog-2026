import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] notas = new float[5];
        float soma = 0;
        int i =0;

        for(i=0; i <5; i++){
            System.out.println("Digite a nota:");
            notas[i] = entrada.nextFloat();
            soma += notas[i];
        }
        System.out.print("A média é: "+ soma/5);
    }
}
