public class PassParametroVal {
    //Passagem de parâmetro por VALOR

    //Método Soma, não altera os valores originais de A e B
    public static void Soma(int A, int B){
        //Trabalha com as CÓPIAS de A e B
        A = A + 1; 
        B = B + 2; 
       
       System.out.println("Valor de A = " + A);//Mostra o valor alterado
       System.out.println("Valor de B = " + B);
       System.out.println("Soma de A + B = " + (A + B));//Soma dos valores
    }

    public static void main(String[] args) {
        //Declara e inicializa as variáveis
        int X = 4; //X = 4
        int Y = 8;//Y = 8

        //Chama o método Soma
        Soma(X, Y);

        //Exibe os valores originais, que não foram alterados
        System.out.println("Valor de X =" + X);
        System.out.println("Valor de Y =" + Y);
    }
}
