/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author mi pc
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        float dato;
        char signo;
        Scanner Entrada = new Scanner(System.in);
        Calculadora Obj = new Calculadora();
        
        System.out.println("Calculadora");
        
        System.out.print("Digite el primer numero: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setPrimerNum(dato);
        
        System.out.print("Digite el segundo numero: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setSegundoNum(dato);
        
        System.out.println("Para sumar --> + ||"
                + " Para restar --> - ||"
                + " Para multiplicar --> * ||"
                + " Para dividir --> / ");
        System.out.print("Introduzca el signo: ");
        signo = Entrada.nextLine().charAt(0);
        Obj.setSigno(signo);
        System.out.println(Obj.Calculadora());
    }
    
}
