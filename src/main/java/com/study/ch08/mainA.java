package com.study.ch08;

public class mainA {
    public static void main(String[] args) {
        ARepository aRepo1 = new ARepository();
        ARepository aRepo2 = new ARepository();

        aRepo1.printAddress();
        aRepo2.printAddress();

        System.out.println();

//        AService aServ = new AService(aRepo1);
        AService aServ = new AService(aRepo2);

        aServ.moveRepo();
    }
}
