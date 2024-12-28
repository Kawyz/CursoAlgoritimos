import java.util.Scanner;

public class ParImparProced {

    static int n;

    public static void ParOuImpar(int V){ //Método
        System.out.println("O valor de V é: " + V);
        System.out.println("O valor de N é: " + n);
        
        if (V % 2 == 0){
            System.out.println("O número "+ V +" é par");
        } else {
            System.out.println("O número "+ V + " é ímpar");
        }
    }

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = tec.nextInt();

        System.out.println("Digite um número: ");
        int V = tec.nextInt();

        ParOuImpar(V); //Chama o método

        tec.close();
    }    
}