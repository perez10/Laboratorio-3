
package pkginterface;


public class Moto implements Llanta,Asiento{

   public Moto(){
   
   }
    public void avanzar() {
        System.out.println("El moto avanza");
    }


    public void detener() {
        System.out.println("El moto se detiene");
    }

    public void sentarse() {
        System.out.println("Sentarse");
    }
    
}
