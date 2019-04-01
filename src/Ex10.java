public class Ex10 {
    public static void main (String[] args) {
      entreUnoYCien();
      entreUnoYCien2();
    }

    public static void entreUnoYCien(){
        int i = 1;
        while (i < 101 ) {
            System.out.println(i);
            i++;
        }
    }
    public static void entreUnoYCien2 (){
        for (int i = 1; i < 101; i++){
            System.out.println(i);
        }
    }
}
