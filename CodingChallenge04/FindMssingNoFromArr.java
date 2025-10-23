// Coding Challenges
// 3. You are given an array of size n that contains distinct numbers from 0 to n. Your
// task is to find the one number that is missing from the array.
import java.util.*;
public class FindMssingNoFromArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []yash={0,2,1,4} ;
        int mssingNo=findTheMissingNumber(yash);
        System.out.println("The Missing Number in  the array --->"+ mssingNo);

        // now taking the input from the array 
        System.out.print("Enter the array length--> ");
        int len=sc.nextInt();
        // decalring the array in
        int arr1[]=new int [len];
        // taking the input from the user 
        System.out.println("Enter the array Elements from 0  to "+len+" and try to mis one missing ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("the Missing No arra1 is -->"+findTheMissingNumber(arr1));

    }

    // find the missing the Number
    public static int findTheMissingNumber(int arr[]){
        // now calcaluting the sum according to the arrlength
        int n=arr.length;
        int sum=(n*(n+1))/2;

        int total=0;
        for(int i=0;i<arr.length;i++){
            total +=arr[i];
        }

        return sum-total;
    }

}
