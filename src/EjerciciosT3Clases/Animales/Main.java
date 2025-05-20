package EjerciciosT3Clases.Animales;

public class Main {
    public static void main(String[] args) {

        Perro toby = new Perro("Toby", 7);
        Gato misifus = new Gato("Misifus", 10);
        Vaca lola = new Vaca("Lola", 5);

        toby.hacerSonido();
        misifus.hacerSonido();
        lola.hacerSonido();
    }
}
