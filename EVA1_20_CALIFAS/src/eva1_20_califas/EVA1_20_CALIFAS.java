/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int Calificación;
    System.out.println("Captura tu calificación:");
    Calificación = captu.nextInt();
    if ((Calificación >= 90) && (Calificación <= 100)){
    System.out.println("Tu calificación es: A");
    }else if ((Calificación >= 80) && (Calificación <= 89)){
    System.out.println("Tu calificación es: B");
    }else if ((Calificación >= 70) && (Calificación <= 79)){
    System.out.println("Tu calificación es: C");
    }else if ((Calificación >= 60) && (Calificación <= 69)){
    System.out.println("Tu calificación es: D");
    }else if ((Calificación >= 0) && (Calificación <= 59)){
    System.out.println("Tu calificaciñon es: F");
    }else 
        System.out.println("Opción inválida");
    }
}
