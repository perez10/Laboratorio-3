
package claseabtracto;
//no sabes que es exactamente
public abstract class Animal {
    private String nombre;
    public Animal(){
    }
    
    public void comer(){
        System.out.println("El"+nombre+"Esta comiendo");
    }
    public abstract void moverse();
    
    public void SetNombre(String s){
        nombre=s;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
}
