
package pkginterface;
//Interface es una guia para poder obligar a los de mas objetos a implementar 
//los metodos 

public class Carro implements Llanta{
    public Carro(){
    
    }

    public void avanzar() {
        System.out.println("El carro avanza");
    }

    public void detener() {
        System.out.println("El carro se detiene"); 
    }
}
