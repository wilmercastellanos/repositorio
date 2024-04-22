
package taller;

/**
 *
 * @author maria eugenia
 */

import java.util.Scanner;
public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("cuantos alumnos va a procesar ");
        int numAlumnos = sc.nextInt();
        sc.nextLine ();
        
        String [][] alumnos = new String [numAlumnos][2];  
        
        for(int i=0;i<alumnos.length;i++){
            System.out.print("alumno numero: " +(i+1));
            
            System.out.print("nombre: " ); 
            alumnos [i][0] = sc.nextLine();
            
            String sexo="";
            while(!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")){
                System.out.print("Indique el sexo F o M:");
                sexo=sc.nextLine();           
            }
            alumnos [i][1]=sexo;
            
            int cantM=0,cantF=0;
                
            
             for (String[] a:alumnos){
                if (a[1].equalsIgnoreCase("M"))
                    cantM++;
                else
                    cantF++;
             }

        System.out.println("Cantidad M:"+cantM);
        System.out.println("Cantidad F:"+cantF);
        
    }   
    }   
}
