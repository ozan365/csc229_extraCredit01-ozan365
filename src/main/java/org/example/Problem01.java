package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class Problem01 {
    //NOTE: n is the input size of string length
    //x is the amount of strings inputted

    public static void sortAnagrams (String[] words){
        //Space complexity O(x) since dependent on amount of words
        ArrayList<String> wordsList = new ArrayList(words.length);
        ArrayList<String> sortedList = new ArrayList(words.length);


        //Time complexity of O(x) since traversing array
        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
        }


        while(!wordsList.isEmpty()) {
            //Worst case if no anagrams: x^2 comparisons are made
            //O(x^2) time complexity with each comparison O(n^2) time complexity and O(n) space complexity
            //O(x^2 * n^2) time complexity and O(x^2 * n) space complexity

            for(int j = 1; j < wordsList.size(); j++) {
                if (compareStrings(wordsList.get(0),wordsList.get(j))) {
                    sortedList.add(wordsList.remove(j));
                    j--;
                }
            }
            sortedList.add(wordsList.remove(0));
        }



        //Copying array, time complexity of O(n)
        for(int i = 0; i < words.length; i++) {
            words[i] = sortedList.get(i);
        }




    }

    public static boolean compareStrings(String a, String b) {
        //space complexity O(n) since it is dependent on string length
        //time complexity negligible
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        char temp;

        //Sort a in O(n^2) time complexity
        //space complexity negligible
        for(int i = 0; i < aChars.length - 1; i++) {
            for (int j = i + 1; j < aChars.length; j++) {
                if (aChars[i] > aChars[j]) {
                    temp = aChars[i];
                    aChars[i] = aChars[j];
                    aChars[j] = temp;
                }
            }
        }


        //Sort a in O(n^2) time complexity
        for(int i = 0; i < bChars.length - 1; i++) {
            for (int j = i + 1; j < bChars.length; j++) {
                if (bChars[i] > bChars[j]) {
                    temp = bChars[i];
                    bChars[i] = bChars[j];
                    bChars[j] = temp;
                }
            }
        }



        //total of this method: space complexity O(n), time complexity O(n^2)
        return Arrays.equals(aChars, bChars);
    }
}