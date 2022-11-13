package a5_ManavSepetTutarı;

import java.util.Scanner;

public class Sepet {
    public static void main(String[] args) {
        double priceS=3.14;
        double priceE= 4.11;
        double priceK= 2.22;
        double priceD= 0.95;
        double priceP= 7.00;



        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo Salatalık aldınız : ");
        double salatalık=input.nextDouble();
        System.out.print("Kaç kilo elma aldınız : ");
        double elma=input.nextDouble();
        System.out.print("Kaç kilo kabak aldınız : ");
        double kabak=input.nextDouble();
        System.out.print("Kaç kilo domates aldınız : ");
        double domates=input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız : ");
        double patlıcan=input.nextDouble();

        double toplam=(priceS*salatalık)
                +(priceE*elma)
                +(priceK*kabak)
                +(priceD*domates)
                +(priceP*patlıcan);

        System.out.println(toplam);



    }
}
