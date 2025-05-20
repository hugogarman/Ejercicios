package EjerciciosT3Clases.Perifericos;

public class Raton {
    String tipo;
    int dpi;
    boolean inalambrico;

    public Raton(String tipo, int dpi, boolean inalambrico) {
        this.tipo = tipo;
        this.dpi = dpi;
        this.inalambrico = inalambrico;
    }

    void hacerClick() {
        System.out.println("El ratón ha hecho clic.");
    }

    void cambiarDpi(int nuevoDpi) {
        dpi = nuevoDpi;
        System.out.println("El DPI del ratón ha cambiado a: " + nuevoDpi);
    }

    void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", DPI: " + dpi + ", inalámbrico: " + inalambrico);
    }
}
