package com.company;
import java.util.Random;

public class ProduceID {
    public static void main(String[] args) {
        Random r = new Random();
        String ID = "";
        int first = (r.nextInt(26) + 10);
        int gender, i,k;
        switch (first) {
            case 10:
                ID = "A";
                break;
            case 11:
                ID = "B";
                break;
            case 12:
                ID = "C";
                break;
            case 13:
                ID = "D";
                break;
            case 14:
                ID = "E";
                break;
            case 15:
                ID = "F";
                break;
            case 16:
                ID = "G";
                break;
            case 17:
                ID = "H";
                break;
            case 34:
                ID = "I";
                break;
            case 18:
                ID = "J";
                break;
            case 19:
                ID = "K";
                break;
            case 20:
                ID = "L";
                break;
            case 21:
                ID = "M";
                break;
            case 22:
                ID = "N";
                break;
            case 35:
                ID = "O";
                break;
            case 23:
                ID = "P";
                break;
            case 24:
                ID = "Q";
                break;
            case 25:
                ID = "R";
                break;
            case 26:
                ID = "S";
                break;
            case 27:
                ID = "T";
                break;
            case 28:
                ID = "U";
                break;
            case 29:
                ID = "V";
                break;
            case 32:
                ID = "W";
                break;
            case 30:
                ID = "X";
                break;
            case 31:
                ID = "Y";
                break;
            case 33:
                ID = "Z";
                break;
        }
        gender = r.nextInt(2) + 1;
        ID = ID + Integer.toString(gender);
        int a=ID.charAt(0)-'A';
        int b=(a / 10) + (9 * (a % 10));
        int c=b+(gender*8);
        for (i =1; i < 9; i++) {
            first = r.nextInt(10);
            ID = ID + first;
            c=c+first*(8-i);
//            System.out.println(first);
        }
        c=c+Integer.parseInt(ID.substring(9,10));
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        System.out.println(ID);
        if(c%10==0){
            System.out.println("正確");
        }else {
            System.out.println("錯誤ID");
        }
    }
}




