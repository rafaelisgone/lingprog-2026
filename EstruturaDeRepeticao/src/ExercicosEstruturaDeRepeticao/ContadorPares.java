package ExercicosEstruturaDeRepeticao;
import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite inferior:");
        int inferior = entrada.nextInt();

        System.out.println("Digite o limite superior:");
        int superior = entrada.nextInt();

        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

