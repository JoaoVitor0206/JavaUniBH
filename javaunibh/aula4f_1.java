package javaunibh;
import java.util.Scanner;
import java.io.*;
public class aula4f_1{
    //Faça um algoritmo que adicione uma unidade até 30 vezes de um numero que vc digitou anteriormente
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número: ");
        numero = ler.nextInt();
        for(int i = 0; i < 30; ++i){
            numero = numero +1;
        }
        System.out.println("Digite o número com adição de 1 unidade 30 vezes:" + numero);
    }
}