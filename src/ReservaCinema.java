import java.util.Scanner;

public class ReservaCinema {

    static Scanner tec = new Scanner(System.in);
    static String B[] = new String[10];
    static char resposta;
    static int cadeira;

    public static void InicializaCadeira(){
        for (int i = 0; i < B.length; i++){
            B[i] = ""; 
         }
    }

    public static void MostraFileira() {
    
        for (int i = 0; i < B.length; i++) {
            if (B[i].equals("")) {
                System.out.print("[ B" + (i + 1) + " ]");
            } else {
                System.out.print("[ -- ]");
            }
        }
        System.out.println("\n-------------------------------------------------------------");
    }

    public static void main(String[] args) {

        InicializaCadeira();

        do {
            MostraFileira();

            System.out.print("Reservar Cadeira: B");
            cadeira = tec.nextInt();

            if (B[cadeira - 1].equals("")) {
                B[cadeira - 1] = "X";
                System.out.println("Cadeira B" + cadeira + " RESERVADA!");
            } else {
                System.out.println("ERRO: Lugar ocupado!");
            }

            System.out.println("Quer reservar outro? S/N");
            resposta = tec.next().charAt(0);
        } while (resposta != 'N' && resposta != 'n');
    }
}
