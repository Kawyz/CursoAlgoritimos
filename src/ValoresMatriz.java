import java.util.Scanner;

public class ValoresMatriz {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)){

            int matriz[][] = new int[4][4];
            int somaDiagonalPrincipal = 0;
            int produtoSegundaLinha = 1;
            int maiorValor3C = 0;
            int l;
            int c;

            for (l = 0; l < 4; l++){
                for (c = 0; c < 4; c++){
                    System.out.print("Digite o valor da Posição: [" + (l + 1) + ", " + (c + 1) + "]: ");
                    matriz[l][c] = tec.nextInt();

                    if (l == c) {
                        somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[l][c];
                    }
                }
            }   

            for (l = 0; l < 4; l++){
                for (c = 0; c < 4; c++){
                    System.out.print(String.format("%-3d", matriz[l][c]));
                }
                System.out.println();
            }

            for (c = 0; c < 4; c++){
                produtoSegundaLinha = produtoSegundaLinha * matriz[1][c];
            }

            for (l = 0; l < 4; l++){
                if (matriz[l][3] > maiorValor3C) {
                    maiorValor3C = matriz[l][2];
                }
            }

            System.out.println("A soma dos valores da Diagonal Principal é: " + somaDiagonalPrincipal);
            System.out.println("O produto dos valores da segunda linha é " + produtoSegundaLinha);
            System.out.println("O maior valor da Terceira Coluna é " + maiorValor3C);
        }
    }
}
