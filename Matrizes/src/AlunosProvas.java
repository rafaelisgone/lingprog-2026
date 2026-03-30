import java.util.Scanner;

public class AlunosProvas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       float[][] mat = new float[3][4];
       float soma = 0f;
       for (int i = 0; i < mat.length; i++){
           for (int j = 0; j < mat[1].length; j++){
               // gera notas entre 0 e 10
               mat[i][j] = (float) (Math.random() * 10);
               soma += mat[i][j];
               System.out.printf("%.2f   ", mat[i][j]);
           }
           System.out.println("");
       }
       float somaDois = 0f;
       for (int i = 0; i < mat.length; i++){
           for(int j = 0; j < mat[1].length; j++){

           }
       }
       int qnteNotas = mat.length + mat[0].length;
       System.out.printf("\nA média das notas é: %.2f", soma/qnteNotas);
    }
}
