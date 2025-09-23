/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author Aymara
 */
public class EVA1_21_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DIFERENTES OPERACIONES:
        // POTENCIA:
        int valor = 2, expo = 3;
        double resu;
        resu = Math.pow(valor, expo);
        System.out.println("2 elevado al cubo =");
        System.out.println(resu);
        // RAIZ CUADRADA:
        int valor2 = 100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.println("Raíz de 100 =");
        System.out.println(resu2);
        // OTRAS RAICES
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3, 1.0/3.0);
        System.out.println("La raíz cúbica de 12 = ");
        System.out.println(resu3);
        // DIVISION ENTRE ENTEROS 
        System.out.println("7/2 = ");
        System.out.println(7.0/2.0);
        // DIVISION EXACTA
        int num1 = 2024, num2 = 4;
        int residuo;
        residuo = num1 % num2; //Calculo del residuo
        System.out.println("2024 / 4 el residuo es:");
        
        
        
        
    }
    
}
