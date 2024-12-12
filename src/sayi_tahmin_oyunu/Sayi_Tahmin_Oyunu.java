package sayi_tahmin_oyunu;

import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin_Oyunu {

    public static void main(String[] args) {
        /*

        1-100 arasinda rastgele bir sayi ureten ve kullanicidan sayiyi tahmin etmesini isteyen
        tahmini dogru bilirse de x.tahminde dogru bildiniz
        yanlıs ise Maalesef, Hic yakin bir tahmin degil,
        tahmin tutulan sayiya yakin ise Iyi denemeydi, cok yaklastiniz
        yazdiran bir oyun hazirlayiniz
     */

        sayiTahminEt();
    }
    public static void sayiTahminEt(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("...Sayi Tahmin Oyuna Hosgeldiniz...");
        int rastgeleSayi = random.nextInt(100) + 1;

        int sayiTahmini = 0;

        int sayac=0;


        do {
            System.out.println("Lutfen 1-100 arasinda bir sayi giriniz");
            sayiTahmini = scanner.nextInt();

            sayac++;

            if((sayiTahmini<0) && (sayiTahmini>100)){
                System.out.println("Yazdiginiz sayi 1-100 arasinda degil");
            }else if(sayiTahmini == rastgeleSayi) {
                System.out.println("Tebrikler! " + sayac + ". tahmininiz dogru! (" + sayiTahmini + ")");
            } else if ((rastgeleSayi-10)<sayiTahmini && sayiTahmini<(rastgeleSayi+10)) {
                System.out.println("Iyi denemeydi, cok yaklastiniz!");
            } else {
                System.out.println("Maalesef, Hic yakin bir tahmin degil");
            }

        } while (sayiTahmini != rastgeleSayi);
    }
}
