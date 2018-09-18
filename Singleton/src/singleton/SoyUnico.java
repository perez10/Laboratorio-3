
package singleton;

//Se implementa una sola instancia del objeto

public class SoyUnico {
    
    private static SoyUnico log;
    private SoyUnico(){
    }
    public static SoyUnico getInstance(){
        if(log==null){
            log=new SoyUnico();
        }
        return log;
    }
    
    //metodo log
    public void log(String msg){
        System.out.println(msg);
    }
            
}
