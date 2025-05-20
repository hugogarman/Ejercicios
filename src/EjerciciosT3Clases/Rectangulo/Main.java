package EjerciciosT3Clases.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Rectángulo 1:");
        rectangulo1.mostrarInfo();
        System.out.println("Área: " + rectangulo1.calcularArea());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Orientación: " + rectangulo1.determinarOrientacion());
        rectangulo1.dibujarRectangulo();

        System.out.println();

        Rectangulo rectangulo2 = new Rectangulo(12, 7);

        System.out.println("Rectángulo 2:");
        rectangulo2.mostrarInfo();
        System.out.println("Área: " + rectangulo2.calcularArea());
        System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Orientación: " + rectangulo2.determinarOrientacion());
        rectangulo2.dibujarRectangulo();
    }
}
