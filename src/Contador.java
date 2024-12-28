import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int valor;
        int contador = 0;
        int salto;

        System.out.println("Quer contar até quanto?");
        valor = tec.nextInt();

        System.out.println("Qual será o valor do salto?");
        salto = tec.nextInt();
 
        while (contador <= valor) {
            System.out.println(contador);
            contador = contador + salto;
        }        
        
        tec.close();
    }

}