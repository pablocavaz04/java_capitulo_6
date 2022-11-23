import java.util.Scanner;
public class Cap6Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del sendero en metros: ");
        int longitud = sc.nextInt();
        int anchura = 6;
        int giro;
        int espacio = 12;
        String obstaculo = "";
        for (int i = 0; i < longitud; i++) {
            int numero_obstaculo = (int)(Math.random()*2);
            int posicion_obstaculo = (int)(Math.random()*4);
            switch (numero_obstaculo) {
                case 0:
                    obstaculo = "*";
                    break;
                case 1:
                    obstaculo = "O";
                    break;
                default:
            }
            giro = (int)(Math.random()*2);
            if (giro == 0) {
                espacio--;
            } else if (giro == 1) {
                espacio++;
            }
            for (int j = 0; j < espacio; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < anchura - 2; j++) {
                if (posicion_obstaculo == j) {
                    System.out.print(obstaculo);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        sc.close();
    }
}