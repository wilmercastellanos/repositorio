
package AParcialFinal;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Falda extends Componentes {   
    boolean conCremallera;

    public Falda(boolean conCremallera, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
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
        return "Falda{" + "conCremallera=" + conCremallera + '}';
    }
    
    
    
}
