import java.util.Scanner;

public class DependentesFuncionario {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome;
        double salario;
        double novoSal;
        int dependentes;

        System.out.println("Qual o nome do funcionario:");
        nome = tec.nextLine();

        System.out.println("Qual o salario do funcionario:");
        salario = tec.nextDouble();

        System.out.println("Numero de dependentes:");
        dependentes = tec.nextInt();

        switch (dependentes) {
            case 0:
                novoSal = salario + (salario * 5/100);
                break;
            case 1, 2, 3: 
                novoSal = salario + (salario * 10/100);
                break;
            case 4, 5, 6:
                novoSal = salario + (salario * 15/100);
                break;
            default:
                novoSal = salario + (salario * 18/100);
                break;
        }

        System.out.printf("Novo Salario de " + nome + "será de R$%.2f", novoSal);
        
        tec.close();
    }
}
