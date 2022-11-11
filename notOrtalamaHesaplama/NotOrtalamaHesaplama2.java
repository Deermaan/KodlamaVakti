package notOrtalamaHesaplama;

import java.util.Scanner;

public class NotOrtalamaHesaplama2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Fizik,Matematik,Turkce,Kimya,Muzik,Tarih;
        System.out.print("Fizik notunuz:");
        Fizik= input.nextInt();
        System.out.print("Matematik notunuz:");
        Matematik= input.nextInt();
        System.out.print("Türkçe notunuz:");
        Turkce= input.nextInt();
        System.out.print("Kimya notunuz:");
        Kimya= input.nextInt();
        System.out.print("Müzik notunuz:");
        Muzik= input.nextInt();
        System.out.print("Tarih notunuz:");
        Tarih= input.nextInt();
        double sonuc=  ((Fizik+Matematik+Turkce+Kimya+Muzik+Tarih)/6.0);
        System.out.print("Ortalamanız: "+sonuc);


    }
}
