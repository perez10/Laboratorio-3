
package claseabtracto;

//clase abstracta no se puede instanciar
//tener control de los metodos
//clase padre
public class ClaseAbtracto {

   
    public static void main(String[] args) {
        Perro p = new Perro();
        p.comer();
        p.moverse();
        
        Ave a = new Ave();
        a.comer();
        a.moverse();
    }
    
}
