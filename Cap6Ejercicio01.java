/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 * Author:Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Cap6Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Si quieres empezar el juego pulse 1(yes)/cualquier otra tecla(no): ");
        int yes_no = sc.nextInt();
        if (yes_no == 1){
            int i = 0;
            int suma = 0;
            do{
                i++;
                System.out.print("Tire el "+i+" dado, pulse 2: ");
                int start = sc.nextInt();
                if(start == 2){
                    int num_dado = (int)(Math.random()*6)+1;
                    System.out.println(num_dado);
                    suma+=num_dado;
                }else {
                    System.out.println("FIN DEL JUEGO ");
                }
            }while(i < 3);
            System.out.println("La suma total es de : "+suma);
        }else {
            System.out.println(" FIN DEL JUEGO");
        } 
        sc.close(); 
    }
}