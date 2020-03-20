package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Tiga {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int[] tampung = new int[data];
        for (int i = 0; i < data ; i++) {
            tampung[i] = scanner.nextInt();
        }
        Arrays.sort(tampung);
        int beda = 0;
        for (int i = 0; i < data-1 ; i++) {
            for (int j = 1; j < data; j++){
                if(tampung[i] != tampung[j]){
                    beda += 1;
                }
            }
        }
        int[] berbeda = new int[beda];
        for (int i = 0; i < data-1; i++) {
            for (int j = 1; j < data; j++){
                for (int k = 0; k < beda; k++){
                    if(tampung[i] != tampung[j]){
                        berbeda[k] = tampung[j];
                    }
                }
            }
        }
        int[] banyakSama = new int[beda];
        int sama = 0;
        for (int i = 0; i < beda; i++){
            for (int j = 0 ; j < data; j++){
                for (int k = 0; k < beda; k++){
                    if(berbeda[i] == tampung[j]){
                        banyakSama[i] = sama + 1;
                    }
                }

            }
        }
        for (int i = 0; i beda ; i++) {

        }
    }
}
