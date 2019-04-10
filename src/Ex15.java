public class Ex15 {
  public static StringBuilder printInSeveralBases(int dividend, int base) {
    int divisor = base;
    int remainder;
    String numberToReverse = "";
    StringBuilder numberToPrint = new StringBuilder();

    while (dividend >= divisor ) {
      remainder = dividend % divisor;
      dividend = dividend / divisor;
      numberToReverse +=  remainder;
    }
    numberToReverse +=  dividend;
    numberToPrint.append(numberToReverse);
    numberToPrint.reverse();
    return numberToPrint;
  }
  public static void main(String [] args) {
    for (int i = 32; i <= 64; i++ ) {
      for (int j = 2; j <= 16; j++) {
        System.out.print(printInSeveralBases(i,j) +"  ");

      }
       System.out.println();
    }

  }
}
