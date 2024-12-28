import java.util.Scanner;

public class SistemaDoacao {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int doacao;
        double valor;
        boolean cancelaDoacao = false;

        System.out.println(" -------------------------- ");
        System.out.println("     SISTEMA DE DOAÇÕES     ");
        System.out.println(" -------------------------- ");
        System.out.println(" Muito obrigada por ajudar!");
        System.out.println(" [1] para doar R$10");
        System.out.println(" [2] para doar R$25");
        System.out.println(" [3] para doar R$50");
        System.out.println(" [4] para doar outros valores");
        System.out.println(" [5] para cancelar ");
        doacao = tec.nextInt();

        switch (doacao) {
            case 1:
               valor = 10; 
                break;
            case 2:
                valor = 25;            
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.println("Qual o valor que deseja doar?");
                valor = tec.nextDouble();              
                break;
            case 5:
                cancelaDoacao = true;    
            default:
                valor = 0;
                break;
        }

        if(cancelaDoacao){
            System.out.println(" -------------------------- ");
            System.out.println("      DOAÇÃO CANCELADA      ");
            System.out.println(" -------------------------- ");
        } else{
            System.out.println(" -------------------------- ");
            System.out.printf(" SUA DOAÇÃO FOI DE R$%.2f", valor);
            System.out.println("\n      MUITO OBRIGADO!      ");
            System.out.println(" -------------------------- ");
        }

        tec.close();         
    }
}
