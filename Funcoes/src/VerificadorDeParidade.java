import java.util.Scanner;

public class VerificadorDeParidade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = entrada.nextInt();

        if (ehPar(num)){
            System.out.print("O valor é par.");
        }
        else{
            System.out.print("O valor é ímpar.");
        }
    }
    public static boolean ehPar (int num){
            return (num % 2 == 0); // RETORNA TRUE SE PAR E FALSE SE IMPAR
    }
}
