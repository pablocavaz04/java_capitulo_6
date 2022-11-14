/*
 * Author:Pablo Camino Vázquez
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir
 */
import java.util.Scanner;
public class Cap6Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero que voy a intentar adivinar: ");
        int na = sc.nextInt();
        int i= 1;
        int numero = 0;

        do{
            numero = (int)(Math.random()*101);
            if(numero == na){
                System.out.println("El programa ha adivinado el numero: "+numero);
                i=6;
            }else if (na > numero){
                System.out.println("El numero es mayor que el numero: "+numero);
                i++;
                
            }else if ( na < numero ){
                System.out.println("El numero es menor que el numero:  "+numero);
                i++;
            }

        }while(i<6);
        System.out.println("No he podido adivnarlo");
        
    }
}