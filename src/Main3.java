import java.text.DecimalFormat;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("Programa de rendimentos");
        Scanner tipoRenda = new Scanner(System.in);

        DecimalFormat arredondamento = new DecimalFormat("0.00");

        System.out.println("Como devemos te chamar? ");
        System.out.println("Insira seu nome: ");
        String nome = "Sr(a)." + tipoRenda.nextLine();

        System.out.println(nome + ", qual quantia você deseja adicionar ao rendimento? ");
        double quantia = tipoRenda.nextDouble();

        System.out.println(nome + ", escolha o tipo de rendimento: ");
        System.out.println("1 - Poupança");
        System.out.println("2 - CDB");
        System.out.println("3 - Previdência");
        int num = tipoRenda.nextInt();

        switch (num) {
            case 1 -> {
                double pouMes = quantia * 0.009;
                System.out.println(nome + ", essa é a sua quantia em um mês de rendimento na Poupança: " + arredondamento.format(pouMes));
                double pouAno = 12 * pouMes;
                System.out.println(nome + ", essa é a sua quantia em um ano de rendimento na Poupança: " + arredondamento.format(pouAno));
            }
            case 2 -> {
                double cdbMes = quantia * 0.011;
                System.out.println(nome + ", essa é a sua quantia em um mês de rendimento no CDB: " + arredondamento.format(cdbMes));
                double cdbAno = 12 * cdbMes;
                System.out.println(nome + ", essa é a sua quantia em um ano de rendimento no CDB: " + arredondamento.format(cdbAno));
            }
            case 3 -> {
                double prevMes = quantia * 0.013;
                System.out.println("Essa é a sua quantia em um mês de rendimento na Previdência: " + arredondamento.format(prevMes));
                double prevAno = 12 * prevMes;
                System.out.println("Essa é a sua quantia em um ano de rendimento na Previdência: " + arredondamento.format(prevAno));
            }
        }
    }
}

