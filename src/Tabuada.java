import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int numero;
        int numeroFim;
        int contador = 0;
        int soma = 0;

        System.out.println("Quer ver a tabuada de qual numero?");
        numero = tec.nextInt();

        System.out.println("Até qual número?");
        numeroFim = tec.nextInt();

        do {
            System.out.println(numero + " X " + contador + " = " + soma);
            contador = contador + 1;
            soma = contador * numero;
        } while (contador <= numeroFim);     

        tec.close();
    }
}
