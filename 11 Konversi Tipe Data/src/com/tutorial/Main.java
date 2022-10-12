package com.tutorial;

public class Main {
    public static void main(String[]args) {
        //Konversi Data

        int nilaiInt = 500 ; // int memiliki ukuran 32-bit
        System.out.println("nilai integer = " + nilaiInt);

        System.out.println("=============Widening Casting============");
        //Widening Casting - konversi tipe yang lebih ke kecil ke ukuran yang lebih besar
        //urutan dari kecil  ke yang besar ( byte -> short -> char -> int -> long -> float -> double )

        long nilaiLong = nilaiInt; // long memiliki ukuran 64-bit
        System.out.println("nilai long = " + nilaiLong);

        System.out.println("=============Narrowing Casting============");
        //Narrowing Casting - konversi tipe yang lebih besar ke tipe ukuran yang lebih kecil
        //urutan dari besar ke yang kecil ( double -> float -> long -> int -> char -> short -> byte )

        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);

        System.out.println("=============Konversi Pembagian============");
        //Konversi dalam Pembagian
        int a = 15;
        int b = 2;
        double c = (double) a / b;
        System.out.printf("%d / %d = %s ",a,b,c);


    }
}
