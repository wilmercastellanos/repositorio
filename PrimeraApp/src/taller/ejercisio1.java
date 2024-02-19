
package taller;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar codigo:20232216629
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
    }
}

