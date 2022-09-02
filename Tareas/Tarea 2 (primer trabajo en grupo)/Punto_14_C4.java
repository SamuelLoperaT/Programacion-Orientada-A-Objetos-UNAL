import java.util.Scanner;
public class Punto_14_C4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int vd1 = s.nextInt(),vd2 = s.nextInt(),vd3 = s.nextInt();
        float sal = s.nextFloat();
        int totven = vd1+vd2+vd3;
        float porven,sal1,sal2,sal3;
        porven = (float)(totven*0.33);
        if(vd1>porven){
            sal1 = (float) (sal+(sal*0.2));
        }
        else {
            sal1 = sal;
        }
        if(vd2>porven){
            sal2 = (float) (sal+(sal*0.2));
        }
        else {
            sal2 = sal;
        }
        if(vd3>porven){
            sal3 = (float) (sal+(sal*0.2));
        }
        else {
            sal3 = sal;
        }
        System.out.println("Salario vendedores dpto 1:$"+sal1+" Salario vendedores dpto 2:$"+sal2+" Salario vendedores dpto 3:$"+sal3);
    }
}
