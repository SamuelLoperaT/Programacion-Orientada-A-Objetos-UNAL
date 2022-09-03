import java.lang.Math;
import java.util.Scanner;

public class ejercicio_19 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      triangulo tr1 = new triangulo();
      tr1.definir_altura(input);
      System.out.println("El perimetro del triangulo es: " + tr1.perimetro());
      System.out.println("La altura del triangulo es: " + tr1.altura());
      System.out.println("El area del triangulo es: " + tr1.area());
   }

}

class triangulo {
   private double lado;

   void definir_altura(Scanner input) {
      System.out.println("Ingrese el valor del lado para el triangulo: ");
      this.lado = input.nextDouble();
   }

   double perimetro() {
      return this.lado * 3;
   }

   double altura() {
      return Math.sqrt(Math.pow(this.lado, 2) - Math.pow(this.lado / 2, 2));
   }

   double area() {
      return this.lado * this.altura() / 2;
   }
}
