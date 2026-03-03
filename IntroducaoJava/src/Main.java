public class Main {
    public static void main(String[] args) {

        //INTRODUÇÃO - ANOTAÇÕES

        //variavel do tipo String
        String nome = "Rafael";

        //variavel do tipo inteiro
        int idade = 18;

        //variavel do tipo float
        float peso = 92.5f;
        float altura = 1.53f;

        //calcular o imc
        float imc = peso / (altura * altura);

        System.out.println(nome + " seu IMC é: " + imc + ".");
    }
}