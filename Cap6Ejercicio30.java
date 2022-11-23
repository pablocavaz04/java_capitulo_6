import java.util.Scanner;
public class Cap6Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int anchura = 0;
        int pez1 = 0;
        int pez2 = 0;
        int pez3 = 0;
        int slot = 0;
        do {
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            altura = sc.nextInt();
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            anchura = sc.nextInt(); 
        } while (altura < 4 || anchura < 4);
        do {
            pez1 = (int)(Math.random()*(anchura - 2) * (anchura - 2));
            pez2 = (int)(Math.random()*(anchura - 2) * (anchura - 2));
            pez3 = (int)(Math.random()*(anchura - 2) * (anchura - 2));
        } while (pez1 == pez2 || pez2 == pez3 || pez3 == pez1);
        System.out.println(pez1 + "<- % ");
        System.out.println(pez2 + "<- & ");
        System.out.println(pez3 + "<- @ ");
        for ( int i = 1 ; i <= anchura ; i++){
            System.out.print("* ");
        }
        System.out.println();
        for ( int i = 2 ; i < altura ; i++){
            System.out.print("* ");
            for ( int i2 = 2 ; i2 < anchura ; i2++ ) {
                if (slot == pez1) {
                    System.out.print("% ");
                } else if (slot == pez2) {
                    System.out.print("& ");
                } else if (slot == pez3) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
                slot++;
            }
            System.out.println("*");
        }
        for ( int i = 1 ; i <= anchura ; i++){
            System.out.print("* ");
        }
        System.out.println();
        sc.close();
    }
}