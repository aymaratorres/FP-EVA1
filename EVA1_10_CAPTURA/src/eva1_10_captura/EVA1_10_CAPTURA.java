/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VELOCIDAD = DISTANCIA / TIEMPO
        // m/s
        double distancia, tiempo, velocidad;
         Scanner captu = new Scanner (System.in);//DECLARAR SCANNER
         System.out.println("Introduce la distancia: ");
        distancia = captu.nextDouble();
        System.out.println("Introduce el tiempo: ");
        tiempo = captu.nextDouble();
        //CÁLCULO:
        velocidad = distancia/tiempo;
        System.out.println("La velocidad es: ");
        System.out.println(velocidad);
        System.out.print("m/s");
    }
    
}
