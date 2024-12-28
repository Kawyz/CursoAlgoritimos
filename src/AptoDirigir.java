import java.util.Scanner;

public class AptoDirigir {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Calcula a idade da pessoa e ve se ela esta apta a dirigir
        int idade;
        int anoNasc;
        int anoAtual;
        int faltaIdade;

        System.out.println("----------------------");
        System.out.println("DEPARTAMENTO DE TRANSITO");
        System.out.println("----------------------");

        System.out.println("Ano Atual: ");
        anoAtual = tec.nextInt();

        System.out.println("Ano de Nascimento: ");
        anoNasc = tec.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println("------- STATUS -------");
        System.out.println("IDADE: " + idade);

        if (idade >= 18){
            System.out.println("APTO A TIRAR CARTEIRA");
        } else {
            faltaIdade = 18 - idade;
            System.out.println("INAPTO A TIRAR CARTEIRA");
            System.out.println("ESTARÁ APTO EM: " + faltaIdade + " ANO(S)");
        }
        System.out.println("----------------------");

        tec.close();
    }
}
