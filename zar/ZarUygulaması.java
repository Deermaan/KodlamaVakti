package zar;

public class ZarUygulaması {
    public static void main(String[] args) {


       int zar = (int) (Math.random()*6+1);
        System.out.println(zar);

        if(zar==1) System.out.println(" *  ");
        if(zar==2) System.out.println("*\n *\n");
        if(zar==3) System.out.println("*\n *\n  *\n");
        if(zar==4) System.out.println("* *\n\n* *\n");
        if(zar==5) System.out.println("* *\n *\n* *\n");
        if(zar==6) System.out.println("* *\n* *\n* *\n");



    }
}
