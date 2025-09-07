/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        System.out.println("Introduce tu nombre completo:");
        //CAPTURA DE DATOS:
        int edad;
        double promedio;
        Scanner input = new Scanner (System.in); //CREA EL SCANNER
        //AGREGAR SCANNER INPUT
        Nombre = input.nextLine(); //CAPTURA TEXTO (nextLine())
        System.out.println("Introduce tu edad:");
        edad = input.nextInt();
        System.out.println("Captura tu promedio de la preparatoria:");
        promedio = input.nextDouble();
        System.out.println("El nombre es:");
        System.out.println(Nombre);
        System.out.println("La edad es:");
        System.out.println(edad);
        System.out.println("El promedio es:");
        System.out.println(promedio);
        
    }
    
}
