package HackerRank_exercises;

import java.io.*;
import java.util.*;

class javaLoopsII{
    public static void func(int a , int b, int n){
        int sum = a;

        for(int i=0;i<n;i++){

            sum += (int)Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while(q > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            func(a, b, n);
            System.out.println();

            q--;
        }
    }
}
