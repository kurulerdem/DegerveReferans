package com.company;

public class Main {

    public static void main(String[] args) {
	    // Projenin ana dizini



        /*
        Primitive ve Referans tipleri fonksiyona göndermeden önce ve gönderdikten sonraki değerlerinin kontrolünü sağlayacağız.
        Bakalım değeleri nasıl değişecek öncelikli olarak Primitive tip ile başlayalım
         */

        int primitive = 10; // oluşturuldu
         //methoda girmeden önceki değer
         System.out.println("Method öncesi değer (primitive) : "+primitive);
         degistir(primitive);
         System.out.println("Method sonrası değer: (primitive) : "+primitive);

         // Şimdi bunu referans bir tiple deneyelim.
         Tipler t1 = new Tipler();
         t1.x=10;
         System.out.println("Method öncesi değer (referans) : " + t1.x);
         t1.degistir_ref(t1);
         System.out.println("Method sonrası değer (referans) : " + t1.x);

    }
    public static void degistir(int primitive) {
        primitive++; // Methodumuz sayiya 1 eklesin. maksat değişikliği görmek olsun
    }


}

