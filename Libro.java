
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
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
     * Devuelve el n�merod de p�ginas del libro
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
     * Imprime los detalles del libro
     */
    public void impimirDetalles() {
        System.out.println("T�tulo: " + titulo + ", Autor: " + autor + " y n�mero de p�ginas: " + numeroPaginas);
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String devolver = "";
        devolver = devolver + "T�tulo: " + titulo + ", Autor: " + autor + " y n�mero de p�ginas: " + numeroPaginas;
        return devolver;
    }
}