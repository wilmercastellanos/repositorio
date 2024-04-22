
package Ejercisio_7a1;

/**
 *
 * @author Wilmer Felipe Castellanos salazar
 */
public class Test1 {
  
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(6, 6);
        Triangulo triangulo2 = new Triangulo(10, 10);
      
        System.out.println("Triangulo 1 - Base: " + triangulo1.getBase() + ", Altura: " + triangulo1.getAltura());
        System.out.println("Área del Triangulo 1: " + triangulo1.calcularArea());

        System.out.println("\nTriangulo 2 - Base: " + triangulo2.getBase() + ", Altura: " + triangulo2.getAltura());
        System.out.println("Área del Triangulo 2: " + triangulo2.calcularArea());


        triangulo1.setBase(10);
        triangulo1.setAltura(12);


        System.out.println("\nTriangulo 1 - Base: " + triangulo1.getBase() + ", Altura: " + triangulo1.getAltura());
        System.out.println("Área del Triangulo 1: " + triangulo1.calcularArea());
    }
}

