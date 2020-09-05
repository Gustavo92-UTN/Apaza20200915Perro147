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
        int edad,aux;
        System.out.print("Ingrese la edad de su perro: ");
        edad = input.nextInt();
//Creando objeto de la clase Perro
        Perro dog;
        dog = new Perro(edad);
//Utilizando el metodo de la clase Perro
        aux = dog.getEdad();
        if(aux == edad){
            dog.ladrar();
        }
        else{
            System.out.println("Edad del perro INCORRECTA");
        }
    }
}
