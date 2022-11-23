
public class Cap6Ejercicio18 {
    public static void main(String[] args) {
        
        String color = "";
        int uno, dos,tres;

        do {
            uno = (int)(Math.random()*6+1);
            dos = (int)(Math.random()*6+1);
            tres = (int)(Math.random()*6+1);

        } while (uno==dos || dos==tres || uno==tres);
            switch (uno) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
                System.out.println(color);

            switch (dos) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
                System.out.println(color);

            switch (tres) {
                case 1:
                    color = "\u001B[31m*****\n*   *\n*****";
                break;
                case 2:
                    color = "\u001B[34m*****\n*   *\n*****";
                break;
                case 3:
                    color = "\u001B[32m*****\n*   *\n*****";
                break;
                case 4:
                    color = "\u001B[33m*****\n*   *\n*****";
                break;
                case 5:
                    color = "\u001B[35m*****\n*   *\n*****";
                break;
                case 6:
                    color = "\033[33m*****\n*   *\n*****";
                break;
            }
            System.out.println(color);
    }
}