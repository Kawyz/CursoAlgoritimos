import java.util.Scanner;

public class TorneioDeFutebol {
    public static void main(String[] args) {
        try (Scanner tec = new Scanner(System.in)) {

            int i;
            int j;

            String time[] = new String[3];

            System.out.println("---------------------");
            System.out.println("CAMPEONATO DE FUTEBOL");
            System.out.println("---------------------");

            for (i = 0; i < 3; i++) {
                System.out.println("Digite o nome do time: ");
                time[i] = tec.nextLine();
            }

            System.out.println("------------------");
            System.out.println("TABELA DE PARTIDAS");
            System.out.println("------------------");

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (i != j) {
                        System.out.println(time[i] + " [ ] x [ ] " + time[j]);
                    }
                }
            }
        }
    }
}
