import java.util.ArrayList;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("Notas do aluno");
        Scanner notaDisciplina = new Scanner(System.in);

        ArrayList<String> ficha = new ArrayList<>();

        char continuar;

        do {
            System.out.println("Digite o nome da disciplina: ");
            String disciplina = notaDisciplina.nextLine();
            System.out.println("Digite o nome do aluno: ");
            String nome = notaDisciplina.nextLine();
            System.out.println("Digite a matrícula do aluno: ");
            int matricula = notaDisciplina.nextInt();

            notaDisciplina.nextLine();

            System.out.println("Digite a nota da prova A1 do " + nome + ": ");
            double a1 = notaDisciplina.nextDouble();
            System.out.println("Digite a nota da prova A2 do " + nome + ": ");
            double a2 = notaDisciplina.nextDouble();
            System.out.println("Digite a nota do trabalho do " + nome + ": ");
            double trabalho = notaDisciplina.nextDouble();

            double media = (a1 + a2 + trabalho) / 3;
            double geral = a1 + a2 + trabalho;

            if (media >= 6) {
                if (geral < 7) {
                    double notaNecessaria = 7 - geral;
                    System.out.println("O aluno " + nome + " precisa obter " + notaNecessaria + " na prova final");
                    System.out.println("Nota: " + geral);
                } else {
                    System.out.println("O aluno " + nome + " não precisa da prova final");
                    System.out.println("Nota: " + geral);
                }
            } else {
                System.out.println("O aluno " + nome + " precisa melhorar a média para evitar a prova final");
                System.out.println("Média Atual: " + media);
            }

            ficha.add(nome + " - " + matricula + " Nota A1: " + a1 + " Nota A2: " + a2 + " Nota Trabalho: " + trabalho);

            System.out.println("Deseja permanecer no programa? ");
            System.out.println("Digite s ou n: ");
            continuar = notaDisciplina.next().charAt(0);

            notaDisciplina.nextLine();

        } while (continuar != 'n');

        System.out.println("Lista de Alunos:");
        for (String alunoInfo : ficha) {
            System.out.println(alunoInfo);
        }
    }
}

