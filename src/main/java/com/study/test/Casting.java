package com.study.test;

public class Casting {
    public static void main(String[] args) {
        Program[] programs = new Program[2];
        programs[0] = new Java();
        programs[1] = new C();

        for (int i = 0; i < programs.length; i++) {
            if(programs[i] instanceof Java) {
                programs[i].develop();
                ((Java) programs[i]).defineStructure();
            }else {
                programs[i].develop();
                ((C) programs[i]).garbageCollection();
            }
        }

    }
}
