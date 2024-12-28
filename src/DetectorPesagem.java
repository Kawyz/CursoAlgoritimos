import java.util.Scanner;

public class DetectorPesagem {

    public static void topo(double maior){  
        System.out.println("----------------------------------");
        System.out.println("       DETECTOR DE PESADO         ");
        System.out.println("Maior Peso até agora: " + maior + " Kg");
        System.out.println("----------------------------------"); 
    }
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
     
        int i;
        double maior = 0;
        double peso;
        String pesado = "";
        String nome;
        
        topo(maior);
        for (i = 1; i <= 5; i++){
            System.out.println("Digite o nome: ");
            nome = tec.nextLine();
            System.out.println("Digite o peso de " + nome + ": ");
            peso = tec.nextDouble();
            tec.nextLine();

            if (peso > maior){
                maior = peso;
                pesado = nome;
            }   
            topo(maior); //chama 

            tec.close();
        }    
        System.out.println("A pessoa mais pesada foi: " + pesado + " com " + maior + " quilos");
    }      
}