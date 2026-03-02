import java.util.Scanner;
public class CalculadoraContaLuz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a leitura anterior (kWh): ");
        double leituraAnterior = scanner.nextDouble();

        System.out.print("Digite a leitura atual (kWh): ");
        double leituraAtual = scanner.nextDouble();

        // Cálculo do consumo
        double consumo = leituraAtual - leituraAnterior;

        if (consumo < 0) {
            System.out.println("Erro: A leitura atual não pode ser menor que a leitura anterior.");
            return;
        }

        //Cálculo do valor bruto
        double valorBruto = consumo * 0.60;

        //Aplicação da bandeira tarifária
        String bandeira;
        double adicional = 0;

        if (consumo <= 100) {
            bandeira = "Bandeira Verde";
        } else if (consumo <= 200) {
            bandeira = "Bandeira Amarela";
            adicional = 2.00;
        } else if (consumo <= 300) {
            bandeira = "Bandeira Vermelha";
            adicional = 5.00;
        } else {
            bandeira = "Bandeira Preta";
            adicional = 10.00;
        }

        double valorFinal = valorBruto + adicional;

        //Resumo
        System.out.println("\n===== RESUMO DA CONTA =====");
        System.out.println("Cliente: " + nome);
        System.out.println("Consumo do mês: " + consumo + " kWh");
        System.out.println("Bandeira Tarifária: " + bandeira);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}