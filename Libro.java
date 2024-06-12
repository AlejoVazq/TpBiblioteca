import java.util.Scanner;

public class Libro {
    private String titulo,autor, isbn;
    private int cantidadEjemplares,cantidadPrestados;
  
public Libro(String titulo, String autor,String isbn, int cantidadEjemplares, int cantidadPrestados)    //Constructor con parametros
    {
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.cantidadEjemplares=cantidadEjemplares;
        this.cantidadPrestados=cantidadPrestados;

    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.autor = isbn;
    }
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }

    public boolean darPrestamo()
    {
        boolean prestado=true;
        if (cantidadPrestados<cantidadEjemplares)
        {
            cantidadPrestados++;
        }
        else
        {
            prestado=false;
        }
        return prestado;
    }


    public boolean devolverLibro(){

        boolean devolver=true;

        if(cantidadPrestados == 0){
            devolver=false;
        }
        else{
            cantidadPrestados--;
        }
        return devolver;
    }
    
}


