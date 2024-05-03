
package Ejercisio_8a1;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public class mejoras {
    // Mejora 1: Crea 2 Cuadrados y 2 Rectángulos, mételos todos en un array, y recorriendo luego el array, escribe en consola:
// - La suma de las areas de todas las formas del array
// - La media de las areas de solo los cuadrados que hay en el array
public class TestMejora1 {
    public static void main(String[] args) {
        // Crear las formas
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Azul", 4);
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 0, 0, "Verde", 5);
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo1", 0, 0, "Rojo", 3, 6);
        Rectangulo rectangulo2 = new Rectangulo("Rectangulo2", 0, 0, "Amarillo", 4, 8);

        // Agregar las formas a un array
        Forma[] formas = {cuadrado1, cuadrado2, rectangulo1, rectangulo2};

        // Calcular la suma de las áreas de todas las formas
        double sumaAreas = 0.0;
        // Contador para calcular la media de las áreas de los cuadrados
        int contadorCuadrados = 0;
        double sumaAreasCuadrados = 0.0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        // Imprimir la suma de las áreas de todas las formas
        System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
        
        // Imprimir la media de las áreas de los cuadrados
        if (contadorCuadrados > 0) {
            double mediaAreasCuadrados = sumaAreasCuadrados / contadorCuadrados;
            System.out.println("Media de las áreas de los cuadrados: " + mediaAreasCuadrados);
        } else {
            System.out.println("No hay cuadrados en el array.");
        }
    }
}

// Mejora 2: Crea una interfaz llamada IFormas que tenga el método abstracto calcularPerimetro().
// Haz que ambas clases Triangulo y Cuadrado implementen dicha interfaz (el triangulo es Isósceles), y
// prueba los métodos.
interface IFormas {
    double calcularPerimetro();
}

// Clase Forma modificada para que el método calcularArea() sea abstracto
abstract class Forma {
    private String nombre;
    private double posicionX;
    private double posicionY;
    private String color;

    public Forma(String nombre, double posicionX, double posicionY, String color) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    public abstract double calcularArea();

    // Getters y setters
}

// Clase Triangulo modificada para implementar la interfaz IFormas
class Triangulo extends Forma implements IFormas {
    private double base;
    private double altura;

    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método de la interfaz IFormas
    @Override
    public double calcularPerimetro() {
        // Para un triángulo isósceles, el perímetro es base + 2 * lado
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }
}

// Clase Cuadrado modificada para implementar la interfaz IFormas
class Cuadrado extends Forma implements IFormas {
    private double lado;

    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Método de la interfaz IFormas
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
    
}
