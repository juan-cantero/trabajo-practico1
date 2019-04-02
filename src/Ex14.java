import java.util.Scanner;
public class Ex14 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(primerosPares(n));

    }
    public static int primerosPares(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i += 2)
            suma += i;
        return suma;
    }

}
