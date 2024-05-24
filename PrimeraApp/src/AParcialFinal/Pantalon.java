
package AParcialFinal;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Pantalon extends Componentes {
    boolean conCremallera;

    public Pantalon(boolean conCremallera, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conCremallera = conCremallera;
    }

    public boolean isConCremallera() {
        return conCremallera;
    }

    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "conCremallera=" + conCremallera + '}';
    }
    
    
    
}
