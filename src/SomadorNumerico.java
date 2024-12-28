import java.util.Scanner;

public class SomadorNumerico{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int n;
        int contador = 1;
        int soma = 0;
        int valor;
        int maior = 0 ;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite a quantidade de valores:");
        valor = tec.nextInt();

        while (contador <= valor) {
            System.out.println("Digite o " + contador + "º valor");
            n = tec.nextInt();
            if (n > maior){
                maior = n;
            } else if (n < menor){
                menor = n;
            }
            soma = soma + n;
            contador = contador + 1;
        }
               
        System.out.println("A soma de todos os valores foi: " + soma);
        System.out.println("O maior numero foi: " + maior);
        System.out.println("O menor numero foi: " + menor);

        tec.close();
    }

}