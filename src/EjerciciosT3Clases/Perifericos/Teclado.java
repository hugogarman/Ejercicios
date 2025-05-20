package EjerciciosT3Clases.Perifericos;

public class Teclado {
    String tipo;
    String idioma;
    boolean retroiluminado;

    public Teclado(String tipo, String idioma, boolean retroiluminado) {
        this.tipo = tipo;
        this.idioma = idioma;
        this.retroiluminado = retroiluminado;
    }

    void escribir() {
        System.out.println("El teclado está escribiendo.");
    }

    void cambiarIdioma(String nuevoidioma) {
        idioma = nuevoidioma;
        System.out.println("El idioma del teclado ha cambiado a: " + nuevoidioma);
    }

    void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", idioma: " + idioma + ", retroiluminado: " + retroiluminado);
    }
}
