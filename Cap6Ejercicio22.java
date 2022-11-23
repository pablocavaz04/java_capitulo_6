
import java.util.Scanner;

public class Cap6Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();
        int espacios= 12;
        System.out.println("            @");


        for(int i = 1; i<=altura-1 ; i++){
            int numeroposicion = (int)(Math.random()*3+1);
            String posicion = "";

            switch (numeroposicion) {
                case 1:
                    espacios--;
                    for(int b = 1; b<=espacios;b++){
                        System.out.print(" ");
                    }
                    posicion ="*";
                break;
                
                case 2:
                for(int b = 1; b<=espacios;b++){
                    System.out.print(" ");
                }
                    posicion ="*";
                break;

                case 3:
                espacios++;
                for(int b = 1; b<=espacios;b++){
                    System.out.print(" ");
                }
                    posicion ="*";
                break;
            }   

            System.out.print(posicion);
            System.out.println();
        }

        sc.close();
    }
}