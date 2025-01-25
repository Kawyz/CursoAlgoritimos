import java.util.Scanner;

public class CorrigindoProvas {
    static Scanner tec = new Scanner(System.in);

    static String aluno[] = new String[3];
    static String prova[] = new String[5];
    static String gabarito[] = new String[5];
    static int nota[] = new int[3];
    static double media;
    static double soma;
    static int j;

    public static void CadastroGabarito() {
        System.out.println("CADASTRO DE GABARITO");
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = tec.nextLine();
        }
    }

    public static int CadastroProva() {
        int i;
        int notaFinal = 0;

        for (i = 0; i < 5; i++){
            System.out.println("Questão " + (i + 1) + ": ");
            prova[i] = tec.nextLine();

            if (prova[i].equalsIgnoreCase(gabarito[i])) {
                notaFinal = notaFinal + 2;
            }
        }
        return notaFinal;
    }

    public static void main(String[] args) {
        
        CadastroGabarito();

            for (j = 0; j < 3; j++) {
                System.out.println("-----------------");
                System.out.println("Aluno(a) " + (j + 1) + ": ");
                System.out.println("-----------------");
                System.out.print("Nome: ");
                aluno[j] = tec.nextLine();
                nota[j] = CadastroProva();
                soma = soma + nota[j];
            }    


            System.out.println("NOTAS FINAIS");
            System.err.println("------------");
            for (j = 0; j < 3; j++){
                System.out.println(aluno[j] + ": " + nota[j]);
            }
            media = soma / 3;
            System.err.println("------------");
            System.out.println("Media da turma: " + media);

        
    }
}