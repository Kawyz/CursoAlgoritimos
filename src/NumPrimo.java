import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int contador = 1;
        int contDiv = 0;

        System.out.println("Digite um numero");
        num = tec.nextInt();
        do{
            if (num % contador == 0) {
               contDiv = contDiv + 1;
            }
            contador = contador + 1;
        } while(contador <= num);

        if (contDiv > 2){
            System.out.println("O valor " + num + " não é primo!");
        } else{
            System.out.println("O valor " + num + " é primo!");
        }

        tec.close();
    }
}
