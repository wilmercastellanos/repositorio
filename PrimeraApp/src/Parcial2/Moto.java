
package Parcial2;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 * Crear clase Moto que hereda de Vehiculo. Esta clase tiene además las siguientes
características atributo:
• Un atributo; boolean tieneSidecar que se asigna en el constructor
• Además para una moto, el impuestoCirculacion se incrementa en un 10% más al
precio de la cuota normal de moto si tiene sidecar.
• El atributo cuotaMesGarage se aumenta en 50 % si tiene sidecar.
 */
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
        ajusteCuotaMesGaraje();
        calcularImpuestoCirculacion();
    }
    
    @Override
    public void calcularImpuestoCirculacion(){
        double impuestoB = getPrecio() * 0.02;  
        if (tieneSidecar){
            impuestoCirculacion = impuestoB * 1.10; 
        } else {
            impuestoCirculacion = impuestoB;
        }
    }
    
    private void ajusteCuotaMesGaraje() {
        if (tieneSidecar) {
            double nuevaCuotaMes = getCuotaMesGaraje() * 1.5;
            setCuotaMesGaraje(nuevaCuotaMes);
        } else {
            // Revertir el ajuste si pierde el sidecar
            double nuevaCuotaMes = getCuotaMesGaraje() / 1.5;
            setCuotaMesGaraje(nuevaCuotaMes);
        }
    }
    
    @Override
    public double getCuotaMesGaraje() {
        return super.getCuotaMesGaraje();
    }

    @Override
     public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            CUOTA_MES_GARAJE = cuotaMesGaraje;
        } else {
            System.out.println("La cuota de mes de garaje no puede ser negativa.");
        }
    }
}

     
    
  
    

