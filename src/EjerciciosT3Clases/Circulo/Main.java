package EjerciciosT3Clases.Circulo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);

        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
