import java.util.Scanner;

public class Operacoes {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Entre com o primeiro número: ");
        int num = entrada.nextInt();

        System.out.println("\nEntre com o segundo número: ");
        int numdois = entrada.nextInt();

        System.out.println("\n\nSelecione qual operação será utilizada, usando:\n" +
                "1.Soma\n" +
                "2.Subtração\n" +
                "3.Divisão\n" +
                "4.Multiplicação\n\n");

        int opcao = entrada.nextInt();
        int res = 0;
        switch (opcao){
            case 1:
                res = num + numdois;
                System.out.println("\nA soma de " + num + " + " + numdois + " = " + res);
                break;

            case 2:
                res = num - numdois;
                System.out.println("\nA subtração de " + num + " - " + numdois + " = " + res);
                break;

            case 3:
                res = num / numdois;
                System.out.println("\nA divisão de " + num + " ÷ " + numdois + " = " + res);
                break;

            case 4:
                res = num * numdois;
                System.out.println("\nA mutiplicação de " + num + " x " + numdois + " = " + res);
                break;
        }
    }

}
