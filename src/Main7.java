import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("Companhia de seguros: ");
        Scanner tipo = new Scanner(System.in);

        System.out.println("Insira o nome completo do pretendente: ");
        String nome = tipo.nextLine();
        System.out.println("Escolha a faixa etária do pretendente " + nome + ": ");
        System.out.println("1 - Inferior a 17 anos");
        System.out.println("2 - entre 17 e 20 anos");
        System.out.println("3 - Entre 21 e 24 anos");
        System.out.println("4 - Entre 25 e 34 anos");
        System.out.println("5 - Entre 35 e 64 anos");
        System.out.println("6 - Entre 65 e 70 anos");
        System.out.println("7 - Superior a 70 anos");

        int faixaEtaria = tipo.nextInt();
        switch (faixaEtaria) {
            case 1 -> {
                System.out.println("A faixa etária do pretendente " + nome + " é inferior a necessária");
                System.out.println(nome + " Impedido de adquirir apólices de seguro");

            }case 2 -> {
                System.out.println("Insira a idade do pretendente " + nome + ": ");
                int idade = tipo.nextInt();
                System.out.println("Defina o grupo de risco: ");
                System.out.println("b - baixo/m - médio/a - alto");
                char risco = tipo.next().charAt(0);
                if (risco == 'b') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 1.");

                } else if (idade < 17 || idade > 20) {
                    System.out.println("Idade exterior a faixa etária");

                } else if (risco == 'm') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 2.");


                } else {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 3.");

                }
            }case 3 -> {
                System.out.println("Insira a idade do pretendente " + nome + ": ");
                int idade = tipo.nextInt();
                System.out.println("Defina o grupo de risco: ");
                System.out.println("b - baixo/m - médio/a - alto");
                char risco = tipo.next().charAt(0);

                if (risco == 'b') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 2.");

                } else if (idade < 21 || idade > 24) {
                    System.out.println("Idade exterior a faixa etária");

                } else if (risco == 'm') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 3.");

                } else {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 4.");

                }
            }case 4 -> {
                System.out.println("Insira a idade do pretendente " + nome + ": ");
                int idade = tipo.nextInt();
                System.out.println("Defina o grupo de risco: ");
                System.out.println("b - baixo/m - médio/a - alto");
                char risco = tipo.next().charAt(0);
                if (risco == 'b') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 3.");

                } else if (idade < 25 || idade > 34) {
                    System.out.println("Idade exterior a faixa etária");

                } else if (risco == 'm') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 4.");


                } else {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 5.");

                }

            }case 5 -> {
                System.out.println("Insira a idade do pretendente " + nome + ": ");
                int idade = tipo.nextInt();
                System.out.println("Defina o grupo de risco: ");
                System.out.println("b - baixo/m - médio/a - alto");
                char risco = tipo.next().charAt(0);
                if (risco == 'b') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 4.");

                } else if (idade < 35 || idade > 64) {
                    System.out.println("Idade exterior a faixa etária");

                } else if (risco == 'm') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 5.");


                } else {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 6.");

                }

            }case 6 -> {
                System.out.println("Insira a idade do pretendente " + nome + ": ");
                int idade = tipo.nextInt();
                System.out.println("Defina o grupo de risco: ");
                System.out.println("b - baixo/m - médio/a - alto");
                char risco = tipo.next().charAt(0);
                if (risco == 'b') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 7.");

                } else if (idade < 65 || idade > 70) {
                    System.out.println("Idade exterior a faixa etária");

                } else if (risco == 'm') {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 8.");


                } else {
                    System.out.println("O Pretendente " + nome + " de " + idade + " anos pertence a categoria 9.");

                }

            }case 7 -> {
                System.out.println("A faixa etária do pretendente " + nome + " é superior a necessária");
                System.out.println(nome + " Impedido de adquirir apólices de seguro");

            }
        }
    }
}
