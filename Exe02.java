//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
//resultado da sua soma. 

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = leitor.nextInt();

        System.out.println("A soma dos dois números são: " + (num1 + num2));

    }
}
