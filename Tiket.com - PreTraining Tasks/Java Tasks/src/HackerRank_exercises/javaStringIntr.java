package HackerRank_exercises;

import java.io.*;
import java.util.*;

public class javaStringIntr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B) <= 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        StringBuilder sb = new StringBuilder();
        sb.append((char)(A.charAt(0)-32));
        for(int i=1;i<A.length();i++){
            sb.append(A.charAt(i));
        }
        sb.append(" ");

        sb.append((char)(B.charAt(0)-32));
        for(int i=1;i<B.length();i++){
            sb.append(B.charAt(i));
        }

        System.out.println(sb);

    }
}
