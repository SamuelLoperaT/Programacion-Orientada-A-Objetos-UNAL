import java.util.Scanner;

public class ejercicio_18 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      empleado em1 = new empleado();
      em1.obtenerDatos(input);
      em1.mostrarInformacion();
   }
}

class empleado {
   int codigo;
   String nombre = "";
   int horas;
   double valorHora;
   double retencion;

   void obtenerDatos(Scanner input) {
      System.out.println("Introduzca el codigo del empelado: ");
      this.codigo = input.nextInt();
      System.out.println("Introduzca el nombre: ");
      this.nombre += input.nextLine();
      System.out.println("Introduzca el numero de horas trabajadas: ");
      this.horas = input.nextInt();
      System.out.println("Introduzca el valor de la hora trabajada: ");
      this.valorHora = input.nextDouble();
      System.out.println("Introduzca el porcentaje de retencion de la fuente: ");
      this.retencion = input.nextDouble();
   }

   void mostrarInformacion() {
      double salarioBruto = this.valorHora * this.horas;
      System.out.println("El empleado " + this.nombre + " con codigo " + this.codigo + "tiene un salario bruto de "
            + salarioBruto + "." + "El salario neto es de " + salarioBruto * (1 - retencion / 100));
   }
}
