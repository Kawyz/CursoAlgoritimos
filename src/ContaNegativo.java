import java.util.Scanner;

public class ContaNegativo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int numero;
        int numFim;
        int contador = 0;
        int totalN = 0;

        System.out.println("Quantos números?");
        numFim = tec.nextInt();

        do {
            System.out.println("Digite um numero: ");
            numero = tec.nextInt();
            if (numero < 0){
                totalN = totalN + 1;
            }
            contador = contador + 1;
        } while (contador < numFim);

        System.out.println("Foram digitados " + totalN + " valores negativos");
        
        tec.close();
    }
}
