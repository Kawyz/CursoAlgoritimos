import java.util.Scanner;

public class ValoresPares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int val[] = new int[7];
        int i;
        int totPar = 0;

        for (i = 0; i < 7; i++){
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            val[i] = tec.nextInt();

            if (val[i] % 2 == 0) {
                totPar++;
            }
            
        }

        System.out.println("O total de pares foi: " + totPar);          
   
        tec.close();
    }
}
