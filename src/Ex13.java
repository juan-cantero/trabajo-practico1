public class Ex13 {
    public static void main (String[] args) {
        int n = 5;
        numeroTriangular(n);

    }
    public static void numeroTriangular(int n){
        int triangular = 0;
        for (int i = 1; i < n+1; i += 1){
            triangular += i;

            System.out.println(i + " - " + triangular);
        }

    }
}
