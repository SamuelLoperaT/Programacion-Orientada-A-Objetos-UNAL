public class Punto_12 {
    public static void main(String[]args){
        double h = 48,rate = 5000,ret = 0.125;
        System.out.println("El salario bruto del empleado (por semana) es: " + (h*rate) + " Pesos");
        System.out.println("El salario neto del empleado (por semana) es: " + ((h*rate)-(h*rate*ret)) + " Pesos");
    }
}
