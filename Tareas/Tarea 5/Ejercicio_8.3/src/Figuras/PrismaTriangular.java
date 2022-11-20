package Figuras;

public class PrismaTriangular extends FiguraGeometrica{
    private double ladotriangulo;
    private double ladoMayor;

    public PrismaTriangular(double ladotriangulo, double ladoMayor){
        this.ladotriangulo= ladotriangulo;
        this.ladoMayor = ladoMayor;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen(){
        double areatriangulo = (Math.sqrt(3)*Math.pow(ladotriangulo,2))/4;
        double volumen = areatriangulo*ladoMayor;
        return volumen;
    }
    public double CalcularSuperficie(){
        double superficie =(3*(ladoMayor*ladotriangulo))+(Math.sqrt(3)*Math.pow(ladotriangulo,2))/2;
        return superficie;
    }
    
}