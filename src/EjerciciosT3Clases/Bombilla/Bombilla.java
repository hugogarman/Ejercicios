package EjerciciosT3Clases.Bombilla;

public class Bombilla {
    boolean encendida;

    public Bombilla() {
        this.encendida = false; // La bombilla está apagada
    }

    void encender() {
        this.encendida = true; // El this se usa para atributos de un objeto
    }

    void apagar() {
        this.encendida = false;
    }

    boolean estado() {
        return this.encendida;
    }
}
