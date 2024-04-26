/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.t6cchiclesmiguelangel;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class T6CChiclesMiguelAngel {

    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        int numeroEnvoltoriosNecesarios;
        int numeroChiclesRegaladosPorEnvoltorio;
        int numeroDeChiclesComprados;
        
        boolean salir = true;
        
        do {            
            System.out.println("Introduzca el número de envoltorios necesarios para "
                    + "que te regalen un chicle.");
            
            numeroEnvoltoriosNecesarios = pedirNumero();
            
            System.out.println("Introduzca el número de chicles que se regalan:");
            
            numeroChiclesRegaladosPorEnvoltorio = pedirNumero();
            
            System.out.println("Introduzca el número de chicles Comprados:");
            
            numeroDeChiclesComprados = pedirNumero();
            System.out.println("---------------------------------------");
            
            viabilidad(numeroEnvoltoriosNecesarios, 
                    numeroDeChiclesComprados, 
                    numeroDeChiclesComprados);

        } while (!salir);
    }
    
    public static int pedirNumero() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el numero: ");
        return sc.nextInt();
    }
    
    public static boolean viabilidad(int nEnvoltoriosNecesarios, int nChiclesRegalados,
            int nChiclesComprados){
        
        boolean esViable = true;

        if (nEnvoltoriosNecesarios <= nChiclesRegalados) {
            esViable = false;
        } else {
            
            boolean terminar = true;
            
            int nChiclesMeHeComido = nChiclesComprados;
            
            do {                
                
                nChiclesMeHeComido = nChiclesMeHeComido + nChiclesComprados
                        /nEnvoltoriosNecesarios;
                int envoltoriosSobrantes = nChiclesMeHeComido % nEnvoltoriosNecesarios;
                
            } while (!terminar);
        }
        
        return esViable;
    }
}
