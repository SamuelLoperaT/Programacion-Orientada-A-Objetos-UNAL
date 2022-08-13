import java.util.Scanner;
public class Punto_14 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        System.out.println("El cuadrado del numero " + n +" es: " + Math.pow(n,2));
        System.out.println("El cubo del numero " + n +" es: " + Math.pow(n,3));
    }
}
