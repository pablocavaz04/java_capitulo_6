/*
 * Author:Pablo Camino Vázquez
5)Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 */
public class Cap6Ejercicio05 {
    public static void main(String[] args) {
        int maximo = 0;
        int minimo = 199;
        int suma = 0;
        for(int i=1; i <=50; i++){
        int numero = (int)(Math.random()*100)+100;
        System.out.println(numero+" ");
        if(numero > maximo){
            maximo = numero;
        }
        if(numero<minimo){
            minimo=numero;
        }
        suma+=numero;
        }
        System.out.println("El numero mayor mostrado es : "+maximo);
        System.out.println("El numero menor mostrado es : "+minimo);
        System.out.println("La media de todos los numero es : "+(suma/50));
    }
}
