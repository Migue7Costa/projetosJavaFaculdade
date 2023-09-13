import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Programa de elevação");
        Scanner elevacao = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        double numbase = elevacao.nextDouble();
        System.out.println("Digite o número expoente: ");
        double numexpoente = elevacao.nextDouble();

        double potencia = Math.pow(numbase,numexpoente);
        System.out.println(numbase + " elevado a " + numexpoente + " = " + potencia);
    }
}
