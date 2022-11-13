package a3_hipotenusHesaplama;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        int kenar1= input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        int kenar2= input.nextInt();
        System.out.println();

        double hip= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs: "+(int)hip);





    }
}
