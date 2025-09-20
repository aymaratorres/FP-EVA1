/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Calificación;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce la calificación:");
        Calificación = input.nextInt();
        //ESTRUCTURA DE CONTROL IF
        if (Calificación >= 70){//Bloque verdadero ->SI)
            System.out.println("Acreditado!!");
        }else{//Bloque falso --> opcional SI-NO            
        System.out.println("No acreditado!!");
        } 
    }
}
