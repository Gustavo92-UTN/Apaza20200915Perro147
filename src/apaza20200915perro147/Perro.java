package apaza20200915perro147;
public class Perro{
//Asignando atributos o propiedades a la clase Perro
    private int edad;
    private String nombre;
    private String color;
//Creando contructor que reciba como parametro uno de sus atributos
    public Perro(int edad){
        System.out.println("Creando un perro...");
    }
//Creando metodo para la clase Perro
    public void ladrar(){
        System.out.println("GUAU");
    }
    
    public void setEdad(int edad){
        if(edad > 0 && edad < 30){
            this.edad = edad;
        }
    }
    
    public int getEdad(){
        return edad;
    }
    
}
