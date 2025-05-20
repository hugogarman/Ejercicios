package EjerciciosT3Excepciones.Ejercicio4;

class EstudianteException extends Exception {
    public EstudianteException(String mensaje) {
        super(mensaje);
    }
}

class EdadInvalidaException extends EstudianteException {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

class NombreInvalidoException extends EstudianteException {
    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Estudiante {
    private int edad;
    private String nombre;

    public void establecerEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 150) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 150 años.");
        }
        this.edad = edad;
    }

    public void establecerNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null) {
            throw new NombreInvalidoException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "edad=" + edad + ", nombre='" + nombre + '\'' + '}';
    }
}
