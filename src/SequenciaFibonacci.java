public class SequenciaFibonacci {   
    // soma os numeros 0+1+1+2+3+4+5+6

    int C;

    static class Numero{
        int valor;

        Numero(int valor){
            this.valor = valor;
        }
    }

    public static void ProximoFibonacci(Numero A, Numero B){
        int C = A.valor + B.valor;
        System.out.println(C);
        A.valor = B.valor;
        B.valor = C;
    }
    public static void main(String[] args) {
        Numero T1 = new Numero(0);
        Numero T2 = new Numero(1);

        System.out.println(T1.valor);
        System.out.println(T2.valor);

        for (int C = 3; C <= 10; C++){
           ProximoFibonacci(T1, T2);
        }
    }
}