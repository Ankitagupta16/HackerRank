import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int flag = 0;
        for(int i=0; i<A.length()/2;i++)
        if( A.charAt(i) != A.charAt(A.length()-i-1)) {flag++;break;}
        System.out.println( (flag == 0 ? "Yes" : "No")) ;
    }
}



