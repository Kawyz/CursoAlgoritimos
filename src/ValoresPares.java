import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class ValoresPares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int val[] = new int[7];
        int i;
        int totPar = 0;

        for (i = 0; i < 7; i++){
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            val[i] = tec.nextInt();
        }   
   
        for (i = 0; i < 7; i++){
            if (val[i] % 2 == 0) {
                totPar++;
                System.out.println("Valor PAR na posição " + (i + 1));
            }
        }

        System.out.println("O total de pares foi: " + totPar);    

        tec.close();
    }
}
