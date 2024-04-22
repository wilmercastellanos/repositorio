
package Ejercisio_7c4;

/**
 *
 * @author maria eugenia
 
 7.c.4. El teatro. Vamos a tratar la gestión de un día de un teatro. El teatro se identifica por su nombre y su
dirección y en él se realizan 4 sesiones al día. Cada sesión tiene un nombre y un precio. Hacer las
clases Teatro y Función, con los atributos necesarios. Añadir los métodos necesarios, constructor
completo incluido, teniendo en cuenta que: se pueda cambiar el nombre del teatro, y el nombre y
precio de la sesión, y consultar las sesiones existentes en el teatro, pero no se puede cambiar la
dirección del teatro (una vez que ya se ha creado con un constructor)
 */
public class Teatro {
    private String nombre;
    private final String direccion;
    private final Función[] sesiones;
    private int cantidadSesiones;

    public Teatro(String nombre, String direccion, int cantidadMaximaSesiones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.sesiones = new Función[cantidadMaximaSesiones];
        this.cantidadSesiones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void añadirSesión(String nombre, double precio) {
        if (cantidadSesiones < sesiones.length) {
            sesiones[cantidadSesiones] = new Función(nombre, precio);
            cantidadSesiones++;
        } else {
            System.out.println("No se puede agregar ");
        }
    }

    public void consultarSesiones() {
        System.out.println("Sesiones en el teatro " + nombre + ":");
        for (int i = 0; i < cantidadSesiones; i++) {
            System.out.println("Nombre: " + sesiones[i].getNombre() + " Precio: " + sesiones[i].getPrecio());
        }
    }

    class Función {
        private String nombre;
        private double precio;

        public Función(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
}
    
