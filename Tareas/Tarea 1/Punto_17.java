import java.util.Scanner;
public class Punto_17 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.println("El area del Circulo de radio " + r + " es " + (Math.PI*(Math.pow(r,2))));
        System.out.println("La longitud del Circulo de radio " + r + " es " + (Math.PI*2*r));
    }
}
