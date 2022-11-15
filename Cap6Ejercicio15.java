/*
 * Author: Pablo Camino Vázquez
15) Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
public class Cap6Ejercicio15 {
    public static void main(String[] args) {
        //Genero numero aleatorio que me dice la longitud de la melodía
        int melodia=0;
        do{
        melodia= (int)(Math.random()*25)+4;
        }while(melodia%4 !=0);
        String notas= "";
        String primera="";

        for(int n=1;n<=melodia;n++){
            int numero= (int)(Math.random()*7)+1;
            switch (numero) {
                case 1:
                notas = "do ";
                break;
                case 2:
                notas = "re ";
                break;
                case 3:
                notas = "mi ";
                break;
                case 4:
                notas = "fa ";
                break;
                case 5:
                notas = "sol ";
                break;
                case 6: 
                notas = "la ";
                break;
                case 7:
                notas = "si ";
                break;
            }
            if(n==1){
                primera= notas;
            }

            if(n==melodia){
                notas=primera;
            }

            System.out.print(notas + " ");
            if(n==melodia){
                System.out.print("|");
            }

            if(n%4==0){
                System.out.print("| ");
            }

        }

    }
}
