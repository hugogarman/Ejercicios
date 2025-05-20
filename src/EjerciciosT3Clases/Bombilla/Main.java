package EjerciciosT3Clases.Bombilla;

public class Main {
    public static void main(String[] args) {

        Bombilla bombillaPasillo = new Bombilla();

        System.out.println(bombillaPasillo.estado()? "encendida" : "apagada");
        bombillaPasillo.encender();
        System.out.println(bombillaPasillo.estado()? "encendida" : "apagada");
        bombillaPasillo.apagar();
        System.out.println(bombillaPasillo.estado()? "encendida" : "apagada");
    }
}
