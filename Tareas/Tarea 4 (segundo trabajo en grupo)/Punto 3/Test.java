package Animales;

public class Test {

   public static void main(String[] args) {
      Animal[] animales = new Animal[4];

      animales[0] = new Perro();
      animales[1] = new Lobo();
      animales[2] = new Leon();
      animales[3] = new Gato();

      for (int i = 0; i < 4; i++) {
         System.out.println("Nombre cientifico:" + animales[i].getNombreCientifico());
         System.out.println("Sonido: " + animales[i].getSonido());
         System.out.println("Alimento: " + animales[i].getAlimentos());
         System.out.println("Habitat: " + animales[i].getHabitat() + "\n");
      }
   }
}
