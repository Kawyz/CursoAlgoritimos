import java.util.Scanner;

public class MatrizPar {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int valores[][] = new int[3][3];
        int totPar = 0;
        int l;
        int c;

        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print("Digite o valor da posição: [" + (l + 1) + ", " + (c + 1) + "]: ");
                valores[l][c] = tec.nextInt();
            }
        }

        System.out.println(" MATRIZ ");
        System.out.println("--------");
        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                if (valores[l][c] % 2 == 0) {
                    System.out.print("{" + String.format("%-3d", valores[l][c]) + "}");
                    totPar = totPar + 1;
                } else {
                System.out.print(String.format("%-3d", valores[l][c]));
                }
            }
            System.out.println();
        }
        System.out.println("Ao todo foram digitados " + totPar + " valores PARES");
    }
}
