import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double valorEmprestimo;
        double juros;
        int parcelas;
        double valorPagar;
        double valorParcelas;

        System.out.println("Qual o valor do emprestimo?");
        valorEmprestimo = tec.nextDouble();

        System.out.println("Qual a porcentagem de acrescimo?");
        juros = tec.nextDouble();

        valorPagar = valorEmprestimo + (valorEmprestimo * juros) / 100;;
        
        System.out.printf( "Valor a pagar: %.2f", valorPagar);

        System.out.println( "\nQuantidade de parcelas? ");
        parcelas = tec.nextInt();

        valorParcelas = valorPagar / parcelas;

        System.out.printf("Vou pagar " + parcelas + " parcelas de R$: %.2f", valorParcelas);

        tec.close();
    }
}
