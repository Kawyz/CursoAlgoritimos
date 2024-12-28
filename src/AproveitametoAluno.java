import java.util.Scanner;

public class AproveitametoAluno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
       
        double nota1;
        double nota2;
        double media;

        System.out.println("----------------------");
        System.out.println("    NOME DA ESCOLA    ");
        System.out.println("----------------------");

        System.out.println("Primeira nota: ");
        nota1 = tec.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = tec.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("----------------------");
        System.out.printf("MEDIA: %.1f", media);

        if (media >= 9){
            System.out.println("\nAPROVEITAMENTO: A");
        } else if (media >= 8){
            System.out.println("\nAPROVEITAMENTO: B");
        } else if (media >= 7){
            System.out.println("\nAPROVEITAMENTO: C");
        } else if (media >= 6){
            System.out.println("\nAPROVEITAMENTO: D");
        } else {
            System.out.println("\nAPROVEITAMENTO: F");        }

        System.out.println("----------------------");

        tec.close();
    }
}
