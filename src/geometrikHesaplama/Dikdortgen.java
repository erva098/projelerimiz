package geometrikHesaplama;

public class Dikdortgen extends Sekil {

    public static double alanHesaplama(){
        alan=uzunKenar*kisaKenar;
        System.out.println(alan);
        return alan;
    }

    public static double CevreHesaplama(){
        cevre=2*(uzunKenar+kisaKenar);
        System.out.println(cevre);
        return  cevre;
    }
}
