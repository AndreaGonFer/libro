
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
     * Devuelve el t�tulo del libro
     */
    public String getT�tuloLibro() {
        return titulo;
    }

    /**
     * Devuelve el n�mero de p�ginas del libro
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
     * Imprime el t�tulo del libro
     */
    public void imprimeT�tulo() {
        System.out.println(titulo);
    }

    /**
     * Devuelve el n�mero de referencia del libro
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Permite cambiar el n�mero de referencia del libro
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
        devolver = "T�tulo: " + titulo + ", Autor: " + autor + ", n�mero de p�ginas: " + numeroPaginas + "";
        if (numeroReferencia == "") {
            numeroReferencia = "ZZZ";
        }
        else {
            numeroReferencia = numeroReferencia;
        }
        System.out.println(devolver = devolver + " y n�mero de referencia: " + numeroReferencia);
    }

    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String devolver = "";
        devolver = "T�tulo: " + titulo + ", Autor: " + autor + ", n�mero de p�ginas: " + numeroPaginas + ", ";
        if (numeroReferencia == "") {
            devolver = devolver + " y n�mero de referencia: ZZZ";
        }
        else {
            devolver = devolver + " y n�mero de referencia: " + numeroReferencia;
        }
        return devolver;
    }
}