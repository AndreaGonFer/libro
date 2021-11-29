
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
     * Devuelve el n�mero de p�ginas del libro
     */
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    /**
     * Imprime los detalles del libro
     */
    public void impimirDetalles() {
        String devolver = "";
        devolver = "T�tulo: " + titulo + ", Autor: " + autor + ", n�mero de p�ginas: " + numeroPaginas + ", n�mero de pr�stamos: " + vecesPrestado + "";
        if (numeroReferencia == "") {
            devolver = devolver + " y n�mero de referencia: ZZZ. ";
        }
        else {
            devolver = devolver + " y n�mero de referencia: " + numeroReferencia + ". ";
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
        devolver = "T�tulo: " + titulo + ", Autor: " + autor + ", n�mero de p�ginas: " + numeroPaginas + ", n�mero de pr�stamos: " + vecesPrestado + "";
        if (numeroReferencia == "") {
            devolver = devolver + " y n�mero de referencia: ZZZ. ";
        }
        else {
            devolver = devolver + " y n�mero de referencia: " + numeroReferencia + ". ";
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