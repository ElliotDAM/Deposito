package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        float cantidad = 695;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        CCuenta.operativa_cuenta(cuenta1, cantidad);
    }
}