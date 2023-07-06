package com.soon.iostream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

            rf.writeInt(100);
            System.out.println(rf.getFilePointer());
            rf.writeDouble(3.14);
            System.out.println(rf.getFilePointer());
            rf.writeUTF("하이");
            System.out.println(rf.getFilePointer());

            rf.seek(0);

            System.out.println(rf.readInt());
            System.out.println(rf.readDouble());
            System.out.println(rf.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
