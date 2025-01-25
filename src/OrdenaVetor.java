import java.util.Scanner;

public class OrdenaVetor {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {

            int vet[] = new int[10];
            int i;
            int j;
            int aux;

            for (i = 0; i < 10; i++) {
                System.out.println("Digite um valor: ");
                vet[i] = tec.nextInt();
            }

            for (i = 0; i < 9; i++) {
                for (j = (i + 1); j < 10; j++) {
                    if (vet[i] > vet[j]) {
                        aux = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux;
                    }
                }
            }

            for (i = 0; i < 10; i++) {
                System.out.println("{" + vet[i] + "}");
            }

            tec.close();
        }
    }
}
