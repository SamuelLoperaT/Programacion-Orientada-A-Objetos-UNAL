public class Main {
    public static void main(String[]args){
        Carro micarro = new Carro();
        micarro.marca = "Ford";
        micarro.modelo = "Fiesta";

        System.out.println("La marca de mi carro es: "+ micarro.marca);
        System.out.println("El modelo de mi carro es: "+ micarro.modelo);

        micarro.honk();

    }
}
