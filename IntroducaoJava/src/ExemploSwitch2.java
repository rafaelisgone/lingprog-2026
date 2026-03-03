import java.util.Scanner;

public class ExemploSwitch2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite:\n" +
                "A - Para cadastro\n" +
                "B - Para consulta\n" +
                "C - para sair\n");
        String opcao = entrada.next();

        switch (opcao){
            case "A":
                System.out.println("Cadastro realizado com sucesso.");
                break;

            case "B":
                System.out.println("Consulta realizada com sucesso.");
                break;

            case "C":
                System.out.println("O sistema será encerrado.");
                break;

            default:
                System.out.println("Opcão imválida.");
        }
    }
}
