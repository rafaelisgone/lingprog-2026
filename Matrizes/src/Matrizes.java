import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // DECLARAÇÃO
        int [][] mat = new int[3][3];
        // ÍNDICE E CAESSO
        // indice i e j (começa do zero)

        for (int i = 0; i < mat.length; i++){
            // mat.length retorna apenas a quantidade de linhas
            for (int j = 0; j < 3; j++){
                System.out.println("Digite um valor:");
                int num = entrada.nextInt();
            }
        }
    }
}
