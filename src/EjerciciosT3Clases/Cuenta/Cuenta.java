package EjerciciosT3Clases.Cuenta;

public class Cuenta {
    double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imposicion(double cantidad) {
        saldo += cantidad;
        System.out.println("Se han depositado " + cantidad + "€. Saldo actual: " + saldo);
    }

    public void reintegro(double cantidad) {
        saldo -= cantidad;
        System.out.println("Se han retirado " + cantidad + "€. Saldo actual: " + saldo);
    }
}
