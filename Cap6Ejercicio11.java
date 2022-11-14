/*
 * Author:Pablo Camino Vázquez
11) Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 */
public class Cap6Ejercicio11 {
    public static void main(String[] args) {
        int nota= 0;
        int suspenso=0;
        int suficiente=0;
        int bien=0;
        int notable=0;
        int sobresaliente=0;
    for(int i=1;i<=20;i++){
        nota=(int)(Math.random()*11);
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            suspenso ++;
            System.out.println("SUSPENSO");
            System.out.println();
            break;
            case 5:
            suficiente ++;
            System.out.println("SUFICIENTE");
            System.out.println();
            break;
            case 6:
            bien ++;
            System.out.println("BIEN");
            System.out.println();
            break;
            case 7:
            case 8:
            notable ++;
            System.out.println("NOTABLE");
            System.out.println();
            break;
            case 9:
            case 10:
            sobresaliente ++;
            System.out.println("SOBRESALIENTE");
            System.out.println();
            break;
            }
        }
        System.out.println("La cantidad de suspensos es: "+suspenso);
        System.out.println("La cantidad de suficiente es de :"+suficiente);
        System.out.println("La cantidad de bienes es de : "+bien);
        System.out.println("La cantidad de notables es de : "+notable);
        System.out.println("La cantidad de sobresalientes es de : "+sobresaliente);

    }
}