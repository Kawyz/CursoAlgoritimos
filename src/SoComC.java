import java.util.Scanner;

public class SoComC {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {

            String nome;
            String soC[] = new String[10];
            int c;
            int tot = 0;

            for (c = 0; c < 10; c++) {
                System.out.println("Digite seu nome: ");
                nome = tec.nextLine();

                if (nome.startsWith("C")) {
                    soC[tot] = nome;
                    tot++;
                }
            }

            System.out.println("LISTAGEM FINAL");
            for (c = 0; c < tot; c++) {
                System.out.println(soC[c]);
            }

        }
    }
}
