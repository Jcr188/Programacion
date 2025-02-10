import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las pesetas para pasar a euros: ");
        double pesetas = sc.nextDouble();
        final double euros = 166.386;
        double conversion = pesetas / euros;
        System.out.println("La conversion de pesetas es " + conversion);


    }

}
