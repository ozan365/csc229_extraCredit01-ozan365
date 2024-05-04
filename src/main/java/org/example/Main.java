package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //testProblem01();
        //testProblem02();
        testProblem03();
    }

    public static void testProblem03() {
        System.out.println(Problem03.testSevens(109));

    }

    public static void testProblem02() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {5, 6, 7, 8, 9, 10, 11, 12};

        Problem02.SortArrays(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");;
    }

    public static void testProblem01() {
        //Problem01.compareStrings("sgsdgf", "fgdsgs");
        String[] words = {"cat", "apple", "coat", "car", "act", "taco"};
        Problem01.sortAnagrams(words);

        System.out.println(Arrays.toString(words));
    }


}