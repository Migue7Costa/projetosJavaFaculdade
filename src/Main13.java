import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = leia.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = leia.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = leia.next();
        double resultado = switch (operador) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println("Resultado: " + resultado);
    }
}
