public class Ex2 {
  public static void main(String[] args) {
    int multiplicando = 5;
    int multiplicador = 1;
    int resultado = 0;

    for (int i = 0; i < 12; i++){
      resultado = multiplicando * multiplicador;
      System.out.printf("%d por %d = %d\n", multiplicando,multiplicador,resultado);
      multiplicador++;

    }
  }
}
