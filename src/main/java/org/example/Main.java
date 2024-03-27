package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("BẢNG CỬU CHƯƠNG");
        for(int i= 2; i<10 ; i++){
            System.out.println("Bảng cửu chương " + i +":");
            for (int j = 1 ; j <= 10 ; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
