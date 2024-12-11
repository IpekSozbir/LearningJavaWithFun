package tas_kagit_makas_oyunu;

import java.util.Random;
import java.util.Scanner;

public class Tas_Kagit_Makas_Oyunu {

    public static void main(String[] args) {

        /*
        Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
        Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
        Kullanici tahminini yazar, sonra bilgisayarin tahminine gore o elin kazanani belli olur.
        5 kez kazandiktan sonra, asagidaki kurallara gore en fazla kazanan, oyunun galibi olur.

        Kağıt taşı sarar
        Taş makası kırar
        Makas kağıdı keser
        */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Tas Kagit Makas Oyununa Hosgeldiniz... \nLutfen seciminizi sayi olarak giriniz. \nTas icin 1, Kagit icin 2, Makas icin 3 yaziniz");

        int kullaniciSkoru =0;
        int bilgisayarinSkoru =0;

        do {
            int kullaniciSecimi = scan.nextInt();
            int bilgisayarinSecimi = random.nextInt(3)+1;


            if (kullaniciSecimi==1 && bilgisayarinSecimi ==2) {
                System.out.println("Kagit tasi sarar, bilgisayar +1");
                bilgisayarinSkoru++;
            } else if (kullaniciSecimi==1 && bilgisayarinSecimi ==3) {
                System.out.println("Tas makasi kirar, kullanici +1");
                kullaniciSkoru++;
            } else if (kullaniciSecimi==2 && bilgisayarinSecimi ==1) {
                System.out.println("Kagit tasi sarar, kullanici +1");
                kullaniciSkoru++;
            } else if (kullaniciSecimi==2 && bilgisayarinSecimi ==3) {
                System.out.println("Makas kağidi keser, bilgisayar +1");
                bilgisayarinSkoru++;
            } else if (kullaniciSecimi==3 && bilgisayarinSecimi ==1) {
                System.out.println("Tas makasi kirar, bilgisayar +1");
                bilgisayarinSkoru++;
            } else if (kullaniciSecimi==3 && bilgisayarinSecimi ==2) {
                System.out.println("Makas kagidi keser, kullanici +1");
                kullaniciSkoru++;
            }  else if (kullaniciSecimi != 1 & kullaniciSecimi != 2 & kullaniciSecimi != 3) {
                System.out.println("Hatali bir giris yaptiniz, lutfen tekrar deneyiniz...");
            } else {
                System.out.println("Berabere kaldiniz...");
            }
            System.out.println("Kullanici skoru: " + kullaniciSkoru + " - Bilgisayar skoru: " + bilgisayarinSkoru);

        }  while (kullaniciSkoru!=5 && bilgisayarinSkoru!=5);

        if (kullaniciSkoru>bilgisayarinSkoru) {
            System.out.println("Siz kazandiniz!...");
        } else {
            System.out.println("Bilgisayar kazandi!...");
        }
    }
}
