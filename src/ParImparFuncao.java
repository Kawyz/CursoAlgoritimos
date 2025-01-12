import java.util.Scanner;

public class ParImparFuncao {

    public static int ParOuImpar(int X, int Y){
        System.out.println("Valores recebidos: ");
        System.out.println("A = " + X + " | B = " + Y);

        int V = X + Y;

        System.out.println("--------------------");
        System.err.println("Soma dos valores: " + V);

        if (V % 2 == 0){
            System.out.println("Resultado: " + V + " é um número par");
        } else {
            System.out.println("Resultado: " + V + " é um número ímpar");
        }

        System.out.println("-------------------");
        return V;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número:");
        int A = tec.nextInt();
        System.out.println("Digite um número:");
        int B = tec.nextInt();

        ParOuImpar(A,B);     
        
        tec.close();
    }
}
