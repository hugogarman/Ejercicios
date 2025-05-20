package EjerciciosT3Clases.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(0);

        cuenta.imposicion(77200);
        cuenta.reintegro(14350);
        cuenta.reintegro(6000);

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}
