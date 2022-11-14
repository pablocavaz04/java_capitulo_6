/*
 * Author:Pablo Camino Vázquez
13) Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor
 */
public class Cap6Ejercicio13 {
    public static void main(String[] args) {
        int dado1=0;
        int dado2=0;
        int i = 0;
        do{
            i++;
            dado1=(int)(Math.random()*6)+1;
            System.out.println("Dado 1 | Tirada "+i+" : "+dado1);
            System.out.println("-------------------------------");
            dado2=(int)(Math.random()*6)+1;
            System.out.println("Dado 2 | Tirada "+i+" : "+dado2);
            System.out.println("-------------------------------");
        }while(dado1 != dado2);
        System.out.println("Enhorabuena has tirados el mismo numero en ambos lados: Dado 1 "+dado1+" | Dado 2 "+dado2);
    }
}
