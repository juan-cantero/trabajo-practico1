public class Ex7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        elMenor(a, b);



    }

    public static void elMenor(int a, int b) {

        if (a < b)
          System.out.println(a +" es menor");

        else if (a == b)
            System.out.println("son iguales");
        else
            System.out.println(b +" es menor");
    }
}
