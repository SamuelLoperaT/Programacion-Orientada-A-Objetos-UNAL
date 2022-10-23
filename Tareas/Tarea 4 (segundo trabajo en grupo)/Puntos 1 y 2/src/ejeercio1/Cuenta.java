package ejeercio1;
public class Cuenta {
    protected float saldo;
    protected int númeroConsignaciones = 0;
    protected int númeroRetiros = 0;
    protected float tasaAnual;
    protected float comisiónMensual = 0;
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        }
        public void consignar(float cantidad) {
            saldo = saldo + cantidad; /* Se actualiza el saldo con la cantidad
            consignada */
            // Se actualiza el número de consignaciones realizadas en la cuenta
            númeroConsignaciones = númeroConsignaciones + 1;
            }
            public void retirar(float cantidad) {
                float nuevoSaldo = saldo - cantidad;
                /* Si la cantidad a retirar no supera el saldo, el retiro no se puede
                realizar */
                if (nuevoSaldo >= 0) {
                saldo -= cantidad;
                númeroRetiros = númeroRetiros + 1;
                } else {
                System.out.println("La cantida a retirar excede el saldoactual.");
                }
                }
                /**
                * Método que calcula interés mensual de la cuenta a partir de la tasa
                * anual aplicada
                */
                public void calcularInterés() {
                float tasaMensual = tasaAnual / 12; /* Convierte la tasa anual en
                mensual */
                float interesMensual = saldo * tasaMensual;
                saldo += interesMensual; /* Actualiza el saldo aplicando el interés
                mensual */
                }
                /**
                * Método que genera un extracto aplicando al saldo actual una
                * comisión y calculando sus intereses
                */
                public void extractoMensual() {
                saldo -= comisiónMensual;
                calcularInterés();
                }
        }
