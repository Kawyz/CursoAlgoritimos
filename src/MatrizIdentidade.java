import java.util.Scanner;

public class MatrizIdentidade {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {

            int matrizId[][] = new int[3][3];
            int i;
            int j;

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (i == j) {
                        matrizId[i][j] = 1;
                    } else {
                        matrizId[i][j] = 0;
                    }
                }
            }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(String.format("%-3d", matrizId[i][j]));
                }
                System.out.println();
            }
        }
    }
}
