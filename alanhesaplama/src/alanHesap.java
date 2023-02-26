import java.util.Scanner;
public class alanHesap {
    public static void main(String[] args) {
        // Değişkenler belirleme
        double a, b, c, alan, u;

        // Kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz. :");
        a = girdi.nextInt();
        System.out.println("2. Kenarı giriniz. :");
        b = girdi.nextInt();
        System.out.println("3. Kenarı giriniz. :");
        c = girdi.nextInt();

        u = (a+b+c)/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;

        System.out.println("Üçgenin Alanı : "+alan);
    }
}
