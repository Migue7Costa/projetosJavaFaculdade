import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        char continuar;
        ArrayList<String> listastring = new ArrayList<>();
        System.out.println("Carango velho");
        double valorPago;
        double totalDesconto = 0;
        Scanner carango = new Scanner(System.in);

        do {
            System.out.println("Insira o nome do carro: ");
            String nome = carango.nextLine();

            System.out.println("Insira o ano do carro: ");
            int ano = carango.nextInt();

            System.out.println("Insira o valor do carro: ");
            double valor = carango.nextDouble();

            double desconto;
            if (ano <= 2010) {
                desconto = valor * 0.12;
            } else {
                desconto = valor * 0.07;
            }

            valorPago = valor - desconto;
            totalDesconto += desconto;
            listastring.add("Nome do carro: " + nome);
            listastring.add("Desconto: " + desconto);
            listastring.add("Valor a ser pago: " + valorPago);

            carango.nextLine();

            System.out.print("Deseja permanecer no programa? (s/n): ");
            continuar = carango.nextLine().charAt(0);

        } while (continuar != 'n');

        System.out.println("Total de desconto: " + totalDesconto);

        for (String mensagem : listastring) {
            System.out.println(mensagem);
        }
        System.out.println(listastring);
    }
}



