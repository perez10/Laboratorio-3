
package singleton;


public class Singleton {

   
    public static void main(String[] args) {
      SoyUnico logger = SoyUnico.getInstance();
      logger.log("Hola mundo");
    }
    
}
