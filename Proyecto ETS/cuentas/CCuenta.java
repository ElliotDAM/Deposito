package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa los atributos de la cuenta.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial de la cuenta.
     * @param tipo  El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad  La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad  La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o supera el saldo actual.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método que realiza operaciones con la cuenta.
     *
     * @param cuenta    La cuenta a operar.
     * @param cantidad  La cantidad a ingresar.
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}