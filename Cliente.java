public class Cliente {
    private String nombre,apellido;
    private int dni, libroEnPoder, librosPedidos;

public Cliente(String nombre, String apellido, int dni, int libroEnPoder, int librosPedidos)    //Constructor con parametros
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.libroEnPoder=libroEnPoder;
        this.librosPedidos=librosPedidos;
    }
// Getters y Setters
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public int getDni() {
    return dni;
}

public void setDni(int dni) {
    this.dni = dni;
}

public int getLibroEnPoder() {
    return libroEnPoder;
}

public void setLibroEnPoder(int libroEnPoder) {
    this.libroEnPoder = libroEnPoder;
}

public int getLibrosPedidos() {
    return librosPedidos;
}

public void setLibrosPedidos(int librosPedidos) {
    this.librosPedidos = librosPedidos;
}

// Método toString para imprimir la información del cliente
@Override
public String toString() {


    return "Cliente n° " +
            ", Nombre: " + nombre + '\'' +
            ", Apellido: " + apellido + '\'' +
            ", DNI: " + dni +
            ", Libros en poder= " + libroEnPoder +
            ", Libros pedidos : " + librosPedidos + '\'' +
            '}';

}
}