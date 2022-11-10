package regular.day14;

public class Test {


    private double genislik;
    private double yukseklik;
    private double ekranbuyukluk;
    private int maxSes=30;
    private int ses=12;
    private boolean guc;



    public Test( double genislik, double yukseklik,double ekranbuyukluk){//constructor olusturduk
        this.genislik=genislik;
        this.yukseklik=yukseklik;
        this.ekranbuyukluk=ekranbuyukluk;


    }
        public double kanalDegisme(int kanal){
        switch (kanal){
            case 1:
                return 34.75;
            case 2:
                return 45.25;
            case 3:
                return 50.9;

        }
        return 0;
}
        public void gucDugmesi(){//kapalı ise açar açıksa kapatır.
        this.guc=!guc;
}

        public int sesAzaltma(){
            if (0<ses){//ses pozitifse azaltır
                ses --;
            }
            return  ses;

        }
        public int sesArtır(){//max sesten kucukse arttırır

            if (maxSes>ses){
                ses++;
            }return ses;
        }




}
