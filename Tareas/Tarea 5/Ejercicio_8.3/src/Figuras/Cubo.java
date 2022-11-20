package Figuras;

public class Cubo extends FiguraGeometrica{
    private double lado;

    public Cubo(double lado){
        this.lado= lado;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen(){
        double volumen = Math.pow(lado,3);
        return volumen;
    }
    public double CalcularSuperficie(){
        double superficie =6*(Math.pow(lado,2));
        return superficie;
    }
    
}
