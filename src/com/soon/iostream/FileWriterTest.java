package com.soon.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("writer.txt", true)) {
            fw.write('A');

            char buf[] = {'A', 'B', 'C', 'D', 'E'};
            fw.write('\n');
            fw.write(buf);
            fw.write('\n');
            fw.write(buf, 1, 2);
            fw.write('\n');

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
