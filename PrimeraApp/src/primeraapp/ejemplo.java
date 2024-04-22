/*En un torneo hípico se registra la información de las carreras del torneo, indicando el código del jockey ganador, el tiempo del ganador (en segundos)
, el código del jockey que llegó en segundo lugar y el tiempo empleado por este (en segundos) y el código del jockey que llegó en tercer lugar 
y el tiempo empleado por este (en segundos). La información. se encuentra registrada en un. arreglo, donde cada fila corresponde a una carrera del torneo, 
del siguiente estilo.
No. Carrera    Ganador    Tiempo
Ganador    Segundo    Tiempo
Segundo    Tercero    Tercero
0    3    120    2    124    1    128
1    1    119    2    125    3    130
El arreglo puede contener la información de N carreras. Además, se tiene arreglo donde están almacenados los nombres de los jockeys. El código del jockey 
Ginete). es la posición que ocupa en el arreglo.
Así, el código de Ana eso, el código de Pedro es y así sucesivamente. Jeniendo en cuenta la información disponible, lo que se solicita 
es un programa que cumpla los siguientes requerimientos.1. (10%). Debe capturar los datos del jockey en un. arreglo unidimensional y generar de 
forma aleatoria los datos de un numero de carreras del torneoque no sea mayor a 20.ގse debe2. (25%). Debe. e generar un nuevo arreglo que tenga 5 columnas. 
En la primera columna va el código del jinete, en las siguientes 3, registrar la cantidad de carreras donde ocupó el primero, segundo o tercer puesto. 
En la columna cinco debe calcular la puntuación que se les da a los jockeys participantes. El esquema de puntuación es el siguiente: (a) Por cada carrera 
ganada se le otorgan 5 puntos si la diferencia de tiempo entre el ganador y el segundo puesto e - es mayor a 5 segundos se le otorga un punto adicional al 
ganador (b) Por cada vez que ocupa el segundo puesto se le otorgan 3 puntos. (c) Por cada vez que ocupa el tercer puesto se le otorga punto.3. (15%). 
Finalmente debe, e generar el podio, indicando el nombre de los jinetes que ocuparon los tres primeros puestos en el torneo, teniendo en cuenta la 
puntuación recibida y caso de empates, deberá la cantidad de carreras ganadas*/

import java.util.*;

public class ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos de los jockeys
        String[] jockeys = {"Ana", "Pedro", "Juan", "Cesar", "Diana", "María"};

        // Generar datos aleatorios de carreras
        int numCarreras = (int) (Math.random() * 20) + 1; // Número de carreras entre 1 y 20
        int[][] carreras = new int[numCarreras][6]; // Arreglo para almacenar datos de las carreras
        for (int i = 0; i < numCarreras; i++) {
            carreras[i][0] = i; // Número de carrera
            carreras[i][1] = (int) (Math.random() * 6); // Código del jockey ganador
            carreras[i][2] = (int) (Math.random() * 150) + 100; // Tiempo del ganador en segundos
            carreras[i][3] = (int) (Math.random() * 6); // Código del segundo lugar
            carreras[i][4] = (int) (Math.random() * 150) + 100; // Tiempo del segundo lugar en segundos
            carreras[i][5] = (int) (Math.random() * 6); // Código del tercer lugar
        }

        // Generar arreglo para almacenar puntuaciones de jockeys
        int[][] puntuaciones = new int[6][5]; // [Jinete][CarrerasGanadas, CarrerasSegundo, CarrerasTercero, Puntuación]

        // Calcular puntuaciones y actualizar arreglo de puntuaciones
        for (int i = 0; i < numCarreras; i++) {
            int ganador = carreras[i][1];
            int segundo = carreras[i][3];
            int tercero = carreras[i][5];
            
            puntuaciones[ganador][0]++; // Incrementar carreras ganadas
            puntuaciones[segundo][1]++; // Incrementar carreras segundo
            puntuaciones[tercero][2]++; // Incrementar carreras tercero
            
            int diferenciaTiempo = carreras[i][2] - carreras[i][4]; // Diferencia de tiempo entre ganador y segundo lugar
            if (diferenciaTiempo > 5) {
                puntuaciones[ganador][3] += 6; // 5 puntos por ganar + 1 punto adicional
            } else {
                puntuaciones[ganador][3] += 5; // 5 puntos por ganar
            }
            puntuaciones[segundo][3] += 3; // 3 puntos por segundo lugar
            puntuaciones[tercero][3] += 1; // 1 punto por tercer lugar
        }

        // Generar podio
        int[][] podio = new int[3][2]; // [Posición en el podio][Código del jockey]
        for (int i = 0; i < 3; i++) {
            int maxPuntuacion = -1;
            int maxIndex = -1;
            for (int j = 0; j < 6; j++) {
                if (puntuaciones[j][3] > maxPuntuacion) {
                    maxPuntuacion = puntuaciones[j][3];
                    maxIndex = j;
                } else if (puntuaciones[j][3] == maxPuntuacion) {
                    if (puntuaciones[j][0] > puntuaciones[maxIndex][0]) {
                        maxIndex = j; // Si hay empate en la puntuación, se considera la cantidad de carreras ganadas
                    }
                }
            }
            podio[i][0] = maxIndex; // Código del jockey en el podio
            podio[i][1] = maxPuntuacion; // Puntuación del jockey en el podio
            puntuaciones[maxIndex][3] = -1; // Marcar como procesado
        }

        // Imprimir resultados
        System.out.println("Podio del torneo:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + jockeys[podio[i][0]] + " - Puntuación: " + podio[i][1]);
        }
    }
}