package EjerciciosT3Clases.Circulo;

public class Circulo {
    double radio;
    final double pi = 3.141592;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * pi * radio;
    }

    public double calcularArea() {
        return pi * (radio * radio);
    }
}
