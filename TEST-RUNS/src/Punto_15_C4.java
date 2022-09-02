import java.util.Scanner;

public class Punto_15_C4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(),B = s.nextInt(),C = s.nextInt(),D = s.nextInt();

        if((A==B)&&(A==D)){
            System.out.println("C es la diferente");
            if(C>A){
                System.out.println("C es de mayor peso");
            }
            else{
                System.out.println("C es de menor peso");
            }
        }
        if((A==B)&&(A==C)){
            System.out.println("D es la diferente");
            if(D>A){
                System.out.println("D es de mayor peso");
            }
            else{
                System.out.println("D es de menor peso");
            }
        }
        if((A==C)&&(A==D)){
            System.out.println("B es la diferente");
            if(B>A){
                System.out.println("B es de mayor peso");
            }
            else{
                System.out.println("B es de menor peso");
            }
        }
        if((B==C)&&(B==D)){
            System.out.println("A es la diferente");
            if(A>B){
                System.out.println("A es de mayor peso");
            }
            else{
                System.out.println("A es de menor peso");
            }
        }
    }
}
