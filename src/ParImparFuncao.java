import java.util.Scanner;

public class ParImparFuncao {
    
    static int V;
    static int R;
   
    public static int ParOuImpar (int V, int R){
        System.out.println("O valor de V é: " + V);
        System.out.println("O valor de R é: " + R);

        if (V % 2 == 0){
            System.out.println("O número " + V + " é par");
        } else {
            System.out.println("O número " + V + " é ímpar");
        }

        return V;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número:");
        

    }
}
