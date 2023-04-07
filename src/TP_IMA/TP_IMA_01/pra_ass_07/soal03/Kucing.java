package TP_IMA.TP_IMA_01.pra_ass_07.soal03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kucing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long day = Long.parseLong(bufferedReader.readLine()); //input as Long
        long pangkat = 1 << day; //Bit shift
        System.out.println(pangkat % 1000000007); //modulo by shortcut
    }
}
