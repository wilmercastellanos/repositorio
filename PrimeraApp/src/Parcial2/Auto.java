package Parcial2;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar Crear clase Auto que hereda de
 * Vehiculo. Esta clase tiene además los atributos: • boolean tieneRadio , que
 * se asigna en el constructor • boolean tieneNavegador , que se asigna en el
 * constructor
 *
 * • Además para un auto, el impuestoCirculacion se incrementa en un 1% más al
 * precio de la cuota normal de vehículo si tiene radio y un 2% más al precio de
 * la cuota normal de vehículo si tiene navegador. • El atributo cuotaMesGarage
 * se aumenta en 20 % si el cilindraje del auto es mayor de 2499.
 */
public final class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuestoCirculacion();
        //cambioMesGaraje();
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneRadio) {
            double impuestoRadio = getImpuestoCirculacion();
            double aumento = (getPrecio() * 0.1);
            setImpuestoCirculacion(impuestoRadio + aumento);

            if (tieneRadio) {
                double impuestoNavegador = getImpuestoCirculacion();
                double incremento = (getPrecio() * 0.2);
                setImpuestoCirculacion(impuestoNavegador + incremento);
            }
        }

       /* private void cambioMesGaraje() {
        if (getCilindraje() >= 2499) {
            double impuestoCircul = getImpuestoCirculacion();
            double incremento = (getCuotaMesGaraje() * 0.2);
            setImpuestoCirculacion(impuestoCircul + incremento);
        }*/
        }
    }
