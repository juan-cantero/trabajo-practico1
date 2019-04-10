public class Ex16 {
  public static void printRaices(double a, double b, double c) {
    double x1 = (-b + Math.sqrt(Math.pow(b,2)  - 4*a*b))/2*a;
    double x2 = (-b - Math.sqrt(Math.pow(b,2)  - (4*a*b)))/ 2 * a;
    System.out.println(x1);
    System.out.println(x2);
  }
  public static void main(String[] args) {
    printRaices(2,3,5);
  }
}
