import java.util.Scanner;

//Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
//variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
//ao usuário que a sequência de números informados é inválida. 
public class Exe02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro para representar A: ");
        int A = leitor.nextInt();
        System.out.println("Digite um número distinto para representar B: ");
        int B = leitor.nextInt();

        if (A == B) {
            System.out.println("A sequência de números informados é inválida.");
        } else if (A > B) {
            System.out.println("O maior número é o representado por A: " + A);
        } else {
            System.out.println("O maior número é o representado por B: " + B);
        }
    }

}
