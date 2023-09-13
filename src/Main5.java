import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int totaldePessoas = 3;
        int num = 1;
        String sexo1 = "Feminino";
        String sexo2 = "Masculino";
        ArrayList<String> listaDeNomes = new ArrayList<>();

        System.out.println("Informação de " + totaldePessoas + " pessoas:");

        while (num <= totaldePessoas) {
            System.out.println("Insira seu nome: ");
            String nome = info.nextLine();

            String sexo;
            do {
                System.out.println("Insira seu sexo (1 - Feminino, 2 - Masculino): ");
                sexo = info.nextLine();

                if (!sexo.equals("1") && !sexo.equals("2")) {
                    System.out.println("Entrada de sexo inválida. Tente novamente.");
                }
            } while (!sexo.equals("1") && !sexo.equals("2"));

            if (sexo.equals("1")) {
                listaDeNomes.add(nome + " sexo: " + sexo1);
            } else if (sexo.equals("2")) {
                listaDeNomes.add(nome + " sexo: " + sexo2);
            }

            num++;
        }

        System.out.println(listaDeNomes);
    }
}
