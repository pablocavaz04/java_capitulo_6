/*
 * Author:Pablo Camino Vázquez
16) Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
 */
public class Cap6Ejercicio16 {
    public static void main(String[] args) {
        int numero=0;
        String figura="";
        for(int i=1 ; i<=3;i++){
            numero=(int)(Math.random()*5)+1;
            switch (numero) {
                case 1:
                figura="❤️ ";
                break;
                case 2:
                figura="🔷 ";
                break;
                case 3:
                figura="🧲 ";
                break;
                case 4:
                figura="🔔 ";
                break;
                case 5:
                figura="🍋 ";
                break;
            }
            System.out.print(figura);
        }

    }
}
