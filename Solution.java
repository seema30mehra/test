package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String time2=time.substring(0,time.length()-2);
        String[] a = time2.split(":");
        String[] out = a;
        if(time.contains("PM"))
        {
        	if(a[0].equals("12"))
        	{
        		out[0]="12";
        	}
        	else
        	{
        		out[0]=Integer.toString(Integer.parseInt(out[0])+12);
        	}
        	
        }
        if(time.contains("AM"))
        {
        	if(a[0].equals("12"))
        	{
        		out[0]="00";
        	}
        }
        
        for(int i=0;i<out.length;i++)
        {
        	System.out.print(out[i]);
        	if(i!=out.length-1)
        	System.out.print(":");
        }
    }
}
