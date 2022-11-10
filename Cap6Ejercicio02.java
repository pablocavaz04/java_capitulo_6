/*
 * Author: Pablo Camino Vázquez
2) Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
 */
import java.util.Scanner;
public class Cap6Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String derivado = " ";
        int numero1 = (int)(Math.random()*13)+1;
        switch (numero1) {
            case 1:
                derivado= "AS";
                break;
            case 11:
                derivado= "J";
                break; 
            case 12:
                derivado="Q";
            case 13:
                derivado="K";
            default:
            derivado = String.valueOf(numero1);
                break;  
        }

        int numero2 = (int)(Math.random()*4)+1;
        String palo = " ";
        switch (numero2) {
            case 1:
                palo = "♠";
                break;
            case 2:
                palo = "♣";
                break;
            case 3:
                palo = "♥";
                break;
            case 4:
                palo = "♦";
                break;
        }
        System.out.println("Tu carta es un "+derivado+" de "+palo);

    }
}
