import java.io.*;
import java.util.*;
import java.util.Scanner;

public class code1{

    public static void main(String[] arg) {
        
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name: ");
        String A=sc.next();
	System.out.println("Enter the last name: ");
        String B=sc.next();       
        int len_M = A.length();
        System.out.println((("Output: "+ A.substring(0,1)).toUpperCase()+(A.substring(1,len_M).toLowerCase()))+" "+ ((B.toUpperCase())));
    }
}