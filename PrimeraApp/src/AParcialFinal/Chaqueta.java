
package AParcialFinal;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Chaqueta extends Componentes {
    int numBotones;

    public Chaqueta(int numBotones, int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.numBotones = numBotones;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    @Override
    public String toString() {
        return "Chaqueta{" + "numBotones=" + numBotones + '}';
    }
    
    
   
}
