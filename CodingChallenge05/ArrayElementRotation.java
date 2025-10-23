// Coding Challenges
// 4. You are given an integer array nums and an integer k. Rotate the array to the
// right by k steps, where k is non-negative.
import java.util.*;
public class ArrayElementRotation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []yash={1,2,3,4,5,6,7};
        System.out.println("Original Array --->");
        for(int i=0;i<yash.length;i++){
            System.out.print(yash[i]+" ");
        }
        System.out.print("Enter the N of Rotations --->");
        int n=sc.nextInt();
        System.out.println("\n*****************************");
        rottArr(yash,n);
    }


    // function that will rotate the array element 
    public static void  rottArr(int arr[],int n){
       // this is special case scenarion we are if arr.length and n are  same then then array becomes to previous state so only getting the extra iterations which are going to effect our code
        if(arr.length<=n){   
            n= n%arr.length;
        }
        for(int ia=1;ia<=n;ia++){
            // copying the last element
            int temp=arr[arr.length-1];
            // shifting the elemnets towards right
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            // now adding the element  in the first
            arr[0]=temp;

            // now printing the array
            System.out.print(ia+" --> iteration ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
       }
       System.out.println();
       System.out.println("**********final output -->************");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}           
