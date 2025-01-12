import java.util.Scanner;

public class ParImparProced {

    static int N;

    public static void ParOuImpar(int V){ //Método
        System.out.println("O valor de V é: " + V);
        //System.out.println("O valor de N é: " + N);
        
        if (V % 2 == 0){
            System.out.println("O número "+ V +" é par");
        } else {
            System.out.println("O número "+ V + " é ímpar");
        }
    }

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        N = tec.nextInt();

        ParOuImpar(N); //Chama o método

        tec.close();
    }    
}