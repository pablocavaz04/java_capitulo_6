/*
 * Author: Pablo Camino Vázquez
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */
import java.util.Scanner;
public class Cap6Ejercicio04 {
    public static void main(String[] args) {
        for(int i=1; i<=20;i++){
        int numero = (int)(Math.random()*11);
        System.out.print(numero+" " );
        }
    }
}
