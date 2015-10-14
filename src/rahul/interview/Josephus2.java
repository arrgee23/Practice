package rahul.interview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Josephus2{


    static int josephus(int n){
        LinkedList<Integer> l = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            l.add(i+1);
        }
        ListIterator<Integer> it= l.listIterator();
        while(l.size()>1){
           for(int i=0;i<2;i++){
        	   if(it.hasNext())
        		   it.next();
        	   else{
        		   it = l.listIterator();it.next();
        	   }
           }
           it.remove();
        }
        
        return l.get(0);
    }
   
 @SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext())
        System.out.println(s.next());
   }
}
