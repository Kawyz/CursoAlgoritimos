import java.util.Scanner;

public class PartidaFutebol {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int golsT1;
        int golsT2;
        int diferenca;

        System.out.println("----------------------");
        System.out.println("   TIME01 x TIME02    ");
        System.out.println("----------------------");

        System.out.println("Gols TIME01: ");
        golsT1 = tec.nextInt();
        System.out.println("Gols TIME02: ");
        golsT2 = tec.nextInt();

        diferenca = Math.abs(golsT1 - golsT2);

        System.out.println("----------------------");
        System.out.println("DIFERENCA: " + diferenca);
        
        switch (diferenca) {
            case 0:
                System.out.println("STATUS: EMPATE");
                break;
            case 1, 2, 3, 4:
                System.out.println("STATUS: PARTIDA NORMAL");
                break;
            default:
                System.out.println("STATUS: GOLEADA");
                break;
        }

        System.out.println("----------------------");

        tec.close();
    }
}
