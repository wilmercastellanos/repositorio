
package AParcialFinal;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Blusa extends Componentes {
    boolean mangaLarga;

    public Blusa(boolean mangaLarga, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.mangaLarga = mangaLarga;
    }

    public boolean isMangaLarga() {
        return mangaLarga;
    }

    public void setMangaLarga(boolean mangaLarga) {
        this.mangaLarga = mangaLarga;
    }

    @Override
    public String toString() {
        return "Blusa{" + "mangaLarga=" + mangaLarga + '}';
    }
    
    
    
}
