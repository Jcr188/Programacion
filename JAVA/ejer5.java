import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        System.out.println("Calcula la factura");
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio del agua:");
        int agua = sc.nextInt();
        System.out.println("Precio de la basura:");
        int basura = sc.nextInt();
        System.out.println("Precio de la electricidad:");
        int electricidad = sc.nextInt();
        int precio_final = agua+basura+electricidad;
        System.out.println("Precio final: "+precio_final);

    }
}
