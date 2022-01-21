package Ejercicio5Test;

import Ejercicio5.Determinar;
import junit.framework.TestCase;

public class DeterminarTest extends TestCase {
    
    private Determinar obj;
    
    public void escenario() {
        obj = new Determinar('b');
    }
    
    public void testeo() {
        escenario();
        assertEquals("consonante", obj.verifyCharacter());
    }
}