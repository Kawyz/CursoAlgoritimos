import java.util.Scanner;

public class QuantidadeEntre {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int cont; 
        int v;
        int tot = 0;
        int simp = 0;
        
        for (cont = 1; cont <= 6; cont++){
            System.out.println("Digite um valor: ");
            v = tec.nextInt();

            if (v >= 0 && v <= 10){
                tot = tot + 1;          
            }
            if (v % 2 == 1){
                simp = simp + v;
            } 
            
            tec.close();
        }
        System.out.println("Ao todo foram " + tot + " valores entre 0 e 10");
        System.out.println("Nesse intervalo, a soma de impares foi: " + simp);
    }
}
