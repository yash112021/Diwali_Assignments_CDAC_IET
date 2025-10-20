// Coding Challenges
// 2. Given an integer n, reverse its digits and return the reversed number. Ignore
// leading zeros in the reversed result.

import java.util.*;
public class ReverseNumLeadingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // reverse the numbers
        System.out.println("Enter the Number ");
        int n=sc.nextInt();
        System.out.println("The Reversed Number is ---> "+reverseNumber(n));

    }

    // making the function 
    public static int reverseNumber(int n){
        int rem=0;
        int rev=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        return rev;
    }
}