/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_operaciones_logicas;

/**
 *
 * @author Aymara
 */
public class EVA1_11_OPERACIONES_LOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio = 5; //declaramos e inicializamos
        boolean resu; 
        //OPERACIONES LOGICAS: COMPARACIONES:
        //RESULTADO: VERDADERO O FALSO
        resu = radio > 0;//radio es mayor que cero?
        System.out.println("radio (5) > 0 -->");
        System.out.println(resu);
        
        resu = radio < 0;//radio menor que cero?
        System.out.println("radio (5) < 0 -->");
        System.out.println(resu);
        
        resu = radio == 0;//radio igual que cero?
        System.out.println("radio (5) == 0 -->");
        System.out.println(resu);
        
        resu = radio != 0;//radio diferente que cero?
        System.out.println("radio (5) != 0 -->");
        System.out.println(resu);
        
    
        
    }
    
}
