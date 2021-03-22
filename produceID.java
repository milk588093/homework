package com.company;
import java.io.IOException;
import java.util.Random;

public class produceID {
    static String checkHead = "ABCDEFGHJKLMNPQRSTUVWXYZIO";
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        String ID = "";
        int CheckID = 0;	// 產生前9碼的同時計算產生驗證碼
        // 產生第一個英文字母
        int t=(r.nextInt(26)+65);
        ID=ID+(char)t;
        t=checkHead.indexOf((char)t)+10;
        CheckID =CheckID+ t/10;
        CheckID =CheckID + t%10*9;

        // 產生第2個數字 (1~2)
        ID=ID+ Integer.toString(t = r.nextInt(2)+1);
        CheckID =CheckID + t*8;
        // 產生後8碼
        for (int i=2; i<9; i++){
            ID += Integer.toString(t = r.nextInt(10));
            CheckID =CheckID + t*(9-i);
        }
        // 完成驗證碼計算
        CheckID  = (10-((CheckID)%10))%10;
        ID=ID+ Integer.toString(CheckID);
        System.out.println("身分證字號為:"+ID);
    }

}
