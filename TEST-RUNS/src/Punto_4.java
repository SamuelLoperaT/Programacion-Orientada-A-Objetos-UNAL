import java.util.Scanner;
public class Punto_4 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        float edJuan = s.nextFloat(),edAna = (4*edJuan)/3,edAlber = (2*edJuan)/3, edMama = edAlber+edJuan+edAna;
        System.out.println("Las edades son, Alberto: "+edAlber+" Juan: "+edJuan+" Ana: "+edAna+" Mama: "+edMama);

    }
}
