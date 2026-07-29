package HackerRank_exercises;

import java.io.*;
import java.util.*;

public class javaAnagrams {
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;

        int[] freq = new int[26];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        if(isAnagram(a, b)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
