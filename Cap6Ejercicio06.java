import java.util.Scanner;
public class Cap6Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_a_adivinar = (int)(Math.random()*101);
        for(int i=5; i>=1;i--){
            System.out.print("Intenta adivinar un numero entre 0 y 100: ");
            int intento = sc.nextInt();
            if(intento > numero_a_adivinar){
                System.out.println("El numero es menor que el introducido");
            } else if (intento < numero_a_adivinar){
                System.out.println("El numero es mayor que el introducido");
            }else{
                System.out.println(" ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔As adivinado el numero✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔ ✔");
                break;
            }
            System.out.println("Te quedan "+(i-1)+" intentos");
        }
    }
}
