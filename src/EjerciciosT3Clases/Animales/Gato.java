package EjerciciosT3Clases.Animales;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}
