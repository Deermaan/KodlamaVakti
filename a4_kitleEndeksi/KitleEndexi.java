package a4_kitleEndeksi;

import java.util.Scanner;

public class KitleEndexi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        double boy= input.nextInt();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = input.nextInt();

        double endex=kilo/(boy*boy);
        System.out.println("Vücut kitle endexiniz: "+endex);



    }
}
