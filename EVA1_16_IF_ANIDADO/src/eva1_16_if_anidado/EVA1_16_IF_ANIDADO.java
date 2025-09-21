/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Día de la semana 1 a 7
        int día;
        Scanner captu = new Scanner (System.in);
        System.out.println("Captura el número de dìa (1 a 7):");
        día = captu.nextInt();
        if (día == 1){
        System.out.println("Domingo");
        }else if(día == 2){
        System.out.println("Lunes");
        }else if(día == 3){
        System.out.println("Martes");
        }else if(día == 4){
        System.out.println("Miércoles");
        }else if(día == 5){
        System.out.println("Jueves");
        }else if(día == 6){
        System.out.println("Viernes");
        }else if(día == 7){
        System.out.println("Sábado");
        }
    }
}
