package Wątki;

import java.util.Scanner;

public class WatekZadanie extends Thread  {

    public static void main(String[] args) {

        WatekZadanie watekZadanie = new WatekZadanie();
        WatekZadanie watekZadanie1 = new WatekZadanie();

        watekZadanie.start();
        watekZadanie1.start();





    }

    @Override
    public void run(){

        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        System.out.println( "liczba: " + 2*t + " thread: " + Thread.currentThread().getName());

//        for (int i = 0; i < 50; i++) {
//            System.out.println( i + "thread: " + 2*t+ Thread.currentThread().getName());
//
////            try {
////                Thread.sleep(100);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//
//        }


    }


}