package rahul.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxSumArray {
    
    public static void foo(int[] a){
        int[] dp = new int[a.length];
        
        dp[0]=a[0];
        
        int maxDistSum = 0;
        if(a[0]>=0)
           maxDistSum += a[0];
        //System.out.println(maxDistSum); //
        
        int maxInArray = a[0];
        /* Original  
        for(int i=1;i<a.length;i++){
            //System.out.println("ai"+a[i]);
            if(maxInArray < a[i])
                maxInArray = a[i];
            if(a[i]>=0)
                maxDistSum += a[i];
            System.out.println(maxDistSum);//
            if(a[i]>dp[i-1]+a[i])
                dp[i] = a[i];
            else
                dp[i]=dp[i-1]+a[i];
        }*/
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
        /*if(maxInArray<=0){
            System.out.println(maxInArray+" "+maxInArray);
        }
        else{
            int max=dp[0];
            for(int i=1;i<a.length;i++){
                if(dp[i]>max)
                    max=dp[i];
            }    
            System.out.println(max+" "+maxDistSum);
        }*/
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("test.txt"));
        int t=s.nextInt();
        
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int[] a = new int[n];
            
            for(int j=0;j<n;j++){
                a[i]=s.nextInt();
                //System.out.println(a[i]);
            }
            foo(a);
        }
    }
}