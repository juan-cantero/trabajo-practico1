public class Ex18 {
  public static int getAmountOfFigures(int number) {
    int count =1;
    while (number >= 10) {
      number = number /10;
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(getAmountOfFigures(99));
  }
}
