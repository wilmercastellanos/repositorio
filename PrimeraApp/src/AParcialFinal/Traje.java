
package AParcialFinal;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Traje {
    private ArrayList<Componentes> piezas;
    private String nombre;

    public Traje(String nombre, ArrayList<Componentes> piezas) {
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

    public ArrayList<Componentes> getpiezas() {
        return piezas;
    }

    public void setpiezas(ArrayList<Componentes> piezas) {
        this.piezas = piezas;
    }

    public void addComponente(Componentes componentes) {
        piezas.add(componentes);
    }

    @Override
    public String toString() {
        return "Traje{" +
                "nombre='" + nombre + '\'' +
                ", piezas=" + piezas +
                '}';
    }
    
}
