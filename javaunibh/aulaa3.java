package javaunibh;

import java.util.Scanner;
public class aulaa3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int numFilhos;
        double reais;

        System.out.println("Qual seu nome?");
        nome = ler.next();
        System.out.println("Quantos filhos você tem?");
        numFilhos = ler.nextInt();
        System.out.println("Quantos reais você tem no bolso agora?");
        reais = ler.nextDouble();
        if(reais <= 50.00 && numFilhos > 1){
            System.out.println("Não da pra comprar ovos de páscoa para todos com esse valor");
        } else {
            System.out.println("Vai na fé e olhe os preços!");
        }
    }
}
