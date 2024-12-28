import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double reais;
        double dolar;
        double valorDolar;
        int contador = 1;
        int repeticoes;

        System.out.println("Valor atual do dolar: ");
        valorDolar = tec.nextDouble();

        System.out.println("Informe a quantidade de conversões:");
        repeticoes = tec.nextInt();

        while(contador <= repeticoes){
            System.out.println("\nValor em reais: ");
            reais = tec.nextDouble();           

            dolar = reais / valorDolar;

            System.out.printf("Valor em dolar: %.2f", dolar);
            contador = contador + 1;
        }        

        tec.close();
    }
}
