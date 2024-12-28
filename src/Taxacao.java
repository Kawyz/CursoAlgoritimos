import java.util.Scanner;

public class Taxacao {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double valorProduto;
        int porcentImposto;
        double imposto;

        System.out.println("Qual o valor do produto: ");
        valorProduto = tec.nextDouble();

        System.out.println("Porcentagem de Imposto: ");
        porcentImposto = tec.nextInt();

        imposto = (valorProduto * porcentImposto) / 100; 

        System.out.printf("Valor d imposto: %.2f", imposto);

        tec.close();
    }
    
}
