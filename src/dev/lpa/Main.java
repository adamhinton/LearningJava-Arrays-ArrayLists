package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] originalArray = {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list:" + originalList);
        System.out.println("array:" + Arrays.toString(originalArray));
    }
}