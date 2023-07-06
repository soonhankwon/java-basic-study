package com.soon.iostream;

import java.io.*;

public class InputStreamTest {

    public static void main(String[] args) {


        // decorator pattern
        try(InputStreamReader ir = new InputStreamReader(new FileInputStream("reader.txt"));
            BufferedReader br = new BufferedReader(ir)) {

            int i;
            while((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("END");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
