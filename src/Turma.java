import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {

            String nome[] = new String[4];
            double n1[] = new double[4];
            double n2[] = new double[4];
            double media[] = new double[4];
            double somaMedias = 0;
            double mediaTurma = 0;
            int tot = 0;
            int i;

            for (i = 0; i < 4; i++) {
                System.out.println("Aluno " + (i + 1));
                System.out.println("Nome: ");
                nome[i] = tec.nextLine();
                System.out.println("Primeira Nota: ");
                n1[i] = tec.nextDouble();
                tec.nextLine();
                System.out.println("Segunda Nota: ");
                n2[i] = tec.nextDouble();
                tec.nextLine();

                media[i] = (n1[i] + n2[i]) / 2;
                somaMedias = somaMedias + media[i];

            }

            mediaTurma = somaMedias / 4;

            System.out.println(" LISTAGEM DE ALUNOS ");
            System.out.println("--------------------");

            for (i = 0; i < 4; i++) {
                System.out.printf("%-15s %.1f%n", nome[i], media[i]);

                if (media[i] > mediaTurma) {
                    tot = tot + 1;
                }
            }

            System.out.printf("Ao todo temos %d alunos acima da média da turma, que é: %.2f", tot, mediaTurma);

        }
    }
}
