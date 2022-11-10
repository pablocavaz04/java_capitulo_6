/*
 * Author: Pablo Camino Vázquez
3) Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.

 */
import java.util.Scanner;
public class Cap6Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String derivado = " ";
        int numero1 = (int)(Math.random()*10)+1;
        switch (numero1) {
            case 1:
                derivado = "AS";
                break;
            case 8:
                derivado = "Sota";
                break;
            case 9:
                derivado = "Caballo";
                break;
            case 10:
                derivado = "Rey";
                break;
            default:
            derivado = String.valueOf(numero1);
                break;
        }
        String palo = " ";
        int numero2 = (int)(Math.random()*4)+1;
        switch (numero2) {
            case 1:
                palo = "⚔️";
                break;
            case 2:
                palo = "🪙";
                break;
            case 3:
                palo = "🍷";
                break;
            case 4:
                palo = "🏏";
                break;
        }
        System.out.println("Tu carta es un "+derivado+" de "+palo);

    }
}
