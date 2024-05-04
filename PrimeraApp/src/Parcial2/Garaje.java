package Parcial2;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 * g. Crear una clase Garaje que tiene una colección (arreglo) de espacios de Vehículos. El
número de espacios es una constante de la clase. Esta clase debe cumplir con la interfaz
iGarage, que tiene estos métodos definidos:
• double calcularIngresos(); Debe calcular la suma de ingresos mensuales de todos los
vehículos existentes en el garaje
• int calcularOcupacionPorTipoVehiculo(Vehículo v); Indica cuantos vehículos hay del
tipo pasado por parámetro en el garaje.
 */
public class Garaje implements iGaraje {
private static final int NUMERO_ESPACIOS = 100; // Número de espacios en el garaje
    private final ArrayList<Vehiculo> espacios; // Colección de espacios de vehículos
    
    // Constructor
    public Garaje() {
        espacios = new ArrayList<>(NUMERO_ESPACIOS);
    }
    
    // Método para agregar un vehículo al garaje
    public void agregarVehiculo(Vehiculo vehiculo) {
        espacios.add(vehiculo);
    }
    
    // Implementación del método calcularIngresos de la interfaz iGarage
@Override
    public double calcularIngresos() {
        double totalIngresos = 0.0;
        for (Vehiculo vehiculo : espacios) {
            totalIngresos += vehiculo.getImpuestoCirculacion() + vehiculo.getCuotaMesGaraje();
        }
        return totalIngresos;
    }
    
    // Implementación del método calcularOcupacionPorTipoVehiculo de la interfaz iGarage
@Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo vehiculo) {
        int count = 0;
        for (Vehiculo v : espacios) {
            if (v.getClass().equals(vehiculo.getClass())) {
                count++;
            }
        }
        return count;
    }
}
