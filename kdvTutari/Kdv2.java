package kdvTutari;

import java.util.Scanner;

public class Kdv2 {    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    double price,total,kdvPrice,rate=18;

    System.out.print("Tutar giriniz: ");
    price=input.nextDouble();

    if (price>=0 && price<501){

        kdvPrice=price*(rate/100);
        total= price+kdvPrice;

        System.out.println("KDV oranı: %"+(int)rate);
        System.out.println("KDV tutarı: "+kdvPrice);
        System.out.println("KDV'li fiyat: "+total);

    }else if (price>500){
        rate=8;
        kdvPrice=price*(rate/100);
        total= price+kdvPrice;

        System.out.println("KDV oranı: %"+(int)rate);
        System.out.println("KDV tutarı: "+kdvPrice);
        System.out.println("KDV'li fiyat: "+total);
    }else System.out.println("Lütfen 0dan büyük bir sayı giriniz");



}
}
