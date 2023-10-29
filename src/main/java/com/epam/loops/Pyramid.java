package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.print("");
            return;
        }

        char[] rowOfPyramid = new char[cathetusLength];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < rowOfPyramid.length; i++) {
            rowOfPyramid[i] = ' ';
        }

        for (int i = 0; i < cathetusLength; i++) {
            char current = (char)('0' + i + 1);
            rowOfPyramid[cathetusLength - i - 1] = current;
            if (i != 0) {
                stringBuilder.append(current);
            }
            System.out.println(String.valueOf(rowOfPyramid) + stringBuilder.toString());
        }
/*
        char[] rowOfPyramid = new char[cathetusLength * 2 - 1];
        for (int i = 0; i < rowOfPyramid.length; i++) {
            rowOfPyramid[i] = ' ';
        }
        for (int i = 0; i < cathetusLength; i++) {
            char current = (char)('0' + i + 1);
            rowOfPyramid[cathetusLength - 1 - i] = current;
            rowOfPyramid[cathetusLength - 1 + i] = current;
            System.out.println(String.valueOf(rowOfPyramid));
        }
        System.out.println();
 */
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);

    }

}
