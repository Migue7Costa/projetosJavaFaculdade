import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("Salário mensal do vendedor ");
        Scanner salario = new Scanner(System.in);
        System.out.println("Insira o nome do Vendedor: ");
        String nome = salario.nextLine();
        System.out.println("Insira o salário fixo do Vendedor " + nome + ": ");
        double salarioFixo = salario.nextDouble();
        System.out.println("Insira o total de vendas do vendedor " + nome + " neste mês (em dinheiro): ");
        double vendas = salario.nextDouble();
        double salarioTotal = salarioFixo + (vendas * 0.15);
        System.out.println("O salário do vendedor " + nome + " é: " + salarioTotal);

    }
}
