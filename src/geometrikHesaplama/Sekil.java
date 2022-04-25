package geometrikHesaplama;

import java.util.Scanner;

public class Sekil {
    static int alanMiCevreMi;
    static Scanner scan=new Scanner(System.in);
   static double kisaKenar;
    static double uzunKenar;
   static double yaricap;
   static double alan;
   static double cevre;

    public Sekil(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Sekil(double yaricap) {

        this.yaricap = yaricap;
    }

    public static void giris(){
        System.out.println("Islem yapmak istediginiz sekli secin..\nCember icin 1\nDikdortgen icin 2\nKare icin 3\n");
        int secim=scan.nextInt();
        switch(secim){
            case 1:
                System.out.println("Alan icin 1\n Cevre icin 2 girin");
                 alanMiCevreMi = scan.nextInt();
                if (alanMiCevreMi==1){
                    System.out.println("yaricap girin");
                    yaricap = scan.nextDouble();
                    Cember.alanHesaplama();
                }else if (alanMiCevreMi==2){
                    System.out.println("yaricap girin");
                    yaricap = scan.nextDouble();
                    Cember.CevreHesaplama();
                }else{
                    System.out.println("hatali giris");
                }
                break;
            case 2:
                System.out.println("Alan icin 1\n Cevre icin 2 girin");
                alanMiCevreMi = scan.nextInt();
                if (alanMiCevreMi==1){
                    System.out.println("Lutfen uzun kenar ve kisa kenari girin");
                    kisaKenar= scan.nextDouble();
                    uzunKenar= scan.nextDouble();
                    Dikdortgen.alanHesaplama();
                }else if (alanMiCevreMi==2){
                    System.out.println("Lutfen uzun kenar ve kisa kenari girin");
                    kisaKenar= scan.nextDouble();
                    uzunKenar= scan.nextDouble();
                    Dikdortgen.CevreHesaplama();
                }else {
                    System.out.println("Hatali giris");
                }
                break;
            case 3:
                System.out.println("Alan icin 1\n Cevre icin 2 girin");
                alanMiCevreMi = scan.nextInt();
                if (alanMiCevreMi==1){
                    System.out.println("Lutfen kenar uzunlugunu girin");
                    kisaKenar= scan.nextDouble();
                    Kare.alanHesaplama();
                }else if (alanMiCevreMi==2){
                    System.out.println("Lutfen kenar uzunlugunu girin");
                    kisaKenar= scan.nextDouble();
                    Kare.CevreHesaplama();
                }else {
                    System.out.println("Hatali giris");
                }
                break;

            default:
                System.out.println("Hatali giris .....");
                giris();
        }


    }

    public static double alanHesaplama(){

     return alan;

    }

    public static double CevreHesaplama(){

        return cevre;
    }

    public Sekil(){

    }




}
