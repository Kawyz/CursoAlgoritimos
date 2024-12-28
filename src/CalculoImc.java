import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double altura;
        double massa;
        double imc;

        System.out.println("Massa (Kg): ");
        massa = tec.nextDouble();

        System.out.println("Altura (m): ");
        altura = tec.nextDouble();

        imc = massa / Math.pow(altura, 2);

        System.out.printf("IMC: %.2f", imc);

        if (imc < 17) {
            System.out.println("\nMuito abaixo do peso");
        } else if (imc >= 17 & imc < 18.5) {
            System.out.println("\nAbaixo do peso");
        } else if (imc >= 18.5 & imc < 25){
            System.out.println("\nParabéns, você está no seu peso ideal!");
        } else if (imc >= 25 & imc < 30){
            System.out.println("\nSobrepeso");
        } else if (imc >= 30 & imc < 35){
            System.out.println("\nObesidade");
        } else if (imc >= 35 & imc < 40){
            System.out.println("\nObesidade Severa");
        } else {
            System.out.println("\nObesidade Morbida");
        }

        tec.close();
    }
}