import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Custo médio de combustivel ");
        Scanner carro = new Scanner(System.in);
        System.out.println("Insira o modelo do carro: ");
        String modelo = carro.nextLine();
        System.out.println("Insira a quilometragem percorrida: ");
        double km = carro.nextDouble();
        System.out.println("Insira quantos litros da gasolina foram gastos: ");
        double l = carro.nextDouble();
        double consumomedio = km /l;
        System.out.println("O consumo médio do seu " + modelo + " é: " + consumomedio + "Km/L");
    }
}
