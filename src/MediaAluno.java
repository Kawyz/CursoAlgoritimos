import java.util.Scanner;

public class MediaAluno{     
   
    static class Numero{//Classe Numero, encapsula e guarda o valor de um numero
        double valor;

        Numero(double valor){//Construtor, inicializa
            this.valor = valor;
        }
    }

    public static void CalculaMedia(Numero nota1, Numero nota2, Numero media){
        Scanner tec = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        nota1.valor = tec.nextDouble();
        
        System.out.println("Segunda nota: ");
        nota2.valor = tec.nextDouble();

        media.valor = (nota1.valor + nota2.valor) / 2;

        System.out.println("----------------------");
        System.out.printf("MEDIA: %.2f", media);

        tec.close();
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Numero nota1 = new Numero(0);
        Numero nota2 = new Numero(0);
        Numero media = new Numero(0);
        Numero falta = new Numero(0);        

        System.out.println("----------------------");
        System.out.println("    NOME DA ESCOLA    ");
        System.out.println("----------------------");

        CalculaMedia(nota1, nota2, media);

        if (media.valor >= 6){
            System.out.println("\nALUNO APROVADO");
        } else if (media.valor < 6){
            falta.valor = 6 - media.valor;
            System.out.println("\nALUNO REPROVADO");
            System.out.printf("FALTOU: %.1f", falta.valor);
        }

        System.out.println("\n----------------------");

        tec.close();
    }
}
