import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int v[] = new int[6];
        int c;
        
        for (c = 0; c < 6; c++){
            System.out.println("Digite o " + (c + 1) + "º valor: ");
            v[c] = tec.nextInt();
            
            tec.close();
        }

        for (c = 0; c < 6; c++){
            System.out.printf(" {%d}", v[c]);
        }

        
    }
}
