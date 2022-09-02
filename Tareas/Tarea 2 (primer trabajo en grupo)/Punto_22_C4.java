import java.util.Scanner;
public class Punto_22_C4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String nombre = s.next();
        float salh = s.nextFloat(),hor= s.nextFloat();
        float sal = salh*hor;
        if(sal>450000){
            System.out.println("nombre: "+nombre+" salario:$"+sal);
        }
        else{
            System.out.println("nombre: "+nombre);
        }
    }
}
