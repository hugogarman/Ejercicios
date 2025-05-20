package EjerciciosT3Excepciones.Ejercicio5;

class NombreInvalidoException extends Exception {
    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Persona {
    String nombre;

    public void establecerNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null) {
            throw new NombreInvalidoException("El nombre no puede ser nulo.");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + '}';
    }
}

class Empleado extends Persona {
    double salario;

    public void establecerSalario(double salario) throws SalarioInvalidoException {
        if (salario < 0) {
            throw new SalarioInvalidoException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    public void establecerNombre(String nombre) {
        try {
            super.establecerNombre(nombre);
        } catch (NombreInvalidoException e) {
            this.nombre = "Nombre por defecto";
            System.out.println("Advertencia: "+ e.getMessage() + ". Se ha asignado un nombre por defecto.");
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Salario: "  + salario;
    }
}

