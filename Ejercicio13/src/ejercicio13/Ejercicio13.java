/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author mi pc
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float dato;
        Scanner Entrada = new Scanner(System.in);
        Triangulos Obj = new Triangulos();
        
        System.out.println("Ver que tipo de triangulo es");
        
        System.out.println("Inserte el valor del primer lado: ");
        dato = Float.parseFloat(Entrada.nextLine().trim());
        Obj.setPrimerLado(dato); 
        
        System.out.println("Inserte el valor del segundo lado: ");
        dato = Float.parseFloat(Entrada.nextLine().trim());
        Obj.setSegundoLado(dato);
        
        System.out.println("Inserte el valor del tercer lado: ");
        dato = Float.parseFloat(Entrada.nextLine().trim());
        Obj.setTercerLado(dato);
        
        Obj.EvaluarLado();
    }
    
}
