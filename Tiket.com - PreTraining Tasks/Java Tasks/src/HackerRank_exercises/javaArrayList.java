package HackerRank_exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<k;j++){
                list.add(sc.nextInt());
            }
            arr.add(list);
        }

        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(arr.get(x-1).size() > y-1){
                System.out.println(arr.get(x-1).get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
