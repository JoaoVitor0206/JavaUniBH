package javaunibh;
import java.util.Scanner;
import java.io.*;
/*Em um campeonato por pontos corridos do Jogo Campcom VS SNK 2,
a lógica do jogo é a seguinte: é inserido um participante pelo
usuário. São exatamente 30 lutas, onde o software pergunta ao usuário,
a cada luta o número do resultado, onde: vitórias de perfect -1, vitórias -2,
empates -3 e derrotas -4, onde:

Se ele teve vitória de PERFECT, sua pontuação é somada em 100 pontos;

Se ele teve vitória, sua pontuação é somada em 50 pontos;

Se ele teve Double K.O, sua pontuação é somada em 20 pontos;

Se ele perdeu, sua pontuação é subtraída em 10 pontos;
*/
public class aula4f_2{
    public static void main(String[] args) {
        String participante;
        double pontos = 0, resultado = 0;
        int luta;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu participante:");
        participante = ler.next();

        for (int i=1; i <= 30; i++){
            System.out.println("Digite o resultado da luta: " + i);
            luta = ler.nextInt();
            switch(luta){
                case 4:
                System.out.println("Derrota");
                pontos = - 10;
                break;

                case 3:
                System.out.println("Double KO");
                pontos = 20;
                break;

                case 2:
                System.out.println("Vitória");
                pontos = 50;
                break;

                case 1:
                System.out.println("Perfect");
                pontos = 100;
                break;
            }
            resultado = resultado + pontos;
        }
        System.out.println("Campeonato: " + resultado);
    }
}