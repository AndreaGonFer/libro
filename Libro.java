
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
     * Devuelve el título del libro
     */
    public String getTítuloLibro() {
        return titulo;
    }
    
    /**
     * Devuelve el númerod de páginas del libro
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
     * Imprime los detalles del libro
     */
    public void impimirDetalles() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + " y número de páginas: " + numeroPaginas);
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String devolver = "";
        devolver = devolver + "Título: " + titulo + ", Autor: " + autor + " y número de páginas: " + numeroPaginas;
        return devolver;
    }
}