package Parcial2;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar Crear clase Moto que hereda de
 * Vehiculo. Esta clase tiene además las siguientes características atributo: •
 * Un atributo; boolean tieneSidecar que se asigna en el constructor • Además
 * para una moto, el impuestoCirculacion se incrementa en un 10% más al precio
 * de la cuota normal de moto si tiene sidecar. • El atributo cuotaMesGarage se
 * aumenta en 50 % si tiene sidecar.
 */
public final class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        ajusteCuotaMesGaraje();
        calcularImpuestoCirculacion();
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            double impuestoMoto = getImpuestoCirculacion();
            double aumento = (getPrecio() * 0.1);
            setImpuestoCirculacion(impuestoMoto + aumento);
        } 
    }

    private void ajusteCuotaMesGaraje() {
        if (tieneSidecar) {
            double nuevaCuotaMes = (getCuotaMesGaraje() * 0.5);
            setCuotaMesGaraje(getCuotaMesGaraje() + nuevaCuotaMes);
        }
    }

}
