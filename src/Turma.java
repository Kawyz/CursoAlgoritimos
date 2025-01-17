import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome[] = new String[4];
        double n1[] = new double[4];
        double n2[] = new double[4];
        double media[] = new double[4];
        int i;

        for (i = 0; i < 4; i++){
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
        }

        System.out.println(" LISTAGEM DE ALUNOS ");
        System.out.println("--------------------");
        
        for (i = 0; i < 4; i++){
            System.out.printf("%-15s %.2f%n", nome[i],  media[i]);
        }

        tec.close();
    }
}
