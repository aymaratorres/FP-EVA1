/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;


/**
 *
 * @author Aymara
 */
public class EVA1_17_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Meses del año del 1 al 12
        int mes;   
        Scanner captu = new Scanner(System.in);
        System.out.println("Caputa el número del mes (del 1 al 12):");
        mes = captu.nextInt();
        if (mes == 1){
        System.out.println("Enero");
        }else if (mes == 2){
        System.out.println("Febrero");
        }else if (mes == 3){
        System.out.println("Marzo");
        }else if (mes == 4){
        System.out.println("Abril"); 
        }else if( mes == 5){
        System.out.println("Mayo");
        }else if (mes == 6){
        System.out.println("Junio");
        }else if (mes == 7){
        System.out.println("Julio");
        }else if (mes == 8){
        System.out.println("Agosto");
        }else if (mes == 9){
        System.out.println("Septiembre");
        }else if (mes == 10){
        System.out.println("Octubre");
        }else if (mes == 11){
        System.out.println("Noviembre");
        }else if (mes == 12){
        System.out.println("Diciembre");
    }
   } 
}
