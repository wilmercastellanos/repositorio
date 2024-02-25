
package taller;

/**
 *
 * @author Wilmer felipe castellanos salazar 20232216629
 * 
 * -El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
de 25 años o más.
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
