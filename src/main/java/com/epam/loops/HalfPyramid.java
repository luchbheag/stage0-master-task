package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        char[] rowOfHalfPyramid = new char[cathetusLength];
        for (int i = 0; i < cathetusLength; i++) {
            rowOfHalfPyramid[i] = ' ';
        }
        for (int i = cathetusLength; i > 0; i--) {
            rowOfHalfPyramid[i - 1] = '*';
            System.out.println(String.valueOf(rowOfHalfPyramid));
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
