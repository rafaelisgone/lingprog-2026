package ExercicosEstruturaDeRepeticao;

import java.util.Scanner;

public class JavaLanches {
    public class Main {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("------------------------------------------------");
            System.out.println("================= JAVA LANCHES =================");
            System.out.println("------------------------------------------------");

            // LEITURA DO PEDIDO
            System.out.println("Digite o código do produto desejado:");
            System.out.println("CÓDIGO 101: CACHORRO QUENTE (R$, 10,00).");
            System.out.println("CÓDIGO 102: X-BURGUER (R$, 15,00).");
            System.out.println("CÓDIGO 103: X-SALADA (R$, 12,00).");
            int codigo = entrada.nextInt();
            double valor = 0;

            switch (codigo) {
                case 101:
                    valor = 10;
                    break;

                case 102:
                    valor = 15;
                    break;

                case 103:
                    valor = 12;
                    break;

                default:
                    System.out.println("Código inválido.");
            }

            //DESCONTOS
            System.out.println("Digite sua idade:" +
                    "\nOBS: A depender da idade, seu pedido terá um desconto.");
            int idade = entrada.nextInt();

            if (idade < 12){
                valor = valor / 2;
            }
            else if (idade >= 12 && idade <= 60){
                valor = valor;
            } else if (idade > 60) {
                valor = valor - (valor * 0.3);
            }

            //FINAL
            System.out.printf("Seu pedido foi concluído. Total da compra: R$ %.2f", valor);
        }
    }
}
