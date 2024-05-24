
package AParcialFinal;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Traje {
    private ArrayList<Componentes> piezas;
    private String nombre;

    public Traje(ArrayList<Componentes> piezas, String nombre) {
        this.piezas = piezas;
        this.nombre = nombre;
    }

    public ArrayList<Componentes> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Componentes> piezas) {
        this.piezas = piezas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Traje{" + "piezas=" + piezas + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
