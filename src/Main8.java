import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("Número perfeito");
        Scanner numeroPerfeito = new Scanner(System.in);
        System.out.println("Escreva o número desejado: ");
        int num = numeroPerfeito.nextInt();
        int somaDivisores = 0;

        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                somaDivisores += divisor;
            }
        }

        if (somaDivisores == num) {
            System.out.println("O número " + num + " é perfeito.");
        } else {
            System.out.println("O número " + num + " não é perfeito.");
        }
    }
}