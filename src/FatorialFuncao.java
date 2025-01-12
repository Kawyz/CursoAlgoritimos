import java.util.Scanner;

public class FatorialFuncao {

    public static int calcularFatorial(int num) {

        int resultado = 1;

        for (int i = num; i > 0; i--) {
            resultado *= i; // multiplica e atribui a i
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Digite um número: ");
            int num = tec.nextInt();

            int resultado = calcularFatorial(num);
          
            System.out.println("O fatorial de " + num + " é igual a " + resultado);
           
            System.out.println("Quer continuar? [S/N]");
            resposta = tec.next().toUpperCase().charAt(0);//trata a entrada do usuário

        } while (resposta == 'S');

        tec.close();
    }
}