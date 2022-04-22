package geometrikHesaplama;

public class Cember extends Sekil {
    static double pi=3.14;

    public static double alanHesaplama(){
        alan=pi*yaricap*yaricap;
        System.out.println(alan);
        return alan;
    }

    public static double CevreHesaplama(){
        cevre=2*pi*yaricap;
        System.out.println(cevre);
        return cevre;
    }

}
