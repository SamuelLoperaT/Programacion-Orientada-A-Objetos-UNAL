public class Punto_5 {
    public static void main(String[]args){
        double sum = 0;
        double x = 20;
        sum += x;
        double y = 40;
        x = x + Math.pow(y,2);
        sum = sum + (x/y);
        System.out.println("El valor de la suma es: "+sum);

    }
}
