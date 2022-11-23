import java.util.Scanner;


public class Cap6Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la pecera (mínimo 4): ");
        int altura = sc.nextInt();
        System.out.print("Dime el ancho de la pecera (mínimo 4): ");
        int ancho = sc.nextInt();

        int pez = (int)(Math.random()*(ancho-2)*(altura-2))+1;
        int posicion = 1;
        
        for(int i = 1; i<=ancho;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=2;i<=altura-1;i++){
            System.out.print("*");
            for(int j=2;j<=ancho-1;j++){
                if(posicion==pez){
                    System.out.print("&");
                } else{
                    System.out.print(" ");
                }
                posicion++;
            }
            System.out.print("*\n");
        }
        
        for(int i = 1; i<=ancho;i++){
            System.out.print("*");
        }
        sc.close();
    }
}