
package pkginterface;


public class Interface {

   
    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();
        
        c.avanzar();
        m.avanzar();
        m.sentarse();
    }
    
}
