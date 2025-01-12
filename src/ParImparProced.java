import java.util.Scanner;

public class ParImparProced {

    public static void ParOuImpar(int V){
        System.out.println("O valor de V é: " + V);
        
        if (V % 2 == 0){
            System.out.println("O número "+ V +" é par");
        } else {
            System.out.println("O número "+ V + " é ímpar");
        }
    }

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = tec.nextInt();

        ParOuImpar(N);

        tec.close();
    }    
}