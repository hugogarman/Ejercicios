package EjerciciosT3Clases.Animales;

public class Vaca extends Animal {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    public void hacerSonido() {
        System.out.println("Muu muu!");
    }
}
