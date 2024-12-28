import java.util.Scanner;

public class SomaFuncao {

    public static int Soma(int X, int Y){
        return X + Y;
    }
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int V1, V2;

        System.out.println("Digite o primeiro valor: ");
        V1 = tec.nextInt();

        System.out.println("Digite o segundo valor: ");
        V2 = tec.nextInt();

        int S = Soma(V1, V2);
        System.out.println("A soma entre " + V1 + " e " + V2 + " é igual à: " + S);

        tec.close();
    }
}
