//Pedir un número e indicar si es positivo o negativo.
import java.util.Scanner;
class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomnum = (int)(Math.random()*101);
        System.out.println(randomnum);
        if (randomnum < 50) {
            System.out.println("Numero chico");
        }else {
            System.out.println("Numero grande");
        }
    }
}