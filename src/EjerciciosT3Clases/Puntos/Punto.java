package EjerciciosT3Clases.Puntos;

public class Punto {
    int coordenadaX;
    int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void mostrarInfo() {
        System.out.println("Está en el punto (" + coordenadaX + ", " + coordenadaY + ")");
    }

    public double calcularDistancia(Punto otroPunto) {
        return Math.sqrt((Math.pow((otroPunto.coordenadaX - this.coordenadaX), 2)) + (Math.pow((otroPunto.coordenadaY - this.coordenadaY), 2)));
    }
}
