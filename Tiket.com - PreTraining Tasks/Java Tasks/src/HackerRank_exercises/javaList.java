package HackerRank_exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            String s = sc.next();
            if(s.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();

                arr.add(index, value);
            } else {
                int value = sc.nextInt();
                arr.remove(value);
            }

        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
