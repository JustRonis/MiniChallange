import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("\n\nBem-vindo ao meu Mini-Challange");
        System.out.println("Nome: Ronaldo Luiz\n");

        System.out.printf("Digite o número 1: ");
        int n1 = read.nextInt();
        System.out.printf("Digite o número 2: ");
        int n2 = read.nextInt();

        System.out.println("\nO resultado da soma é: " + Soma(n1,n2));

    }
    public static int Soma(int n1, int n2){
        return n1 + n2;
    }
}