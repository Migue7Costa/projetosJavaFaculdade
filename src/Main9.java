import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("Programa da ordem");

        Scanner ordem = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = ordem.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = ordem.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = ordem.nextInt();

        int[] vetor = {num1,num2,num3};
        Arrays.sort(vetor);
        System.out.println("Números ordenados: ");
        for (int r = 0; r < vetor.length; r++) {
            System.out.println(vetor[r]);
        }
    }
}
