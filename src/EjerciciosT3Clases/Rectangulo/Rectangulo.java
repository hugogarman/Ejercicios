package EjerciciosT3Clases.Rectangulo;

public class Rectangulo {
    int largo;
    int ancho;

    public Rectangulo() {
        this.largo = 10;
        this.ancho = 5;
    }

    public Rectangulo(int largo, int ancho) {
        if (largo > 0 && ancho > 0) {
            this.largo = largo;
            this.ancho = ancho;
        } else {
            this.largo = 10;
            this.ancho = 5;
        }
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int calcularArea() {
        return largo * ancho;
    }

    public int calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public String determinarOrientacion() {
        if (largo > ancho) {
            return "Horizontal";
        } else {
            return "Vertical";
        }
    }

    public void mostrarInfo() {
        System.out.println("Largo: " + largo + ", Ancho: " + ancho);
    }

    public void dibujarRectangulo() {
        for (int i = 1; i <= largo; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

