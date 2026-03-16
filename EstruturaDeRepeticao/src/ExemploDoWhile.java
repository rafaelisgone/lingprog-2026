import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            opcao = entrada.nextInt();

            float saldo = 0f;
            switch(opcao){
                case 1:
                    System.out.println(saldo);
                    break;
            }
        }
        while(opcao != 3);
    }

}
