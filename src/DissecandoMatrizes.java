import java.util.Scanner;

public class DissecandoMatrizes {
    static Scanner tec = new Scanner(System.in);

    static int matriz[][] = new int[4][4];
    static int opcao;
    static int l;
    static int c;

    public static void MostraMatriz() {
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.print(String.format("%-3d", matriz[l][c]));
            }
            System.out.println();
        }
    }

    public static void DiagonalPrincipal() {
        for (l = 0; l < 4; l++) {
            System.out.print(String.format("%-3d", matriz[l][c]));
            for (int t = 0; t < l; t++) {
                System.out.print("   ");
            }
        }
    }

    public static void TrianguloSuperior() {
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                if (c > l) {
                    System.out.print(String.format("%-3d", matriz[l][c]));
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void TrianguloInferior() {
        System.out.println("Triângulo Inferior:");
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                if (c < l) {
                    System.out.print(String.format("%-3d", matriz[l][c]));
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        for (l = 0; l < 4; l++){
            for (c = 0; c < 4; c++){
                System.out.print("Digite valor para a posição [" + (l + 1) + ", " + (c + 1) + "]: ");
                matriz[l][c] = tec.nextInt();
            }
        }

        do {
            System.out.println();
            System.out.println("    MENU DE OPÇÔES    ");
            System.out.println("======================");
            System.out.println("[1] Mostrar a Matriz");
            System.out.println("[2] Diagonal Principal");
            System.out.println("[3] Triangulo Superior");
            System.out.println("[4] Triangulo Inferior");
            System.out.println("[5] Sair");

            do {
                System.out.println("============ OPÇÂO: ");
                opcao = tec.nextInt();
            } while (opcao >= 1 && opcao <= 5);

            switch (opcao) {
                case 1:
                    MostraMatriz();
                    break;
                case 2:
                    DiagonalPrincipal();
                    break;
                case 3:
                    TrianguloSuperior();
                    break;
                case 4:
                    TrianguloInferior();
                    break;
                case 5: 
                    System.out.println("ENCERRANDO...");
                    break;
                default: 
                System.out.println("Opção Inválida");
            }

            System.out.println();

        } while (opcao != 5);
    }
}
