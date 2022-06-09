/*Em um campeonato de LOL, enquanto não há a tomada de 
território, o contador implementado deve contar(que é 
contabilizado pelo jogo), o número de kills, deaths e assists.
Se o número de kills for menor ou igual a 5,ele mostra a mensagem
"noob", se chegar a 20 ou mais "master". Se o número de deaths chegar
a 20 ou mais, ele mostra a mensagem "Houston, we have a problem". Se o
número de assists chegar a 20 ou mais, é mostrada a mensagem "team work".
Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
Dicas:
1- Há kills, deaths e assists total e da rodada.
2- Medite na frase: enquanto não há vencedor, faça...
3-Pergunte a cada loop o número de cada medida comentada.
4- Você deve perguntar se há um vencedor a cada loop...
*/

package javaunibh;
import java.util.Scanner;
import java.io.*;
public class Aula4F_3{
    public static void main(String[] args) {
        String vencedor;
        double pontos = 0, resultado = 0;
        int kills = 0, deaths = 0, assists = 0, killst = 0, deathst = 0, assistst = 0;
        Scanner ler = new Scanner(System.in);
        vencedor = "n";

        while (vencedor.equals("n")){
            System.out.println("Número de kills: ");
            kills = ler.nextInt();
            kills = killst + kills;

           System.out.println("Número de deaths: ");
           deaths = ler.nextInt();
           deaths = deathst + deaths;
           
           System.out.println("Número de assists: ");
           assists = ler.nextInt();
           assists = assistst + assists;

           if(kills <= 5){System.out.println("Noob");}
           if(killst >= 20){System.out.println("Master");}
           if(deaths >= 20){System.out.println("Houston, we have a problem");}
           if(assists >= 20){System.out.println("Team work");}

           System.out.println("Há um vencedor? ");
           vencedor = ler.next();
        }
    }
}