import java.util.Scanner;

public class ParImparFuncao {

    public static String ParOuImpar(int V){
        if (V % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = tec.nextInt();

        String R = ParOuImpar(N);

        System.out.println("O número " + N + " é um valor " + R);

        tec.close();
    }
}
