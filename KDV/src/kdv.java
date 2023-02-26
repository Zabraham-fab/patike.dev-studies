import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        float para,kdv;
        kdv = 0.18f;
        //ister yazısı
        System.out.print("KDV hesaplaması için bir para miktarı giriniz. : ");

        //Kullanıcıdan fiyat alımı
        Scanner alinanpara = new Scanner(System.in);
        para = alinanpara.nextFloat();

        // KDV tutarını hesaplama
        float kdvmik = para * kdv;

        //KDVli tutarını hesaplama
        float kdvlimik = para * (1+kdv);

        System.out.println("KDV'siz Fiyat = "+para);
        System.out.println("KDV'li Fiyat = "+kdvlimik);
        System.out.println("KDV tutarı = "+kdvmik);

    }
}
