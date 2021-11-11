package com.wight.decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\桌面\\head-first-design-pattern\\demo\\src\\main\\java\\com\\wight\\decorator\\io\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
