import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
       // Değişkenleri oluştur
       int mat,fiz,muz,tar,tur,kim;

       // Scanner sınıfımızı ekledik
       Scanner gir = new Scanner(System.in);

       // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = gir.nextInt();

        System.out.print("Fizik notunuz : ");
        fiz = gir.nextInt();

        System.out.print("kimya notunuz : ");
        kim = gir.nextInt();

        System.out.print("Tarih notunuz : ");
        tar = gir.nextInt();

        System.out.print("Türkçe notunuz : ");
        tur = gir.nextInt();

        System.out.print("Müzik notunuz : ");
        muz = gir.nextInt();

        System.out.println("Notlarınız Özet : "+mat+'-'+fiz+'-'+kim+'-'+tar+'-'+tur+'-'+muz);

        int toplam = (mat + fiz + tur + tar + muz + kim);
        double ort = toplam/6.00;

        System.out.println("Ortalama ders notunuz : "+ort);

        String sonuc = ort >= 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(sonuc);
    }
}
