package EjerciciosT3Clases.Libro;

public class Libro {
    String titulo;
    String autor;
    int anio;
    String editorial;
    long ISBN;

    public Libro(String titulo, String autor, int anio, String editorial, long ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "El libro se llama " + titulo + ", es de " + autor + ", lo pubicó en el año " + anio + ", la editorial es " + editorial + " y su ISBN es: " + ISBN;
    }
}
