package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CheckID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strID = scanner.next();//此為顯示ID的字串
        int k = 1;
        int letterNums[] = {
                10, 11, 12, 13, 14, 15, 16,
                17, 34, 18, 19, 20, 21, 22,
                35, 23, 24, 25, 26, 27, 28,
                29, 32, 30, 31, 33};
        int first = letterNums[strID.charAt(0) - 'A'];//利用輸入的英文字減去"A"字母找到相對應的位置
        int check = (first / 10) + (9 * (first % 10));//將字母轉換成數字，十位數字為*1。個位數字的餘數(代碼)為*9
        for (int i = 8; i >= 1; i--) {
            check = check + i * Integer.parseInt(strID.substring(k,k + 1));//取得第幾個位置
            k++;//為字串內指向的位置
        }
        check=check+Integer.parseInt(strID.substring(9,10));
        if(check%10==0){
            System.out.println("正確");
        }else {
            System.out.println("錯誤");
        }
    }
}




