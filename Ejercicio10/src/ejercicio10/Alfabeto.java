
package ejercicio10;

public class Alfabeto {
    private char letraUno;
    private char letraDos;

    public char getLetraUno() {
        return letraUno;
    }

    public void setLetraUno(char letraUno) {
        this.letraUno = letraUno;
    }

    public char getLetraDos() {
        return letraDos;
    }

    public void setLetraDos(char letraDos) {
        this.letraDos = letraDos;
    }
    
    public char EvaluarLetra(){
        if(letraUno< letraDos) {
            System.out.println("Estan en orden alfabetico");
        }else if(letraUno == letraDos) {
            System.out.println("Las dos letras son iguales");
        }
        else{
            System.out.println("No estan en orden alfabetico");
        }
        return 0;
   
    }
}
