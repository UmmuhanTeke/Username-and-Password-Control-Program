package task1;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _sifrebelirleme {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı Adı Belirleyiniz=");  String ad=scanner.nextLine();
        System.out.print("Şifre Belirleyiniz=");          String sifre=scanner.nextLine();
        System.out.print("Şifre Doğrulayınız=");          String sifre2;

        do {
            sifre2=scanner.nextLine();
            if (!(sifre.equals(sifre2)))
                System.out.print("Şifreler Eşleşmedi Tekrar Deneyiniz=");
            else{
                System.out.println("Şifreler Eşleşti");
            }
        }while(!sifre2.equals(sifre)) ;

        System.out.println("         |->->->GİRİŞYAP<-<-<-|          ");
        System.out.print("Kullanıcı Adınızı Giriniz=");
        String isim=scanner.nextLine();   int sayac=2;

        while(sayac>=0 && ad.equals(isim)){
            System.out.print("Şifrenizi Giriniz=");       sifre=scanner.nextLine();
            if(sifre.equals(sifre2)){
                System.out.println("Başarılı bir şekilde giriş yaptınız,kullanıcısı olarak sisteme hoş geldiniz!");
            break;
            }
            else {
                System.out.print("Tekrar Deneyiniz=");
                System.out.println("Kalan Hakkınız=" + sayac);
                if(sayac==0)
                    System.out.println("Üzgünüz,3 Kez Üst Üste Yanlış Giriş Yaptınız");
            }

            sayac--;
        }
             if (!ad.equals(isim)) {
                 System.out.print("Kullanıcı Adı Hatalıdır,Tekrar Giriniz");  isim=scanner.nextLine();
             }
    }
}
