package AParcialFinal;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Componentes {

    int id;
    String nombre;
    String talla;
    String color;
    boolean escomunitario;
    double precio;

    public Componentes(int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.escomunitario = escomunitario;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEscomunitario() {
        return escomunitario;
    }

    public void setEscomunitario(boolean escomunitario) {
        this.escomunitario = escomunitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Componentes{" + "id=" + id + ", nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", escomunitario=" + escomunitario + ", precio=" + precio + '}';
    }

   
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Componentes that = (Componentes) obj;
        return id == that.id;
    }
    
    
    
    public int compareTo(Componentes o){
        return Integer.compare(this.id, o.id);
    }
    
    
}
