import java.util.Scanner;

public class SeletorPessoas {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        char sex;
        char resposta;
        int idade;
        int cabelo;
        int homemCerto = 0;
        int mulherCerta = 0;

        do {
            System.out.println("======================");
            System.out.println("  SELEÇÃO DE PESSOAS  ");
            System.out.println("======================");
            System.out.println("Qual o sexo? [F/M]");
            sex = tec.next().charAt(0);
            System.out.println("Qual a idade?");
            idade = tec.nextInt();
            System.out.println("Qual a cor do cabelo?");
            System.out.println("----------------------");
            System.out.println("[1] Preto ");
            System.out.println("[2] Castanho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");    
            cabelo = tec.nextInt();

            if (sex == 'M' && idade > 18 && cabelo == 2) {
                homemCerto = homemCerto + 1;
            }
             if (sex == 'F' && idade >= 25 && idade <= 30 && cabelo == 3){
                mulherCerta = mulherCerta + 1;
            }

            System.out.println("Quer Continuar? [S/N]");
            resposta = tec.next().charAt(0);
        } while (resposta == 'S');

        System.out.println("======================");
        System.out.println("   RESULTADO FINAL    ");
        System.out.println("======================");
        System.out.println("Total de homens com mais de 18 e cabelos castanhos: " + homemCerto);
        System.out.println("Total de mulheres entre 25 e 30 e cabelos loiros: " + mulherCerta);

        tec.close();
    }
}
