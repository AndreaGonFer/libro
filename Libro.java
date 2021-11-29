
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas, boolean texto) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = texto;
    }

    /**
     * Devuelve el nombre del autor
     */
    public String getNombreAutor() {
        return autor;
    }

    /**
     * Devuelve el título del libro
     */
    public String getTítuloLibro() {
        return titulo;
    }

    /**
     * Devuelve el número de páginas del libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Imprime el nombre del autor
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }

    /**
     * Imprime el título del libro
     */
    public void imprimeTítulo() {
        System.out.println(titulo);
    }

    /**
     * Devuelve el número de referencia del libro
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Permite cambiar el número de referencia del libro
     */
    public void setNumeroReferencia(String referencia) {
        if (referencia.length() < 3) {
            System.out.println("El numero de referencia tiene menos de 3 caraceres.");
        }
        else {
            numeroReferencia = referencia;
        }
    }

    /**
     * Modifica las veces que ha sido prestado el libro
     */
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
    }
    
    /**
     * Devuelve las veces que ha sido prestado el libro
     */
    public int getPrestar() {
        return vecesPrestado;
    }
    
    /**
     * Devuelve el número de páginas del libro
     */
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    /**
     * Imprime los detalles del libro
     */
    public void impimirDetalles() {
        String devolver = "";
        devolver = "Título: " + titulo + ", Autor: " + autor + ", número de páginas: " + numeroPaginas + ", número de préstamos: " + vecesPrestado + "";
        if (numeroReferencia == "") {
            devolver = devolver + " y número de referencia: ZZZ. ";
        }
        else {
            devolver = devolver + " y número de referencia: " + numeroReferencia + ". ";
        }
        if (esLibroDeTexto == true) {
            devolver = devolver + "Es un libro de texto.";
        }
        else {
            devolver = devolver + "No es un libro de texto.";
        }
        System.out.println(devolver);
    }

    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String devolver = "";
        devolver = "Título: " + titulo + ", Autor: " + autor + ", número de páginas: " + numeroPaginas + ", número de préstamos: " + vecesPrestado + "";
        if (numeroReferencia == "") {
            devolver = devolver + " y número de referencia: ZZZ. ";
        }
        else {
            devolver = devolver + " y número de referencia: " + numeroReferencia + ". ";
        }
        if (esLibroDeTexto == true) {
            devolver = devolver + "Es un libro de texto.";
        }
        else {
            devolver = devolver + "No es un libro de texto.";
        }
        return devolver;
    }
}