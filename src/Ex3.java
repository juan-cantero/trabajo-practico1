public class Ex3 {
  public static void main(String[]args) {
    int numero1 = 15;
    int numero2 = 8;
    System.out.println(sumar(numero1,numero2));
    System.out.println(restar(numero1,numero2));
    System.out.println(multiplicar(numero1,numero2));
    System.out.println(dividir(numero1,numero2));
    System.out.println(resto(numero1,numero2));


  }
  public static int sumar(int n1, int n2) {
    return n1 + n2;
  }
  public static int restar(int n1, int n2) {
    return n1 - n2;
  }
  public static int multiplicar(int n1, int n2) {
    return n1 * n2;
  }
  public static int dividir(int n1, int n2) {
    return n1 / n2;
  }
  public static int resto(int n1, int n2) {
    return n1 % n2;
  }

}
