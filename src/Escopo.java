public class Escopo {//Global

    static int N1, N2;
    //Static torna acessivel em nível global(método/main)
    
    public static void Rotina(int A, int B){//Local
        int X = A;
        int Y = B;

        System.out.println(N1 + ", " + N2 + ", " + A + ", " + B + ", " + X + ", " + Y);
    }
    

    public static void main(String[] args) {
        N1 = 5;
        N2 = 3; 
    
        Rotina(N2, N1);
        System.out.println(N1 + ", " + N2);
    }
}
