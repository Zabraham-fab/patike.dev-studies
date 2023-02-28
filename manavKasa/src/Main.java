import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double elma, armut, domates, muz, patlican;
        double el=3.67, ar=2.14,dom=1.11, mu=0.95, pa=5;
        double a,b,c,d,e,toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Elma kaç kilo: ");
        elma = input.nextDouble();
        a = elma*el;

        System.out.print("Armut kaç kilo: ");
        armut = input.nextDouble();
        b = armut*ar;

        System.out.print("Domates kaç kilo: ");
        domates = input.nextDouble();
        c = domates*dom;

        System.out.print("Patlıcan kaç kilo: ");
        patlican = input.nextDouble();
        e = patlican*pa;

        System.out.print("Muz kaç kilo: ");
        muz = input.nextDouble();
        d = mu*muz;

        toplam = a+b+c+d+e;
        System.out.print("Toplam tutar: "+toplam);


    }
}