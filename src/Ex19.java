public class Ex19 {
  public static boolean isPrime(int num) {
    boolean isprime = true;
    for (int i = num -1; i > 1; i--) {
      if (num % i == 0)
        isprime = false;
    }
    return isprime;
  }
  public static void main(String [] args) {
    System.out.println(isPrime(9));
  }
}
