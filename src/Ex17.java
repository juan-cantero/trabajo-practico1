public class Ex17 {
  public static void printEvens(int a, int b) {
    int aux = 0;
    if (b < a) {
      aux = a;
      a = b;
      b = a;
    }
    for (int i = a; i <= b; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }

  }

  public static void main(String [] args) {
    printEvens(5,30);
  }
}
