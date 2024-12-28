import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double media;
        double falta;

        System.out.println("----------------------");
        System.out.println("    NOME DA ESCOLA    ");
        System.out.println("----------------------");

        System.out.println("Primeira nota: ");
        nota1 = tec.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = tec.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("----------------------");
        System.out.printf("MEDIA: %.2f", media);

        if (media >= 6){
            System.out.println("\nALUNO APROVADO");
        } else if (media < 6){
            falta = 6 - media;
            System.out.println("\nALUNO REPROVADO");
            System.out.printf("FALTOU: %.1f", falta);
        }
        System.out.println("\n----------------------");

        tec.close();
    }
}
