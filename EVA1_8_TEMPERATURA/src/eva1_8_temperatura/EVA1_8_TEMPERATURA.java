/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_temperatura;

/**
 *
 * @author Aymara
 */
public class EVA1_8_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  constante, proporcionalidad, denominador, fahrenheit, celsius; //todas son doubles
        constante = 32;
        proporcionalidad = 5;
        denominador = 9;
        fahrenheit = 80.2;
        celsius = (fahrenheit - constante) * proporcionalidad / denominador;
        System.out.println("Celsius = 80.2");
        System.out.println(celsius);
        
       
   
        // TODO code application logic here
    }
    
}
