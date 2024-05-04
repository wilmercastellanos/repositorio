package Parcial2;

import java.util.ArrayList;

/**
 *
 * @author maria eugenia
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
