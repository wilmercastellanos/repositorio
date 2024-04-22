
package Ejercisio_8a1;

/**
 *
 * @author Wilmer Felipe Castellanos
 
 Crea una clase llamada Forma:
• Con los siguientes atributos y métodos:
◦ String nombre
◦ double posicionX, double posicionY
◦ String color
◦ constructor propio con todos sus atributos
◦ método: double calcularArea( ), y getters y setters de los atributos.
• Crea una clase llamada Triangulo que herede de la clase Forma, y con los atributos base y altura.
Define en ella el método calcularArea().
• Crea una clase llamada Cuadrado que herede de la clase Forma, y con el atributo lado. Define en
ella el método calcularArea() y calcularPerimetro().
• Crea una clase aparte con el método main para probar los métodos de las subclases Triangulo y
Cuadrado.
 */


public class Forma {
    private String nombre;
    private double posicionX;
    private double posicionY;
    private String color;

    public Forma(String nombre, double posicionX, double posicionY, String color) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    public double calcularArea() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public String getColor() {
        return color;
    }
        
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }
    
    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
