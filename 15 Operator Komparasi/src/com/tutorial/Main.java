package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // Operator Komparasi

        int a,b;
        boolean hasilkomparasi ;

        //Aqual To || Persamaan (==)
        System.out.println("==========Persamaan");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 5 ;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilkomparasi);

        //Not Aqual || Pertidaksamaan (!=)
        System.out.println("==========Pertidaksamaan");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d -->? %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 5 ;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilkomparasi);

        //Greater Than || Lebih Dari ( > )
        System.out.println("==========Lebih Dari");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 10 ;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilkomparasi);

        //Less Than || Kurang Dari ( < )
        System.out.println("==========Kurang Dari");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 10 ;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilkomparasi);

        //Greater Than or Equal to || Lebih Dari sama dengan ( >= )
        System.out.println("==========Lebih Dari Sama Dengan");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 10 ;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);

        a = 10 ;
        b = 10 ;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);

        //Less Than or Equal to || Kurang Dari sama dengan ( <= )
        System.out.println("===========Kurang Dari Sama Dengan");
        a = 5 ;
        b = 3 ;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);

        a = 5 ;
        b = 10 ;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);

        a = 10 ;
        b = 10 ;
        hasilkomparasi = (a >= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);


    }
}
