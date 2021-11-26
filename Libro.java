
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
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
     * Imprime los detalles del libro
     */
    public void impimirDetalles() {
        String devolver = "";
        devolver = "Título: " + titulo + ", Autor: " + autor + ", número de páginas: " + numeroPaginas + "";
        if (numeroReferencia == "") {
            numeroReferencia = "ZZZ";
        }
        else {
            numeroReferencia = numeroReferencia;
        }
        System.out.println(devolver = devolver + " y número de referencia: " + numeroReferencia);
    }

    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String devolver = "";
        devolver = "Título: " + titulo + ", Autor: " + autor + ", número de páginas: " + numeroPaginas + ", ";
        if (numeroReferencia == "") {
            devolver = devolver + " y número de referencia: ZZZ";
        }
        else {
            devolver = devolver + " y número de referencia: " + numeroReferencia;
        }
        return devolver;
    }
}