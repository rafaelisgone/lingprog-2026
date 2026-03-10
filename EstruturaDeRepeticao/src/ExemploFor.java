import java.util.Scanner;

public class ExemploFor {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        //Pedir ao usuário a quantidadede vezes que o dado será lançado
        System.out.println("Digite a quantidade de vezes que o dado será lançado:");
        double x = entrada.nextInt();

        //Pedir o número que ele deseja acertar
        System.out.println("Digite o número que você deseja acertar:");
        int num = entrada.nextInt();

       while (num > 6 || num < 1){
           System.out.println("O número deve ser entre 1 e 6.");
           num = entrada.nextInt();
       }

        int i = 1;
        int acertos = 0;
        for (i = 1; i <= x; i++){
            int dado = (int) (Math.random () * 6+1);
            System.out.println(i +"° tentativa: "+ dado +".");
            if (dado == num){
                acertos++;
            }
        }

        double porcentagem = (acertos / x) * 100;
        System.out.println("Número de acertos = "+ acertos);
        //System.out.printf("Porcentagem de acertos = %.2f%n", porcentagem);
        System.out.printf("Porcentagem de acertos = %.2f%%%n", porcentagem);
    }
}
