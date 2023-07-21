import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            List<Integer> l1=new ArrayList<Integer>();
            int b=s.nextInt();
            for(int j=0;j<b;j++){
                l1.add(s.nextInt());
            }
            l.add(l1);
            
        }
        int c=s.nextInt();
        for(int i=0;i<c;i++){
            int p=s.nextInt();
            int q=s.nextInt();
            if(q>l.get(p-1).size()) {
                System.out.println("ERROR!");
            }
            else {
                System.out.println(l.get(p-1).get(q-1));
            }
        }
        s.close();
        
    }
}
