package online.delivering.application;


import Immutabuliting.SingleTon;

public class MainApplication {
    public static void main(String[] args) {

//        System.out.println("%%%%%%%%%%%%% DDMV FOOD SERVICE %%%%%%%%%%%%%%%");
//
//        DDMV ddmv = new DDMV();
//        ddmv.displayorder();
//
//
//
//        ddmv.takingorder();
//
//        System.out.println("choose your payment :   1.online  2.cash on delivery");
//
//        ddmv.paymentOption();


        SingleTon singleTon=SingleTon.getA();

        System.out.println(singleTon);
        System.out.println(singleTon);
        System.out.println(singleTon);
        System.out.println(singleTon);
    }
}
