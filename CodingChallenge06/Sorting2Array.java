// sorting two array problem 
// Coding Challenges
// 5. You are given two sorted arrays nums1 and nums2. Your task is to merge them
// into a single array sorted in non-decreasing order
import java.util.*;
public class Sorting2Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // two arrays sorted one 
        int [] a={1,2,3,4,5,6};
        int [] b= {10,20,30,40,50};
        int []res=sortedMergeTwoArray(a,b);
        //now printing the merged and the sorted array
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }


    // now creating the thrid array and and merge both the array in the sorted form
    public static int[] sortedMergeTwoArray(int []a,int []b){
        // temp arrya
        int temp[]=new int[a.length+b.length];
        // now traversing both the array  
        int arridx=0,  i=0, j=0;
        
        while (i<a.length && j<b.length) {
            if(a[i]  < b[j]){
                 temp[arridx]=a[i];
                 i++;
                arridx++;
            }
            else if(a[i]  > b[j]){
                temp[arridx]=b[j];
                j++;
                arridx++;
            }
        }


            // mannally adding the elements     because while filling if one of the array gets finished the remiainng elements need to be added    
            while (i < a.length) temp[arridx++] = a[i++];
            while (j < b.length) temp[arridx++] = b[j++];



        return temp;
    }
}
