
package taller;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar codigo:20232216629
 */

import java.util.Scanner;
public class ejercisio1 {
    public static void main(String[] args) {
        double precioComputadora = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantas computadoras compró:");
        int numero = scanner.nextInt();

        double valorTotal = numero * precioComputadora;
        double descuento;

        if (numero < 5) {
            descuento = 0.1;
        } else if (numero < 10) {
            descuento = 0.2;
        } else {
            descuento = 0.4;
        }

        double valorConDescuento = valorTotal - (valorTotal * descuento);

        // Mostrar el resultado
        System.out.println("valor total: $" + valorTotal);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("valor con descuento: $" + valorConDescuento);
    }
}

