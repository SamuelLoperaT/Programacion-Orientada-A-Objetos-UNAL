import java.util.Scanner;

public class Punto_10_C4 {
   public static void main(String[] args) {
      double pago = 50000;
      Scanner input = new Scanner(System.in);

      System.out.println("Nombre: ");
      String nombre = input.nextLine();
      System.out.println("Numero de inscripcion: ");
      int numeroInscripcion = input.nextInt();

      System.out.println("Patrimonio: ");
      double patrimonio = input.nextDouble();
      System.out.println("Estrato: ");
      int estrato = input.nextInt();

      if (patrimonio > 2000000 && estrato > 3) {
         pago += patrimonio * 0.03;
      }

      System.out.println(
            "El estudiante " + nombre + " con numero de inscripcion " + numeroInscripcion + " debe de pagar " + pago);
   }
}
