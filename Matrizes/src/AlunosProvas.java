import java.util.Scanner;

public class AlunosProvas {
    public static void main(String[] args) {
        // declaração da matriz
        float[][] notas = new float[3][4];

        // leitura da matriz
        // soma as notas
        float soma = 0;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length; j++){
                // gera notas entre 0 e 10
                notas[i][j] = (float) (Math.random() * 10);
                soma += notas[i][j];
                System.out.printf("%.2f   ", notas[i][j]);
            }
            System.out.println("");
        }
        int qtdeNotas = notas.length * notas[0].length;
        System.out.printf("\nA média das notas é %.2f" , soma / qtdeNotas);
        System.out.println("");

        for (int i = 0; i < notas.length; i++){
            float acm = 0;
            for (int j = 0; j < notas[i].length; j++){
                acm += notas[i][j];
            }
            float media = acm / notas[i].length;
            System.out.println("A média do "+ (i + 1) +"º aluno é: "+ media);
        }

        for (int j = 0; j < notas[0].length; j++){
            float acm  = 0;
            for (int i = 0; i < notas.length; i++){
                acm += notas[i][j];
            }
            float media = acm / notas.length;
            System.out.println("A média da "+ (j + 1) +"º é: "+ media);
        }
    }
}
