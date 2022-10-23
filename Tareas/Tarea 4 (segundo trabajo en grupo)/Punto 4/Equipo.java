package CarreraCiclistica;

import java.util.*;

public class Equipo {
   private String nombre;
   private static double totalTiempo;
   private String pais;
   ArrayList<Ciclista> listaCiclistas;

   public Equipo(String nombre, String país) {
      this.nombre = nombre;
      this.pais = país;
      totalTiempo = 0;
      listaCiclistas = new ArrayList<Ciclista>();
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   private String getPais() {
      return pais;
   }

   private void setPais(String pais) {
      this.pais = pais;
   }

   void añadirCiclista(Ciclista ciclista) {
      listaCiclistas.add(ciclista);
   }

   void listarEquipo() {
      for (int i = 0; i < listaCiclistas.size(); i++) {
         Ciclista c = (Ciclista) listaCiclistas.get(i);
         System.out.println(c.getNombre());
      }
   }

   void buscarCiclista() {
      Scanner sc = new Scanner(System.in);
      String nombreCiclista = sc.next();
      for (int i = 0; i < listaCiclistas.size(); i++) {
         Ciclista c = (Ciclista) listaCiclistas.get(i);
         if (c.getNombre().equals(nombreCiclista)) {
            System.out.println(c.getNombre());

         }
      }
   }

   void calcularTotalTiempo() {
      for (int i = 0; i < listaCiclistas.size(); i++) {
         Ciclista c = (Ciclista) listaCiclistas.get(i);
         totalTiempo = totalTiempo + c.getTiempoAcumulado();
      }
   }

   void imprimir() {
      System.out.println("Nombre del equipo = " + nombre);
      System.out.println("País = " + pais);
      System.out.println("Total tiempo del equipo = " + totalTiempo);
   }
}
