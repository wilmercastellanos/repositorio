
package taller;


/**
 *
 * @author @author Wilmer Felipe Castellanos Salazar 20232216629
 * 
 * -Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%
 */

import java.util.Scanner;
public class ejercisio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el precio del aparato: ");
        int precio = scanner.nextInt();
        System.out.print("Ingrese la marca del aparato: ");
        String marca = scanner.next();

        
        int descuento = 0;
        if (precio >= 500) {
            descuento = 10;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento = 15;
        }

        int precioDescuento = descuento * (precio/100);
        int precioSinIva = precio - precioDescuento;
        double iva =precioSinIva * (19/100);
        double precioConIva = precioSinIva + iva;

        System.out.println("el total de descuento es: " + descuento + "%");
        System.out.println("el precio del descuento es: " + precioDescuento);
        System.out.println("El precio parcial es: " + precioSinIva);
        System.out.println("El precio del iva es: " + iva);
        System.out.println("El precio total es: " + precioConIva);
    }
    
}
