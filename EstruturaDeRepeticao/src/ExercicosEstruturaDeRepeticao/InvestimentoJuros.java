package ExercicosEstruturaDeRepeticao;
import java.util.Scanner;

public class InvestimentoJuros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %, ex: 0.5): ");
        double taxa = entrada.nextDouble();

        double saldo = depositoInicial;

        for (int mes = 1; mes <= 12; mes++) {
            saldo += saldo * (taxa / 100); // Aplica o juros
            System.out.printf("Mês %2d: R$ %.2f%n", mes, saldo);
        }
    }
}