
package taller;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar 20232216629
 */

import java.util.*;

public class parcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] jockey = {"Ana", "Pedro", "Juan", "Cesar", "Diana", "María"};
        
        /*1. capturar los datos del jockey en un arreglo y generar de 
        forma aleatoria los datos de un numero de carreras del torneoque no sea mayor a 20*/
        
        int numCarreras = 20;
        
        int[][] carreras = new int[numCarreras][7];
        for (int i =0; i<numCarreras; i++ ){
            carreras [i][0]=i;
            carreras [i][1] = (int) (Math.random() * 6);
            carreras [i][2] = (int) (Math.random() * 120) + 100;
            carreras [i][3] = (int) (Math.random() * 6);
            carreras [i][4] = (int) (Math.random() * 135) + 120;
            carreras [i][5] = (int) (Math.random() * 6);
            carreras [i][6] = (int) (Math.random() * 150) + 135;                    
        }
        System.out.println("carreras: ");
        for (int i = 0; i < numCarreras; i++) {
             System.out.println("carrera: " + (i + 1) + "   primero: " +carreras[i][1]+ "   tiempo: " +carreras[i][2]+ "   segundo: " +carreras[i][3]+ "   tiempo: " +carreras[i][4]+ "   tercero: " +carreras[i][5]+ "   tiempo: " +carreras[i][6] );
        }
        
        /*2. generar un nuevo arreglo que tenga 5 columnas. En la primera columna va el código del jinete,en las siguientes 3, 
        registrar la cantidad de carreras donde ocupó el primero, segundo o tercer puesto, 
        En la columna cinco debe calcular la puntuación que se les da a los jockeys participantes*/
        
        int[][] marcador = new int[6][5];
        for (int i =0;i < numCarreras; i++) {
            int primero = carreras [i][1];
            int segundo = carreras [i][3];
            int tercero = carreras [i][5];
            
            marcador [primero][0]++;
            marcador [segundo][1]++; 
            marcador [tercero][2]++; 
            
        
            
            int tPrimero = carreras [i][2];
            int tSegundo = carreras [i][4];
            int difTiempo = tPrimero - tSegundo;
            
            if (difTiempo > 5) {
                marcador[primero][3] += 6;
            } else {
                marcador[primero][3] += 5;
            }
            marcador[segundo][3] += 3;
            marcador[tercero][3] += 1;
        

            System.out.println("codigo: " + marcador [i][0] + "   puesto: " +marcador[i][1]+ "   puesto: " +marcador[i][2]+ "   puesto: " +carreras[i][3]+ "   puntos: " +carreras[i][4]);

            
        }
            
    }
}

