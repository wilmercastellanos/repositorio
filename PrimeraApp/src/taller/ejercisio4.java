
package taller;

/**
 *
 * @author Wilmer felipe castellanos salazar 20232216629
 * -Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
        0 - 2 0%
        2.01 - 5 10%
        5.01 - 10 15%
       10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería
 */

import java.util.Scanner;
public class ejercisio4 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantos kilos de manzana compro:");
        double kilos = scanner.nextDouble();


       if (kilos > 10.0) {
            System.out.println("descuento del 20%");
        } else if (kilos > 5.0) {
            System.out.println("descuento del 15%");
        } else if (kilos > 2.0) {
            System.out.println("descuento del 10%");
        } else if (kilos > 0.0) {
            System.out.println("descuento del 5%");
        }
  

    }
    
}
