
package Ejercisio_8a1;

/**
 *
 * @author Wilmer Felipe Castellanos
 */

public class Test1 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo", 0, 0, "Rojo", 5, 3);
        System.out.println("Triángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Posición X: " + triangulo.getPosicionX());
        System.out.println("Posición Y: " + triangulo.getPosicionY());
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());

        Cuadrado cuadrado = new Cuadrado("Cuadrado", 0, 0, "Azul", 4);
        System.out.println("Cuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Posición X: " + cuadrado.getPosicionX());
        System.out.println("Posición Y: " + cuadrado.getPosicionY());
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println("Lado: " + cuadrado.getLado());
    }
}
