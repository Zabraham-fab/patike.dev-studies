import java.util.Scanner;
public class kdvodev {
    public static void main(String[] args) {
        float para, kdv, kdvmik, kdvlimik;
        //ister yazısı
        System.out.print("KDV hesaplaması için bir para miktarı giriniz. : ");

        //Kullanıcıdan fiyat alımı
        Scanner alinanpara = new Scanner(System.in);
        para = alinanpara.nextFloat();

        String skdv = (para >= 0) && (para <= 1000) ? "0.18" : "0.08";

        kdv = Float.parseFloat(skdv);

        // KDV tutarını hesaplama
        kdvmik = para * kdv;

        //KDVli tutarını hesaplama
        kdvlimik = para + kdvmik;

        System.out.println("KDV'siz Fiyat = "+para);
        System.out.println("KDV'li Fiyat = "+kdvlimik);
        System.out.println("KDV tutarı = "+kdvmik);

    }
}