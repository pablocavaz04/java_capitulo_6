import java.util.Scanner;
public class Cap6Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su apuesta: ");
        float apuesta = sc.nextFloat();
        int dado_1 = (int)(Math.random()*6 + 1);
        int dado_2 = (int)(Math.random()*6 + 1);
        System.out.println("Dado 1: " + dado_1);
        System.out.println("Dado 2: " + dado_2);
        System.out.println();
        int sumaDado_1 = dado_1 + dado_2;
        int sumaDado_2 = 0;
        boolean fin = false;
        if ((sumaDado_1) == 7 ||(sumaDado_1) == 11) {
            System.out.println("GANASTE!, ha ganado un total de: " + (apuesta * 2) + "€");
        } else if ((sumaDado_1) == 2 || (sumaDado_1) == 3 || (sumaDado_1) == 12) {
            System.out.println("HAS PERDIDO");
        } else {
            do {
                dado_1 = (int)(Math.random()*6 + 1);
                dado_2 = (int)(Math.random()*6 + 1);
                System.out.println("Dado 1: " + dado_1);
                System.out.println("Dado 2: " + dado_2);
                System.out.println();
                sumaDado_2 = dado_1 + dado_2;
                if (sumaDado_1 == sumaDado_2) {
                    System.out.println("GANASTE!, ha ganado un total de: " + (apuesta * 2) + "€");
                    fin = true;
                } else if (sumaDado_2 == 7) {
                    System.out.println("HAS PERDIDO");
                    fin = true;
                } else {
                    sumaDado_1 = sumaDado_2;
                }
            } while (!fin);
            sc.close();
        }
    }
}