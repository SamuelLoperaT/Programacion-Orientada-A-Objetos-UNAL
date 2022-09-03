import java.util.Scanner;
public class punto23 {
    public static void main(String[] args) {
    double A,B,C,X_1,X_2;
    Scanner entrada = new Scanner(System.in);
    System.out.print("introducce el parametro que acompaña a la incognita cuadratica, A: ");
    A = entrada.nextDouble();
    System.out.print("introducce el parametro que acompaña a la incognita simple, B:");
    B = entrada.nextDouble();
    System.out.print("introducce el parametro complementario, C: ");
    C = entrada.nextDouble();
    entrada.close();
    double formula_general=Math.sqrt((B*B)-4*(A-C));
    if(formula_general>0){
        X_1=(-B+formula_general)/(2*A);
        X_2=(-B-formula_general)/(2*A);
        System.out.println("Primera solucion: X1="+X_1);
        System.out.println("Segunda solucion: X2="+X_2);
    }
    else if(formula_general == 0){
        X_1=(-B)/(2*A);
        System.out.println("la solucion unica es: "+X_1);
    }
    else{
        System.out.println("El conjunto solucion es imaginaria");
    }
    }
    
    
}
