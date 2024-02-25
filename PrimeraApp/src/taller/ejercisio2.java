
package taller;

import java.util.Scanner;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar 20232216629
 * 
 * -En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
        • Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
        compran de cinco a 10 y de U$50 si se compran más de 10.
        • Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
        que compra y la que tiene que pagar por el total de la compra
 */
public class ejercisio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantas llantas compro: ");
        int numero = scanner.nextInt();

        int precio;
        if (numero < 5) {
            precio = 100;
        } else if (numero >= 5 && numero <= 10) {
            precio = 75;
        } else {
            precio = 50;
        }

        int precioTotal = numero * precio;

        System.out.println("Precio de cada llanta: " + precio);
        System.out.println("Precio total: " + precioTotal);
        scanner.close();

    }      
    
}
