import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numAlunos; 
        int contador = 1;
        double nota = 0;
        double maiorNota = 0;
        String aluno;
        String melhorAluno = "";

        System.out.println("----------------------------");
        System.out.println("           ESCOLA           ");
        System.out.println("----------------------------");
        System.out.println("Quantos alunos tem na turma?");
        numAlunos = tec.nextInt();
        tec.nextLine();

        while (contador <= numAlunos){
            System.out.println("----------------------------");
            System.out.println("ALUNO " + contador);
            System.out.println("Nome do Aluno: ");
            aluno = tec.nextLine();
            System.out.println("Nota de " + aluno + " : ");
            nota = tec.nextDouble();
            tec.nextLine();

            if (nota > maiorNota){
                maiorNota = nota;
                melhorAluno = aluno;
            }
            contador = contador + 1;
        }
        
        System.out.println("----------------------------");
        System.out.printf("O melhor aproveitamento foi de " + melhorAluno + " com a nota: %.2f", nota);

        tec.close();
    }
}