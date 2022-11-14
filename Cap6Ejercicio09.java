/*
 * Author:Pablo Camino Vázquez
9)Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.

 */
public class Cap6Ejercicio09 {
    public static void main(String[] args) {
        int comprobacion=0;
        int i=0;
        do{
        int numero = (int)(Math.random()*101);
        if(numero%2 !=0){
            numero++;
        }
        System.out.print(numero+" ");
        comprobacion=numero;
        i++;
        }while(comprobacion!=24);
        System.out.println("Se ha adivinado al "+i+" intento");
    }
}
