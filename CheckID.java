package com.company;
import java.util.Scanner;
public class CheckID {
    public static void main(String[] args) {
        entryAgain();
    }
    public static void entryAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入身分證:");
        String strID = scanner.next();//輸入身分證
            int k = 1;
            int c;
            int letterNums[] = {
                    10, 11, 12, 13, 14, 15, 16,
                    17, 34, 18, 19, 20, 21, 22,
                    35, 23, 24, 25, 26, 27, 28,
                    29, 32, 30, 31, 33};//26個英文字母代碼

            int a =strID.charAt(0)-'A';//字母減去A得到相對應數字(0-25);
            if(a==11||a==17||a==18||a==24){
                System.out.println("此英文代碼已經不使用");
            }
            int first = letterNums[a];
            int check = (first / 10) + (9 * (first % 10));//將字母轉換成數字，十位數字為*1。個位數字的餘數(代碼)為*9

            for (int i = 8; i >= 1; i--) {
                c=Integer.parseInt(strID.substring(k,k+1));
                check = check + i * c;
                k++;//取得第幾個位置
            }
            check=check+Integer.parseInt(strID.substring(9,10));
            if (check % 10 == 0) {
                System.out.println("對");
                return;
            } else {
                System.out.println("為錯誤身分證");
                entryAgain();
            }
    }
}




