/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA1_18_ACCESO {
    //Constantes: indentificadores que no pueden cambiar de valor.E con la palabra
    //Static: es para que se pueda usar en el main
    final static String USUARIO = "Aymara";
    final static String PWD = "0987";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String usu, contra;
       Scanner input = new Scanner (System.in); 
       System.out.println("Bienvenido");
       System.out.println("Sistema de venta Restaurante");
       System.out.println("Usuario:");
       usu = input.nextLine();
       System.out.println("Constraseña:");
       contra = input.nextLine();
       if(usu.equals(USUARIO)){//Usuario correcto
       if(contra.equals(PWD)){//Contraseña correcta
       System.out.println("Acceso concedido!");
       }else{//Contraseña incorrecta
       System.out.println("Acceso denegado!");
       }
       }else{//Usuario incorrecto
       System.out.println("Acceso denegado!");
       }
    }
       }
       