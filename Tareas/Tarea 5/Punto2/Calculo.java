package Punto2;

import java.util.Collections;
import java.util.List;

public class Calculo {
   public double promedio(List<Double> notas) {
      double promedio = 0.0;
      for (Double nota : notas) {
         promedio += nota;
      }
      return promedio / notas.size();
   }

   public double desviacion(List<Double> notas, double promedio) {
      double sumatoria = 0.0;
      for (Double nota : notas) {
         sumatoria += Math.pow(promedio - nota, 2);
      }
      return Math.sqrt(sumatoria / (notas.size() - 1));
   }

   public double mayor(List<Double> notas) {
      Collections.sort(notas);
      return notas.get(notas.size() - 1);
   }

   public double menor(List<Double> notas) {
      Collections.sort(notas);
      return notas.get(0);
   }
}
