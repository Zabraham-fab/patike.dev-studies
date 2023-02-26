import java.util.Scanner;
public class hipotenusHesap {
    public static void main(String[] args) {

        // Değişkenler oluşturma
        int a, b;
        double c;

        // Kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz. :");
        a = girdi.nextInt();
        System.out.println("2. Kenarı giriniz. :");
        b = girdi.nextInt();

        c = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));

        System.out.println("Hipotenüs uzunluğu : "+c);

    }
}