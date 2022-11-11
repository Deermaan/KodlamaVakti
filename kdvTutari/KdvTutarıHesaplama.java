package kdvTutari;

import java.util.Scanner;

public class KdvTutarıHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double price,total,kdvPrice,rate=18;

        System.out.print("Tutar giriniz");
        price=input.nextDouble();

        kdvPrice=price*(rate/100);
        total= price+kdvPrice;

        System.out.println("KDV oranı: %"+(int)rate);
        System.out.println("KDV tutarı: "+kdvPrice);
        System.out.println("KDV'li fiyat: "+total);





    }
}
