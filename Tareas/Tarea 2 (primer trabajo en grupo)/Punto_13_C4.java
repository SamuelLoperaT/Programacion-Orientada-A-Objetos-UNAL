import java.util.Scanner;
public class Punto_13_C4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        float valComp = s.nextFloat(), pdes;
        String color = s.next();
        if(color.equals("BLANCO")){
            pdes = 0;
        }
        else if(color.equals("VERDE")){
            pdes = 10;
        }
        else if(color.equals("AMARILLO")){
            pdes = 25;
        }
        else if(color.equals("AZUL")){
            pdes = 50;
        }
        else{
            pdes = 100;
        }
        float valPag = valComp-((pdes*valComp)/100);
        System.out.println("El cliente debe pagar: $"+valPag);
    }
}
