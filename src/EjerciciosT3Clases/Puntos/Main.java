package EjerciciosT3Clases.Puntos;

public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto(100,200);
        Punto punto2 = new Punto(400,800);

        punto1.mostrarInfo();
        punto2.mostrarInfo();

        double distancia = punto1.calcularDistancia(punto2);
        System.out.println("La distancia entre los dos puntos es: " + distancia);

    }
}
