/*
 Write a program that prompts the user to input an integer and then 
outputs the number with the digits reversed. For example, if the input is 
12345, the output should be 54321.
 */
import java.util.*;
public class reverse {
    public static void main(String args[])
    {
        int num,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to reverse = ");
        num=sc.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        
        System.out.println("reverse number = "+rev);
    }
}
