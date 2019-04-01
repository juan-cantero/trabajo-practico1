public class Ex5 {
  public static void main(String[] args) {
    double grados = 20;
    System.out.printf("20 grados celsius son %f",aFahrenheit(grados));

  }
  public static double aFahrenheit(double grados) {
    return grados * 1.8 + 32;
  }
}
