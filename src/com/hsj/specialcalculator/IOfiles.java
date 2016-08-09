package com.hsj.specialcalculator;

import java.io.FileOutputStream;

import java.io.IOException;
public class IOfiles {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        output.close();
    }
}
