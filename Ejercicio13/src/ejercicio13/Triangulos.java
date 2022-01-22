package ejercicio13;

public class Triangulos {
   private float primerLado; 
   private float segundoLado; 
   private float tercerLado;

    public float getPrimerLado() {
        return primerLado;
    }

    public void setPrimerLado(float primerLado) {
        this.primerLado = primerLado;
    }

    public float getSegundoLado() {
        return segundoLado;
    }

    public void setSegundoLado(float segundoLado) {
        this.segundoLado = segundoLado;
    }

    public float getTercerLado() {
        return tercerLado;
    }

    public void setTercerLado(float tercerLado) {
        this.tercerLado = tercerLado;
    }
    
    public float EvaluarLado(){
        /*
        if( primerLado == segundoLado && primerLado == tercerLado && segundoLado == tercerLado){
            System.out.println("Es un triangulo equilatero");
        }else if (primerLado == segundoLado || primerLado < tercerLado || segundoLado < tercerLado){
            System.out.println("Es un triangulo Isosceles");
        }else if(primerLado < segundoLado && primerLado < tercerLado && segundoLado < tercerLado){
            System.out.println("Es un triangulo Escaleno");
        }
        
        else{
            System.out.println("Falta un dato");
        }
       return 0;
       */
        
        if( primerLado == segundoLado && primerLado == tercerLado && segundoLado == tercerLado){
            System.out.println("Es un triangulo equilatero");
        } else if(primerLado == segundoLado || segundoLado == tercerLado || primerLado == tercerLado) {
            System.out.println("Es un triangulo isosceles");
        } else if(primerLado != segundoLado && primerLado != tercerLado && segundoLado != tercerLado) {
            System.out.println("Es un triangulo escaleno");
        } 
        
        else {
            System.out.println("Error");
        }
        
        
        
        
        return 0;
    }
   
}
