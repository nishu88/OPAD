//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
//import java.String.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String name[]=new String[n];
        int phone[]=new int[n];
        for(int i = 0; i < n; i++){
            name[i] = in.next();
            phone[i] = in.nextInt();
            // Write code here

        }
        while(in.hasNext()){
            String s = in.next();
            int i;
            for(i=0;i<n;i++)
            {
                if(name[i].compareTo(s)==0)
                {
                    System.out.println(name[i]+"="+phone[i]);
                    break;
                }
            }
            if(i==n)
            System.out.println("Not Found");
            // Write code here
        }
        in.close();
    }
}
