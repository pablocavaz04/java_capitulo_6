import java.util.Scanner;
public class Cap6Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador = sc.nextLine();
        if (!jugador.equals("tijera") && !jugador.equals("papel") && !jugador.equals("piedra")) {
            System.out.println("Error");
        } else {
            int numeroJugador = 0;
            switch (jugador) {
                case "piedra":
                    numeroJugador = 0;
                    break;
                case "papel":
                    numeroJugador = 1;
                    break;
                case "tijera":
                    numeroJugador = 2;
                    break;
                default:
            } 
            String opcion = "";
            int numeroOpcion = (int)(Math.random()*3);
            switch (numeroOpcion) {
                case 0:
                    opcion = "piedra";
                    break;
                case 1:
                    opcion = "papel";
                    break;
                case 2:
                    opcion = "tijera";
                    break;
                default:
            }
            System.out.println("Turno del ordenador: " + opcion);
            if (numeroJugador == numeroOpcion) {
                System.out.println("Empate");
            } else if ((numeroJugador == 0 && numeroOpcion == 3) || (numeroJugador == 1 && numeroOpcion == 0) || (numeroJugador == 2 && numeroOpcion == 1)) {
                System.out.println("Jugador gana");
            } else {
                System.out.println("Ordenador gana");
            }
        }
        sc.close();
    }
}