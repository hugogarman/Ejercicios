package EjerciciosT3Clases.Perifericos;

public class Main {
    public static void main(String[] args) {
        Movil movilPersonal = new Movil("Apple", "iPhone 12", 2815);
        movilPersonal.mostrarInfo();
        movilPersonal.encender();
        movilPersonal.apagar();

        System.out.println();

        Teclado tecladoOficina = new Teclado("Membrana", "Español", true);
        tecladoOficina.mostrarInfo();
        tecladoOficina.escribir();
        tecladoOficina.cambiarIdioma("Inglés");

        System.out.println();

        Raton ratonGamer = new Raton("Óptico", 8000, false);
        ratonGamer.mostrarInfo();
        ratonGamer.hacerClick();
        ratonGamer.cambiarDpi(16000);
    }
}
