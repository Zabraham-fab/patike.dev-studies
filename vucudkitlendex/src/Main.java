import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy, kilo, endex;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde)giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        endex = kilo/Math.pow(boy,2);

        System.out.println("Vücut Kitle İndeksiniz: "+endex);

    }
}