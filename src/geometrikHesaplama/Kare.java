package geometrikHesaplama;

public class Kare extends Dikdortgen{

    public static double alanHesaplama(){
        alan=kisaKenar*kisaKenar;
        System.out.println(alan);
        return alan;
    }

    public static double CevreHesaplama(){
        cevre=4*kisaKenar;
        System.out.println(cevre);
        return cevre;
    }
}
