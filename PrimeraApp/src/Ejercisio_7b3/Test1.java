
package Ejercisio_7b3;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Test1 {
     public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("1234ABC", 200, 50, 1500, false);
        Vehiculo vehiculo2 = new Vehiculo("1234ABC", 200, 50, 1500, false);

        System.out.println("Vehículo 1: " + vehiculo1.getMatricula());
        System.out.println("Vehículo 2: " + vehiculo2.getMatricula());

        vehiculo1.cambioSentido();
        vehiculo2.cambioSentido();

        vehiculo1.acelerar(30);
        vehiculo2.frenar(20);

        System.out.println("Velocidad actual vehículo 1: " + vehiculo1.getVelocidadActual());
        System.out.println("Velocidad actual vehículo 2: " + vehiculo2.getVelocidadActual());

        System.out.println("Multa vehículo 1: " + vehiculo1.multar());
        System.out.println("Multa vehículo 2: " + vehiculo2.multar());

        System.out.println("¿Los vehículos son iguales?: " + vehiculo1.esIgual(vehiculo2));


    }
}
