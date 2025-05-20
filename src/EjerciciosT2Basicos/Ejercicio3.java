package EjerciciosT2Basicos;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Desarrolla un programa que, dado un número entre el 1 y el 7, indique el día de la semana del que se trata.

        int dia = (int)(Math.random() * 7 + 1);
        System.out.println("Día: " + dia);

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
        }
    }
}
