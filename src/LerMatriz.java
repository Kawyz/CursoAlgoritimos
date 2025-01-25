import java.util.Scanner;

public class LerMatriz {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int matriz[][] = new int[3][2];
        int l;
        int c;

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print("Digite um valor da posição: [" + (l + 1) + ", " + (c +1) + "]: ");
                matriz[l][c] = tec.nextInt();
            }
        }

        for (l = 0; l < 3; l++){
            for (c = 0; c < 2; c++){
                System.out.print(String.format("%-3d", matriz[l][c]));
            }
            System.out.println();
        }
    }
}