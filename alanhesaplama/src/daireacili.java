import java.util.Scanner;
public class daireacili {
    public static void main(String[] args) {
        double alfa, alan, r, pi = 3.14;

        Scanner degree = new Scanner(System.in);
        System.out.print("Daire diliminin yarıçapını giriniz : ");
        r = degree.nextDouble();
        System.out.print("Daire dilim açısını giriniz : ");
        alfa = degree.nextDouble();

        alan = (pi * (Math.pow(r, 2)) * alfa) / 360;
        System.out.println("Dairenin alanı: "+alan);


    }
}
