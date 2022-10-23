package Inmuebles;

import Inmuebles.Local.tipo;

public class Prueba {
    public static void main(String args[]) {
        ApartamentoFamiliar apto1 = new
        ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new
        Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
        aptestudio1.imprimir();

        CasaConjuntoCerrado casacerr1= new CasaConjuntoCerrado(20,114,"Manchester cra 49 #44-47",
        4,3,2,300000,true,false);
        System.out.println("Datos Casa conjunto");
        casacerr1.calcularPrecioVenta(casacerr1.valorArea);
        casacerr1.imprimir();

        CasaIndependiente casaind1= new CasaIndependiente(2012,90,"la milagrosa cra 19 #94-57",
        4,3,2);
        System.out.println("Datos Casa independiente");
        casaind1.calcularPrecioVenta(casaind1.valorArea);
        casaind1.imprimir();
        
        CasaRural casaRural1= new CasaRural(2012,90,"la milagrosa cra 19 #94-57",
        4,3,2,1000,2100);
        System.out.println("Datos Casa Rural");
        casaRural1.calcularPrecioVenta(casaRural1.valorArea);
        casaRural1.imprimir();

        tipo t1 =tipo.CALLE;
        LocalComercial localComercial1= new LocalComercial(9999,50,"cra 10 # 54-44",t1,"Ciudad Fabricato");
        System.out.println("Datos Local Comercial");
        localComercial1.calcularPrecioVenta(localComercial1.valorArea);
        localComercial1.imprimir();

        tipo t2 = tipo.INTERNO;
        Oficina oficina1= new Oficina(5555,15,"calle 56 # 14-85",t2,true);
        System.out.println("Datos Local Comercial");
        oficina1.calcularPrecioVenta(oficina1.valorArea);
        oficina1.imprimir();
    }
    }
