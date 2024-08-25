import java.util.Scanner;

public class Cashback {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double cashback;

        System.out.println("digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("digite o valor da compra: ");
        double valordacompra = leitor.nextDouble();

        if( idade >= 21 && valordacompra < 1000){
            cashback = 0.05;
        }else  if (idade < 21 && valordacompra < 1000 || idade >= 21 && valordacompra > 1000) {
            cashback = 0.07;
        }else {
            cashback = 0.1;
        }
        double valorDoCashback = valordacompra * cashback;
        System.out.println("olá " + nome + " o se cashback é de " + valorDoCashback);
    }
}
