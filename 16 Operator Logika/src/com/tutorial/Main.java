package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // Operator Logika
        boolean a,b,c ;
        //===============================================================AND
        System.out.println("====  AND (&& )  ====");
        a = false ;
        b = false ;
        c = (a && b) ;
        System.out.println(a +  " && " + b + " = " + c );
        a = false ;
        b = true ;
        c = (a && b) ;
        System.out.println (a +  " && " + b + " = " + c );
        a = true ;
        b = false ;
        c = (a && b) ;
        System.out.println(a +  " && " + b + " = " + c );
        a = true ;
        b = true ;
        c = (a && b) ;
        System.out.println(a +  " && " + b + " = " + c );

        //Contoh :
        int nilaiAND  = 10 ;
        //kedua nilai perbandingan bernilai true (benar) -> true
        System.out.println( nilaiAND < 15 && nilaiAND > 5 );

        //salah satu nilai bernilai false - > false
        System.out.println(nilaiAND > 15 && nilaiAND > 5 );

        //===============================================================OR

        System.out.println("====  OR ( || )  ====");
        a = false ;
        b = false ;
        c = (a || b) ;
        System.out.println(a +  " || " + b + " = " + c );
        a = false ;
        b = true ;
        c = (a || b) ;
        System.out.println(a +  " || " + b + " = " + c );
        a = true ;
        b = false ;
        c = (a || b) ;
        System.out.println(a +  " || " + b + " = " + c );
        a = true ;
        b = true ;
        c = (a || b) ;
        System.out.println(a +  " || " + b + " = " + c );

        //Contoh :
        int nilaiOR  = 10 ;
        //kedua nilai perbandingan bernilai false (salah) -> false
        System.out.println(nilaiOR < 5 || nilaiOR > 15 );

        //salah satu nilai bernilai true (benar) - > true
        System.out.println(nilaiOR > 15 || nilaiOR > 5 );

        //===============================================================XOR

        System.out.println("====  XOR ( ^ )  ====");
        a = false ;
        b = false ;
        c = (a ^ b) ;
        System.out.println(a +  " ^ " + b + " = " + c );
        a = false ;
        b = true ;
        c = (a ^ b) ;
        System.out.println(a +  " ^ " + b + " = " + c );
        a = true ;
        b = false ;
        c = (a ^ b) ;
        System.out.println(a +  " ^ " + b + " = " + c );
        a = true ;
        b = true ;
        c = (a ^ b) ;
        System.out.println(a +  " ^ " + b + " = " + c );

        //Contoh :
        int nilaiXOR  = 10 ;
        //kedua nilai perbandingan bernilai sama -> false
        System.out.println(nilaiXOR > 5 ^ nilaiXOR < 15 );

        //kedua nilai perbandingan bernilai beda - > true
        System.out.println(nilaiXOR > 15 || nilaiXOR > 5 );

        //===============================================================NOT

        System.out.println("====  NOT ( ! )  ====");
        a = true ;
        c = !a ;
        System.out.println(a + " --> (!) = " + c);

        a = false ;
        c = !a ;
        System.out.println(a + " --> (!) = " + c);



    }
}
