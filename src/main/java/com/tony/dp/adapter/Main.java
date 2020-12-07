package com.tony.dp.adapter;

import java.io.*;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 14:56
 * Description:适配器模式
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr);
        String line = reader.readLine();
        while (line!=null && !line.equals("")){
            System.out.println(line);
        }
        reader.close();
    }
}
