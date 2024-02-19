
package taller;

/**
 *
 * @author Wilmer felipe castellanos salazar 202322216629
 */

import java.util.Scanner;
public class ejercisio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("cuantos años tiene:");
        int edad = scanner.nextInt();
        
        System.out.print("desde que edad trabaja en la empresa:");
        int edadTrabajo = scanner.nextInt();

        
        int antiguedad = edad - edadTrabajo;

        if (edad > 60 && antiguedad < 25 ) {
            System.out.println("esta inscrito a jubilacion por edad");
        } else if (edad < 60 && antiguedad > 25) {
            System.out.println("esta inscrito a jubilacion por antiguedad joven");
        } else if (edad > 60 && antiguedad > 25) {
            System.out.println("esta inscrito a jubilacion por antiguedad antiguedad adulta");
        }
    
    }
    
}
