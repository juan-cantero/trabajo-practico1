public class Ex6 {
  public static void main(String[] args){
    int rectanguloBase = 10;
    int rectanguloAltura = 5;

    double circuloRadio = 5;

    double esferaRadio = 10;

    double catetoA = 4;
    double catetoB = 3;




  }
  public static int getPerimetroRectangulo(int base, int altura) {
    return base * 2 + altura * 2;
  }

  public static int getAreaRectangulo(int base, int altura) {
    return base * altura;
  }

  public static double getPerimetroCirculo(double radio) {
    return 2 * Math.PI * radio;
  }

  public static double getAreaCirculo(double radio) {
    return Math.PI * radio * radio;
  }

  public static double getVolumenEsfera(double radio) {
    return (4/3) * Math.PI * Math.pow(radio,3);
  }

  public static double getAreaEsfera(double radio) {
    return 4 * Math.PI * radio * radio;
  }

  public static double getHipotenusa(double catA, double catB) {
    return Math.sqrt(Math.pow(catA,2) + Math.pow(catB,2));
  }
}
