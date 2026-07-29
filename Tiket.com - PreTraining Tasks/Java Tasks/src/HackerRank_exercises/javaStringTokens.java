package HackerRank_exercises;

import java.io.*;
import java.util.*;

public class javaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Write your code here.
        String[] arr = s.split("[^A-Za-z]+");

        System.out.println(arr.length);

        for(String token : arr){
            System.out.println(token);
        }

        scan.close();
    }
}

