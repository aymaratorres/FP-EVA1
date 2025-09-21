/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_19_ANTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int edad;
    boolean credencial;
    System.out.println ("Captura tu edad:");
    edad = captu.nextInt();
    System.out.println ("¿Tienes credencial para votar? (true/false)");
    credencial = captu.hasNextBoolean();
    //Usamos AND &&
    //Mayor de edad y tener credencial
    //(edad <= 18) &6 (credencial == true)
    if((edad >= 18) && (credencial == true)){
    System.out.println("Puedes entrar!!");
    }else{
     System.out.println("No puedes entrar!!");
    } 
    
            

    }
    
}
