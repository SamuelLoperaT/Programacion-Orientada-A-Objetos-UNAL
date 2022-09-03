import java.util.Scanner;

public class Punto_7_C4 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Introduzca los valores de A y B: ");
      double a = input.nextDouble();
      double b = input.nextDouble();

      if (Double.compare(a, b) == 0) {
         System.out.println("A y B son iguales");
      } else if (Double.compare(a, b) < 0) {
         System.out.println("A es menor que B");
      } else {
         System.out.println("A es mayor que B");
      }
   }
}
