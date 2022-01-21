package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        char dato;
        Scanner Entrada = new Scanner(System.in);
        Alfabeto Obj = new Alfabeto();
        
        System.out.println("Ver si estan en oden alfabetico");
        
        System.out.print("Inserte la primera letra: ");
        dato = Entrada.nextLine().charAt(0);
        Obj.setLetraUno(dato);
        
        System.out.print("Inserte la segunda letra: ");
        dato = Entrada.nextLine().charAt(0);
        Obj.setLetraDos(dato);
        
        System.out.println(Obj.EvaluarLetra());
        
    }
    
}
