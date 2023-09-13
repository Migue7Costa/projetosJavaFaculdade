import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Inversor de valores ");
        Scanner inversor = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        double valorA = inversor.nextDouble();
        System.out.println("Insira o valor de B: ");
        double valorB = inversor.nextDouble();
        double valora = valorB;
        double valorb = valorA;
        System.out.println("O valor de A era: " + valorA + " e agora é: " + valora);
        System.out.println("O valor de B era: " + valorB + " e agora é: " + valorb);

    }
}
