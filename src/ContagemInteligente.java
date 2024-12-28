import java.util.Scanner;

public class ContagemInteligente {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
                
        int inicio;
        int fim;
        
        System.out.println("--------------------");
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");

        System.out.println("INICIO:");
        inicio = tec.nextInt();
        System.out.println("FIM: ");
        fim = tec.nextInt();
 
        System.out.println("--------------------");
        System.out.println("      CONTANDO      ");
        System.out.println("--------------------");

        if (inicio < fim){
            while (inicio <= fim) {
                System.out.println(inicio);
                inicio = inicio + 1;
            } 
        } else if (inicio > fim){
            while (inicio >= fim){
                System.out.println(inicio);
                inicio = inicio - 1;
            }
        }       

        tec.close();
    }
}
