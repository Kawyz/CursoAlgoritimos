import java.util.Scanner;

public class FatorialFuncao {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int F, N;

        System.out.println("Digite um número: ");
        N = tec.nextLine();


        tec.close();
    }
}

/*import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int contador;
        int fatorial;
        char resposta;

        do {
            System.out.println("Digite um número: ");
            num = tec.nextInt();
            contador = num;
            fatorial = 1;

            do {
                fatorial = fatorial * contador;
                contador = contador - 1;
            } while (contador > 0);
    
            System.out.println("O valor do fatorial de " + num + " é igual a " + fatorial);
            System.out.println("Quer continuar? [S/N]");
            resposta = tec.next().charAt(0);
            
        } while (resposta == 'S' || resposta == 's');

        tec.close();
    }
}
 */