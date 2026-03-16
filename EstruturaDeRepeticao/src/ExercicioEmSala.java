import java.util.Scanner;

public class ExercicioEmSala {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.next();
        System.out.println("Informe o valor bruto da compra:");
        float valor = entrada.nextFloat();

        int opcao;
        do{
            System.out.println("Escolha uma das opçôes para pagar: ");
            System.out.println("(Use o número correspondente)");
            System.out.println("1- À vista (15% de desconto)");
            System.out.println("2- Parcelado no Cartão (Até 5x sem juros)");
            System.out.println("3- Crediário da Loja (10 parcelas com juros de 2% ao mês sobre o valor bruto)");
            System.out.println("0- Cancelar ");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    valor = (float) (valor - (valor * 0.15));
                    System.out.println("O valor da compra é: R$"+ valor +"\n");
                    break;

                case 2:
                    System.out.println("Digite a quantidade de parcelas (Até 5x):" +"\n");
                    int qntd = entrada.nextInt();
                    int i = 1;
                    for(i=1; i<=qntd; i++){
                        System.out.println("O valor da"+ i +"a. parcela será: R$"+ valor / qntd +"\n");
                    }
                    break;

                case 3:
                    valor = ((float) (valor + (valor * 0.20))) / 10;
                    System.out.println("Serão 10 parcelas de: R$"+ valor +"\n");
                    break;

                case 0:
                    System.out.println("Cancelando..."+"\n");
                    break;

                default:
                    System.out.println("Opção inválida"+"\n");
            }
        }
        while(opcao != 0);
    }
}
