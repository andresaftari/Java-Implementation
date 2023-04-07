package com.andre.TP_IMA_02.advanceloop_09;

import java.util.Random;

public class AcakAbsen {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomName = rd.nextInt(5) + 1;

        switch (randomName) {
            case 1:
                System.out.println("Primanda, ");
                break;
            case 2:
                System.out.println("Bayu, ");
                break;
            case 3:
                System.out.println("Andre, ");
                break;
            case 4:
                System.out.println("Ardi, ");
                break;
            case 5:
                System.out.println("Billy, ");
                break;
        }
        System.out.println("Silakan ke depan");
    }
}
