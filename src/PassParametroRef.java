public class PassParametroRef {
    // Passagem de parâmetro por REFERÊNCIA(Usando objetos)

    //Classe p encapsular os valores(Simula a passagem por referencia)
    static class Numero{// Cria classe Numero, que serve para encaps/guardar o valor de um nmr
        int valor;

        Numero(int valor){//Construtor, inicializa o valor do objeto, Quando criamos um Número, devemos passar o valor inicial
            this.valor = valor;
        }
    }

    //Procedimento Soma, altera os valores de A e B
    public static void Soma(Numero A, Numero B){
        //Trabalha com os valores originais
       A.valor = A.valor + 1; //Modifica o valor original de A
       B.valor = B.valor + 2; //Modifica o vlr original de B
       
       System.out.println("Valor de A = " + A.valor);//Mostra o valor alterado
       System.out.println("Valor de B = " + B.valor);//Mov Val Alt
       System.out.println("Soma de A + B = " + (A.valor + B.valor));//Soma dos valores
    }

    public static void main(String[] args) {
        //Declara e inicializa as variáveis
        Numero X = new Numero(4); //X = 4
        Numero Y = new Numero(8);//Y = 8

        //Chama o procedimento Soma
        Soma(X, Y);

        //Exibe os valores de X e Y após o procedimento
        System.out.println("Valor de X =" + X.valor);
        System.out.println("Valor de Y =" + Y.valor);
    }
}
