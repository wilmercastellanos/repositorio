
package Parcial2;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 * Se trata de gestionar un garaje con diversos espacios que ocupan polimórficamente varios
vehículos:
a. Se debe crear la clase Vehículo con estos atributos:
String placa
String marca
double precio
int cilindraje
double impuestoCirculacion
double cuotaMesGaraje
b. Hay que hacer un constructor con todos los atributos menos:
• matricula: se inicia por defecto con valor null
• cuotaMesGaraje: que toma por defecto el valor de una constante de clase (static) que
tiene el valor 100.
• impuestoCirculacion: éste último se calcula en el constructor con el método de clase
indicado más adelante.
c. Incluir los setters y getters pertinentes. En el caso del setCuotaMesGaraje, no se puede
indicar una cuota negativa.
d. Escribir estos métodos:
• void calcularImpuestoCirculacion() , que es el 2% importe del coche
• boolean matricular(String matricula) , que da valor al campo matricula, siempre que
el parámetro matricula tenga 6 caracteres. Devuelve verdadero, si ha podido dar valor
a la matrícula.
 */

public class Vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    public double impuestoCirculacion;
    public static double CUOTA_MES_GARAJE = 100.0;
;

    public Vehiculo(String placa, String marca, double precio, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return CUOTA_MES_GARAJE;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            CUOTA_MES_GARAJE = cuotaMesGaraje;
        } else {
            System.out.println("La cuota de mes de garaje no puede ser negativa.");
        }
    }
    
    public void calcularImpuestoCirculacion() {
        impuestoCirculacion = precio * 0.02;
    }
    
    public boolean matricular(String placa) {
        if(placa.length() ==6){
            this.placa = placa;
            return true;
        } else {
            return false;
        }
    }
 
    
    
}
