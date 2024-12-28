import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double tempC;
        double tempF;
        
        System.out.println("Qual a temperatura aqui? ");
        tempF = tec.nextDouble();

        tempC = (tempF - 32) / 1.8;

        System.out.printf("A temperatura no Brasil é de: %.2f", tempC);

        tec.close();
    }
}
