package intro;

import java.nio.charset.CoderResult;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

// değişken isimlendirme camel case ilkHarf gibi.
        String ortaMetin = "ilginizi çekebilir";
        String altMetin = "vade süresi";
        System.out.println(ortaMetin);
        System.out.println(altMetin);
// integer ve double veri tipleri
        int vade= 12;
        double dolarDun=18.25;
        double dolarBugun=18.30;

        boolean dolarDustuMu= false;
        String okYonu="";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu ="up.svg";
            System.out.println(okYonu);
        }
else {
    okYonu = "equal.svg";
            System.out.println(okYonu);
        }

String[]krediler = {"Hızlı kredi","Maaşın Halkbanktan","Mutlu emekli"};

for (int i = 0; i < krediler.length; i++){

            System.out.println(krediler[i]);
        }





 }

}