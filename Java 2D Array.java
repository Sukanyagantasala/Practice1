import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j]=s.nextInt();
            }
        }
        Sum(a);
    }
    private static void Sum(int a[][]){
        int s=-1000;
        for(int p=0;p<4;p++){
            for(int q=0;q<4;q++){
                int t=a[p][q]+a[p][q+1]+a[p][q+2];
                int m=a[p+1][q+1];
                int b=a[p+2][q]+a[p+2][q+1]+a[p+2][q+2];
                if(t+m+b>s){
                    s=t+m+b;
                }
            }
        }
         System.out.println(s);
        }
    }
