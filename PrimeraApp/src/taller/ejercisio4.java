
package taller;

/**
 *
 * @author Wilmer felipe castellanos salazar 20232216629
 */

import java.util.Scanner;
public class ejercisio4 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantos kilos de manzana compro:");
        double kilos = scanner.nextDouble();

       double descuento = 0;

       if (kilos > 10.0) {
            descuento = 20;
        } else if (kilos > 5.0) {
            descuento = 15;
        } else if (kilos > 2.0) {
            descuento = 10;
        } else if (kilos > 0.0) {
            descuento = 0;
        }
  
        System.out.println("Descuento del: " + (descuento) + "%");

    }
    
}
