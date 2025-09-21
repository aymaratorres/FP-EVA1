/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_22_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int year, resi4, resi100, resi400;
    System.out.println("Año a verificar:");
    year = captu.nextInt();
    resi4 = year % 4;
    resi100 = year % 100;
    resi400 = year % 400;
    if(resi4 == 0){//División exacta entre 4
    }if(resi100 == 0){
    System.out.println("El año:");
    System.out.println(year);
    System.out.println("Es Bisiesto");
    }else{//Si no es divisble entre 100 es Bisiesto
    System.out.println("El año:");
    System.out.println(year);
    System.out.println("No es Bisiesto");
    }
    }
}
