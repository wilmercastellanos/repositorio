package Parcial2;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar g. Crear una clase Garaje que tiene
 * una colección (arreglo) de espacios de Vehículos. El número de espacios es
 * una constante de la clase. Esta clase debe cumplir con la interfaz iGarage,
 * que tiene estos métodos definidos: • double calcularIngresos(); Debe calcular
 * la suma de ingresos mensuales de todos los vehículos existentes en el garaje
 * • int calcularOcupacionPorTipoVehiculo(Vehículo v); Indica cuantos vehículos
 * hay del tipo pasado por parámetro en el garaje.
 */
public class Garaje implements iGaraje {

    private static final int NUMERO_ESPACIOS = 10; // Constante para el número de espacios
    private Vehiculo[] espacios; // Arreglo de espacios para vehículos

    public Garaje() {
        espacios = new Vehiculo[NUMERO_ESPACIOS];
    }

    // Método para calcular la suma de ingresos mensuales de todos los vehículos
    @Override
    public double calcularIngresos() {
        double ingresosTotales = 0.0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo != null) {
                ingresosTotales += vehiculo.getCuotaMesGaraje();
            }
        }
        return ingresosTotales;
    }

    // Método para indicar cuántos vehículos hay del tipo pasado por parámetro en el garaje
    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int ocupacion = 0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo != null && vehiculo.getClass().equals(v.getClass())) {
                ocupacion++;
            }
        }
        return ocupacion;
    }

    // Método para agregar un vehículo al garaje
    public void ingresarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                break;
            }
        }
    }

    // Método para eliminar un vehículo del garaje
    public void retirarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] != null && espacios[i].equals(vehiculo)) {
                espacios[i] = null;
                break;
            }
        }
    }
}

    // ... (Otros métodos para consultar espacios disponibles, etc.)
