import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int anoAtual;
        int anoNascimento;
        int idade;
           
        System.out.println("Ano atual: ");
        anoAtual = tec.nextInt();

        System.out.println("Ano de nascimento: ");
        anoNascimento = tec.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println("Idade atual: " + idade);

        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        tec.close();
    }
}
