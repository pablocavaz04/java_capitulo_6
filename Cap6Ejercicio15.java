import javax.print.DocFlavor.STRING;

/*
 * Author: Pablo Camino 
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
