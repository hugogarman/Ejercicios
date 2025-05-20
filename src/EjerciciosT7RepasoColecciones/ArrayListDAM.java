package EjerciciosT7RepasoColecciones;

public class ArrayListDAM<T> {
    private Nodo<T> primero;
    private int size;

    public ArrayListDAM() {
        primero = null;
        size = 0;
    }

    // Añade un elemento al final de la lista
    public void add(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        size++;
    }

    // Añade un elemento en la posición indicada
    public void add(int posicion, T elemento) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }

        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
        } else {
            Nodo<T> anterior = obtenerNodo(posicion - 1);
            nuevoNodo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevoNodo);
        }
        size++;
    }

    // Elimina el elemento de la posición indicada
    public void delete(int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion >= size) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }

        if (posicion == 0) {
            primero = primero.getSiguiente();
        } else {
            Nodo<T> anterior = obtenerNodo(posicion - 1);
            anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
        }
        size--;
    }

    // Elimina los elementos que coincidan con el proporcionado
    public void delete(T elemento) {
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;

        while (actual != null) {
            if ((elemento == null && actual.getValor() == null) ||
                    (elemento != null && elemento.equals(actual.getValor()))) {

                if (anterior == null) {
                    primero = actual.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                size--;
            } else {
                anterior = actual;
            }
            actual = actual.getSiguiente();
        }
    }

    // Devuelve el elemento de la posición determinada
    public T get(int posicion) throws IndexOutOfBoundsException {
        return obtenerNodo(posicion).getValor();
    }

    // Devuelve el tamaño de la colección
    public int length() {
        return size;
    }

    // Metodo auxiliar para obtener un nodo por posición
    private Nodo<T> obtenerNodo(int posicion) {
        if (posicion < 0 || posicion >= size) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }

        Nodo<T> actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = primero;
        while (actual != null) {
            if (actual != primero) sb.append(", ");
            sb.append(actual.getValor());
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }

}