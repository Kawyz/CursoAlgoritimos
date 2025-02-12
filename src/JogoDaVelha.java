import java.util.Scanner;

public class JogoDaVelha {
    static Scanner tec = new Scanner(System.in);
    
    static char[][] v = new char[3][3];
    static int l;
    static int c;
    static int contador;
    static int posicao;
    static char simb;
    static boolean r;

    public static void MostraVelha(){
        System.out.println("+---+---+---+");
        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print("| " + v[l][c] + " ");
            }
            System.out.print(" |");
            System.out.println();
            System.out.println("+---+---+---+");
        }
    }

    public static void MudaJogador(){
        if (simb == 'X') {
            simb = 'O';
        } else {
            simb = 'X';
        }

    }

    public static boolean Jogar(char s, int p){
        boolean mudou = false;

        int l = (p - 1) / 3;
        int c = (p - 1) % 3;

        if (v[l][c] != 'X' && v[l][c] != 'O') {
            v[l][c] = s;
            mudou = true;
        }
        return mudou;
    }

    public static boolean TerminouVelha(){

        //Linha
        for (l = 0; l < 3; l++){
            if ((v[l][0] == v[l][1]) && (v[l][1] == v[l][2])) {
                return true;
            }
        }

        //Coluna
        for (c = 0; c < 3; c++){
            if ((v[c][0] == v[c][1]) && (v[c][1] == v[c][2])) {
                return true;
            }
        }

        //Diagonal
        if ((v[0][0] == v[1][1]) && (v[1][1] == v[2][2])) {
            return true;
        }
        if ((v[0][2] == v[1][1]) && (v[1][1] == v[2][0])) {
            return true;
        }
        
        //Velha (todos os espaços preenchidos)
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                if ((v[l][c] != 'X') && (v[l][c] != 'O')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        simb = 'X';

        //Contador 1 à 9
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                v[l][c] = (char)(contador + '1');
                contador++;
            }
        }

        MostraVelha();

        do{
            do{
                System.out.println("Vai jogar [" + simb + "] em qual posição (1-9)?");
                posicao = tec.nextInt();
                r = Jogar(simb, posicao);
                if (!r) {
                    System.out.println("JOGADA INVÁLIDA! Tente novamente");
                }
            } while (!r);

            MudaJogador();
            MostraVelha();

        } while (!TerminouVelha());
        System.out.println("Fim de Jogo!");
    }
}
