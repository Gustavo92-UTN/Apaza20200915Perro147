/*1 - Crear la clase Perro , la misma debe tener 3 atributos y el método ladrar() que muestre
    “Guau” por consola. Crear un objeto de esta clase y comprobar el funcionamiento
4 - Para la clase del ejercicio 1 crear un método constructor que solicite como parámetro uno
    de los atributos.
7 - Encapsular (poner todos sus atributos privados) la clase del ejercicio 1 y realizar los métodos
getter y setter necesarios.*/
package apaza20200915perro147;
import java.util.Scanner;
public class Apaza20200915Perro147 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad, opcion;
        String color, nombre;
        System.out.print("Ingrese la edad de su perro: ");
        edad = input.nextInt();
//Creando objeto de la clase Perro
        Perro dog;
        dog = new Perro(edad);
//Utilizando el metodo de la clase Perro
        dog.setEdad(edad);
        if(dog.getEdad() != edad){
            System.out.println("Edad del perro INCORRECTA");
            System.exit(0);
        }
        System.out.print("Ingrese el nombre de su perro: ");
        nombre = input.next();
        System.out.print("Elija el color de su perro del menu de opciones" +
                        "\n1. Negro" + 
                        "\n2. Blanco" + 
                        "\n3. Marron" + 
                        "\n4. Crema" + 
                        "\n5. Gris" + 
                        "\n6. Blanco con negro" + 
                        "\n7. Crema con marron" + 
                        "\n8. Gris con crema" +
                        "\nOpcion: ");
        opcion = input.nextInt();
        
        while(opcion < 1 || opcion > 8){
            System.out.print("Eleccion Incorrecta, elija una opcion del menu: ");
            opcion = input.nextInt();
        }
        
        switch (opcion){
            case 1:
                color = "Negro";
                break;
            case 2:
                color = "Blanco";
                break;
            case 3:
                color = "Marron";
                break;
            case 4:
                color = "Crema";
                break;
            case 5:
                color = "Gris";
                break;
            case 6:
                color = "Blanco con negro";
                break;
            case 7:
                color = "Crema con marron";
                break;
            default:
                color = "Gris con crema";
        }
        
        System.out.println("\nLos datos de su perro son:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
//Utilizando los metodos de la clase Perro
        System.out.println("Edad: " + dog.getEdad());
        dog.ladrar();
    }
}