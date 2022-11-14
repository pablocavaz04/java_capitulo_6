import javax.annotation.processing.SupportedOptions;

/*
 * Author:Pablo Camino Vázquez
10) Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.
 */
public class Cap6Ejercicio10 {
    public static void main(String[] args) {
        for(int linea=0;linea<=10;linea++){
            int longitud = (int)(Math.random()*41)+1;
            int caracter = (int)(Math.random()*7)+1;
            for(int i=1;i<=longitud;i++){
                switch(caracter){
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("-");
                        break;
                    case 3:
                        System.out.print("=");
                        break;
                    case 4:
                        System.out.print(".");
                        break;
                    case 5:
                        System.out.print("|");
                        break;
                    case 6:
                        System.out.print("@");
                        break;
                }
            }
            System.out.println();
        }
    }
}
