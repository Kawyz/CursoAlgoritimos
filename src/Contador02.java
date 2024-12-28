import java.util.Scanner;

public class Contador02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int opcao;
        int inicio;
        int fim;
        
        System.out.println("=====================");
        System.out.println("         MENU        ");
        System.out.println("=====================");
        System.out.println(" [1] Crescente       ");
        System.out.println(" [2] Decrescente     ");
        System.out.println(" [3] Sair            ");
        System.out.println("=====================");        
        opcao = tec.nextInt();

        if(opcao == 1 || opcao == 2){
            System.out.println("=====================");        
            System.out.println("Inicio:");
            inicio = tec.nextInt();
            System.out.println("---------------------");   
            System.out.println("Fim:     ");
            fim = tec.nextInt();
            System.out.println("=====================");

            switch (opcao) {            
                case 1:
                    do {   
                        System.out.println(inicio);
                        inicio = inicio + 1;  
                    } while (inicio <= fim);
                break;
                case 2:
                    do {
                        System.out.println(inicio);       
                        inicio = inicio - 1;         
                    } while (inicio >= fim);
                break;
                default:
                    break;
            }            
        } else {
            System.out.println("=====================");
            System.out.println("      SAINDO...      ");
            System.out.println("=====================");      
        }
        tec.close();
    }
}
