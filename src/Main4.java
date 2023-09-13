import java.math.BigDecimal;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        System.out.println("Programa número maior que 10");
        Scanner num = new Scanner(System.in);
        System.out.println("insira um número: ");
        BigDecimal num1 = num.nextBigDecimal();

        BigDecimal dez = new BigDecimal("10");

        int comparacao = num1.compareTo(dez);

        if(comparacao > 0) {
            System.out.println("O número " + num1 + " é maior que 10");

        }
        else if(comparacao == 0) {
            System.out.println("O número é igual a 10");

        }
        else {
            System.out.println("O número " + num1 + " é menor que 10");

        }
    }
}
