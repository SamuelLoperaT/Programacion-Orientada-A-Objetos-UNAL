import java.util.Scanner;

public class Punto_11_C4 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Introduzca los 3 enteros");
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      if (a > b && a > c) {
         System.out.println("El numero mayor es " + a);
      } else if (b > a && b > c) {
         System.out.println("El numero mayor es " + b);
      } else {
         System.out.println("El numero mayor es " + c);
      }
   }
}
