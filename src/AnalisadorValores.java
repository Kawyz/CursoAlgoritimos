import java.util.Scanner;

public class AnalisadorValores {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int cont;
        int val;
        int sval = 0;
        int div = 0;
        int vnull = 0;
        double soma = 0;
        double media;

        for (cont = 1; cont <= 5; cont++){
            System.out.println("Digite o " + cont + "º valor: ");
            val = tec.nextInt();
            soma = soma + val;

            if (val % 5 == 0){
                div = div + 1;
            }
            if (val == 0){
                vnull = vnull + 1;
            }
            if (val % 2 == 0){
                sval = sval + val;
            }  
            
            tec.close();
        }

        media = soma / 5;

        System.out.println("A soma entre os valores é " + soma);
        System.out.printf("A média entre os valores é: %.1f", media);
        System.out.println("\nValores divisiveis por cinco: " + div);
        System.out.println("Valores nulos: " + vnull);
        System.out.println("A soma dos valores pares é: " + sval);
       
    }
}