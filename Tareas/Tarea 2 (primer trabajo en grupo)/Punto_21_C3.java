import java.util.Scanner;

public class ejercicio_21 {
   public static void main(String[] args) {
      triangulo tr1 = new triangulo();
      Scanner input = new Scanner(System.in);
      System.out.println("Introduzca los lados de el traingulo: ");
      tr1.pedirLado(input);
      System.out.println("El perimetro del triangulo es: " + tr1.perimetro());
      System.out.println("El semiperimetro del triangulo es: " + tr1.perimetro() / 2);
      System.out.println("El area del triangulo es: " + tr1.area());
   }
}

class triangulo {
   double[] lados = { 0, 0, 0 };

   void pedirLado(Scanner input) {
      for (int i = 0; i < 3; i++) {
         this.lados[i] = input.nextDouble();
      }
   }

   double perimetro() {
      double perimetro = 0;
      for (int i = 0; i < 3; i++) {
         perimetro += this.lados[i];
      }
      return perimetro;
   }

   double area() {
      double p = perimetro();
      double area = 1;
      for (int i = 0; i < lados.length; i++) {
         area = this.lados[i] * area;
      }
      return Math.sqrt(p / 2 * area);
   }
}
