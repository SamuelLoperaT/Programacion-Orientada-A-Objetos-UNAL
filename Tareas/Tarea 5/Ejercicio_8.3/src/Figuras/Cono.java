package Figuras;

public class Cono extends FiguraGeometrica{
    private double radio;
    private double altura;

    public Cono(double radio, double altura){
        this.radio= radio;
        this.altura = altura;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen(){
        double volumen = (Math.PI*Math.pow(radio, 2)*altura)/3;
        return volumen;
    }
    public double CalcularSuperficie(){
        double lado = Math.sqrt((Math.pow(altura,2)+Math.pow(radio,2)));
        double superficie =((Math.PI)*radio*lado)+(Math.PI*Math.pow(radio,2));
        return superficie;
    }
    
}
