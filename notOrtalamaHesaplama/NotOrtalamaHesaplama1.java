package notOrtalamaHesaplama;

import java.util.Scanner;

public class NotOrtalamaHesaplama1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       double Fizik,Matematik,Turkce,Kimya,Muzik,Tarih;
        System.out.println("Fizik notunuzu giriniz");
       Fizik= input.nextDouble();
        System.out.println("Matematik notunuzu giriniz");
       Matematik= input.nextDouble();
        System.out.println("Türkçe notunuzu giriniz");
       Turkce= input.nextDouble();
        System.out.println("Kimya notunuzu giriniz");
       Kimya= input.nextDouble();
        System.out.println("Müzik notunuzu giriniz");
       Muzik= input.nextDouble();
        System.out.println("Tarih notunuzu giriniz");
       Tarih= input.nextDouble();

       double sonuc=  ((Fizik+Matematik+Turkce+Kimya+Muzik+Tarih)/6.0);
        System.out.println("Fizik notunuz:"+Fizik);
        System.out.println("Matematik notunuz:"+Matematik);
        System.out.println("Turkce notunuz:"+Turkce);
        System.out.println("Kimya notunuz:"+Kimya);
        System.out.println("Muzik notunuz:"+Muzik);
        System.out.println("Tarih notunuz:"+Tarih);
        System.out.println("Ortalamanız:"+sonuc);








    }
}
