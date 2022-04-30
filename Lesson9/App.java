public class App {
    
    public static void main(String[] args) {
        int[] a = new int[]{2,5,7,8};

        Solver f = (int el, int ell) -> el+ell;
        System.out.println(reduce(a,f));
    }

/* Реализация reduce как в питоне с начальным значением
    public static int reduce (int[] x, Solver f, int a) {
        
        for (int i=0; i<x.length; i++){
            a = f.solve(x[i],a);
        }
        return a;
    }*/
// Реализация reduce как в задании
    public static int reduce (int[] x, Solver f) {
        int a = x[0];
        for (int i=1; i<x.length; i++){
            a = f.solve(x[i],a);
        }
        return a;
    }
}
