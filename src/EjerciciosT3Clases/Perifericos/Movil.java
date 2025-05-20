package EjerciciosT3Clases.Perifericos;

public class Movil {
    String marca;
    String modelo;
    int capacidadBateria;

    public Movil(String marca, String modelo, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
    }

    void encender() {

        System.out.println("El móvil " + modelo + " está encendido.");
    }

    void apagar() {

        System.out.println("El móvil " + modelo + " está apagado.");
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", capacidad de batería: " + capacidadBateria);
    }
}
