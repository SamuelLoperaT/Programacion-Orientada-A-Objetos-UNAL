import java.util.Scanner;
public class punto24 {
    public static void main(String[] args) {
        double A,B,C;
        Scanner entrada = new Scanner(System.in);
        System.out.print("introducce el peso de la esferas, A: ");
        A = entrada.nextDouble();
        System.out.print("introducce el peso de la esferas, B:");
        B = entrada.nextDouble();
        System.out.print("introducce el peso de la esferas, C: ");
        C = entrada.nextDouble();
        entrada.close();
        if(A>B){
            if(A>C){
                System.out.println("A es la esfera de mayor tamaño con "+A);
            }
            else if(C>A){
                System.out.println("C es la esfera de mayor tamaño con "+C);
            }
        }
        else if(B>A){
            if(B>C){
                System.out.println("B es la esfera de mayor tamaño con "+B);
            }
            else if(C>B){
                System.out.println("C es la esfera de mayor tamaño con "+C);
            }
        }
        else{
            System.out.println("todas las esferas poseen el mismo peso");
        }
    
}
}
