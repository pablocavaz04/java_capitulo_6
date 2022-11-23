import java.util.Scanner;
public class Cap6Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int numero = sc.nextInt();
        System.out.println();
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        int tempMin = 50;
        int tempMax = 0;
        int temperatura1 = 0;
        int temperatura2 = 0;
        boolean soleado = false;
        boolean nublado = false;
        int clima = (int)(Math.random()*10 + 1);
        switch (numero) {
            case 1:
                temperatura1 = (int)(Math.random()*(31 - 15) + 15);
                temperatura2 = (int)(Math.random()*(31 - 15) + 15);
                if (clima >= 6) {
                    soleado = true;
                    nublado = false;
                } else {
                    soleado = false;
                    nublado = true;
                }
                break;
            case 2:
                temperatura1 = (int)(Math.random()*(46 - 25) + 25);
                temperatura2 = (int)(Math.random()*(46 - 25) + 25);
                if (clima >= 8) {
                    soleado = true;
                    nublado = false;
                } else {
                    soleado = false;
                    nublado = true;
                }
                break;
            case 3:
                temperatura1 = (int)(Math.random()*(31 - 20) + 20);
                temperatura2 = (int)(Math.random()*(31 - 20) + 20);
                if (clima <= 4) {
                    soleado = true;
                    nublado = false;
                } else {
                    soleado = false;
                    nublado = true;
                }
                break;
            case 4:
                temperatura1 = (int)(Math.random()*26);
                temperatura2 = (int)(Math.random()*26);
                if (clima <= 2) {
                    soleado = true;
                    nublado = false;
                } else {
                    soleado = false;
                    nublado = true;
                }
                break;
            default:
                System.out.println("Estación del año errónea");
                break;
        }
        if (temperatura1 > temperatura2) {
            tempMax = temperatura1;
            tempMin = temperatura2;
        } else {
            tempMax = temperatura2;
            tempMin = temperatura1;
        }
        System.out.println("Temperatura mínima: " + tempMin + "ºC");
        System.out.println("Temperatura máxima: " + tempMax + "ºC");
        if (soleado) {
            System.out.println("Soleado");
        }
        if (nublado) {
            System.out.println("Nublado");
        }
        sc.close();
    }
}