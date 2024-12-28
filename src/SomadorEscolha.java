import java.util.Scanner;

public class SomadorEscolha{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int n;
        int soma = 0;
        char resposta;

        do {
            System.out.println("Digite o valor");
            n = tec.nextInt();
            tec.nextLine();
            soma = soma + n;
            System.out.println("Voce quer continuar [S/N]?");
            resposta = tec.next().charAt(0);
            tec.nextLine();
        } while (resposta == 'S');

        System.out.println("A soma de todos os valores foi: " + soma);
        
        tec.close();
    }
}