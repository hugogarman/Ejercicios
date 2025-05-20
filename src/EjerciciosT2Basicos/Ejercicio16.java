package EjerciciosT2Basicos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Desarrolla un programa que dado el día y mes de nacimiento te indique cuál es tu signo del zodiaco.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu mes de nacimiento:");
        String mes = sc.nextLine().toLowerCase();

        System.out.println("Introduce tu día de nacimiento:");
        int dia = sc.nextInt();

        switch (mes) {
            case "enero":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Capricornio");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Acuario");
                }
                break;
            case "febrero":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Acuario");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Piscis");
                }
                break;
            case "marzo":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Piscis");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Aries");
                }
                break;
            case "abril":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Aries");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Tauro");
                }
                break;
            case "mayo":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Tauro");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Géminis");
                }
                break;
            case "junio":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Géminis");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Cáncer");
                }
                break;
            case "julio":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Cáncer");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Leo");
                }
                break;
            case "agosto":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Leo");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Virgo");
                }
                break;
            case "septiembre":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Virgo");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Libra");
                }
                break;
            case "octubre":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Libra");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Escorpio");
                }
                break;
            case "noviembre":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Escorpio");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Sagitario");
                }
                break;
            case "diciembre":
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Sagitario");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Capricornio");
                }
                break;
            default:
                System.out.println("Mes no válido");
                break;
        }
        sc.close();
    }
}
