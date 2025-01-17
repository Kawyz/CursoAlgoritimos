public class SequenciaFibonacci {   
   
    static class Numero{
        int valor;

        Numero(int valor){
            this.valor = valor;
        }
    }

    public static int ProximoFibonacci(Numero A, Numero B){
        int C = A.valor + B.valor;
        System.out.println(C);
        A.valor = B.valor;
        B.valor = C;

        return C;
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