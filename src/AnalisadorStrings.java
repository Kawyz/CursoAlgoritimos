import java.util.Scanner;

public class AnalisadorStrings {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = tec.nextLine();

        int Q1 = nome.length();
        int Q2 = Q1 - 1;

        char letra = 'A';

        System.out.println("Total de letras do seu nome: " + nome.length());
        System.out.println("Seu nome em letras maiusculas: " + nome.toUpperCase());
        System.out.println("Seu nome em letras minusculas: " + nome.toLowerCase());
        System.out.println("A primeira letra do seu nome é: " + nome.substring(0,1).toUpperCase());
        System.out.println("A ultima letra do seu nome é: " + nome.substring( Q2, Q1).toLowerCase());
        System.out.println("Seu nome tem a letra A na posição: " + nome.indexOf('a') );
        System.out.println("O codigo da letra A é: " + (int) letra);     

        for (int C = nome.length() - 1; C >= 0; C--){
            System.out.print(nome.charAt(C));
        }

        tec.close();
    }
}
