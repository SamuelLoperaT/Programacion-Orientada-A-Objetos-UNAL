package ejeercio1;

import java.util.*;

public class PruebaCuenta {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new
        CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();

        System.out.println("Cuenta corriente");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialCorriente = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasacorriente = input.nextFloat();
        CuentaCorriente cuenta2 = new
        CuentaCorriente(saldoInicialCorriente, tasacorriente);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar1 = input.nextFloat();
        cuenta2.consignar(cantidadDepositar1);
        System.out.print("Ingrese cantidad a retirar= ");
        float retiroCorriente= input.nextFloat();
        
        cuenta2.retirar(retiroCorriente);
        cuenta2.extractoMensual();
        cuenta2.imprimir();



        input.close();
        }
    
}
