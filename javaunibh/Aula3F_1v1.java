package javaunibh;
import java.util.Scanner;
import java.io.*;

public class Aula3F_1v1{
    public static void main(String[] args) {
        double nota, frequencia;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        nota = ler.nextDouble();
        
        System.out.println("Digite sua frequência");
        frequencia = ler.nextDouble();
        
        if (nota >= 7 & frequencia > 0.75){
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}