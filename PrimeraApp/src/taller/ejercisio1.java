
package taller;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar codigo:20232216629
 * 
 * -En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
 */

import java.util.Scanner;
public class ejercisio1 {
    public static void main(String[] args) {
        int precioComputadora = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantas computadoras compró:");
        int numero = scanner.nextInt();

        int valorTotal = numero * precioComputadora;
        int descuento;

        if (numero < 5) {
            descuento = 10;
        } else if (numero < 10) {
            descuento = 20;
        } else  {
            descuento = 40;
        }
        int valorDescuento = descuento * (valorTotal / 100);
        int valorConDescuento = valorTotal - valorDescuento;

        System.out.println("valor total: " + valorTotal);
        System.out.println("Descuento del: " + (descuento) + "%");
        System.out.println("valor del descuento: " + valorDescuento);
        System.out.println("valor total con descuento: " + valorConDescuento);
        scanner.close();
    }
}

