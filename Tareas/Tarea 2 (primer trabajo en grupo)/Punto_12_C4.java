import java.util.Scanner;
public class Punto_12_C4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String nombre = s.next();
        int horasT = s.nextInt(), valorH = s.nextInt(),extras,extras8,salario;
        if(horasT>40){
            extras = horasT-40;
            if(extras>8){
                extras8=extras-8;
                salario = (40*valorH)+(16*valorH)+(extras8*3*valorH);
            }
            else {
                salario = (40 * valorH) + (extras * 2 * valorH);
            }
        }
        else{
            salario = (valorH*horasT);
        }
        System.out.println("el trabajador "+nombre+" devengo $"+salario);
    }
}
