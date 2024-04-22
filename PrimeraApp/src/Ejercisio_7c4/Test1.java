
package Ejercisio_7c4;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class Test1 {
    public static void main(String[] args) {
        Teatro teatro = new Teatro("Teatro Pigoanza", "Calle 8 # 123", 4);

        teatro.añadirSesión("Mañana", 20.0);
        teatro.añadirSesión("Tarde", 30.0);
        teatro.añadirSesión("Noche", 40.0);

        teatro.consultarSesiones();

        teatro.cambiarNombre("Nuevo Teatro");

        System.out.println("Después de cambiar el nombre del teatro:");
        teatro.consultarSesiones();
    }
}
