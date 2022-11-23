

public class Cap6Ejercicio23 {
    public static void main(String[] args) {
        for(int i = 1; i<= 5; i++){
            int numerodado = (int)(Math.random()*6+1);
            String dado = "";

            switch (numerodado) {
                case 1:
                    dado = "As";
                break;
                case 2:
                    dado = "K";
                break;
                case 3:
                    dado = "Q";
                break;
                case 4:
                    dado = "J";
                break;
                case 5:
                    dado = "7";
                break;
                case 6:
                    dado = "8";
                break;
            }
            System.out.print(dado + " ");
        }
    }
}