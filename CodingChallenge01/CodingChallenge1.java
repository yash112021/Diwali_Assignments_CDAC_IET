//coding challenge No 01
// You are given an array of strings. Your task is to determine the length of the
// longest string in the array.
public class CodingChallenge1 {
    public static void main(String[] args) {
        // making an array will strore the string 
        String yash[]={"yash","Patil","BMW_AUDI_Ferrai_Jaguar","Gian ","Mistubhsi"};

          // first assuming that the first index  has the max length so what we will do
        int maxlength=yash[0].length();
        int index=-1;
        // now first traversing the array
        for(int  i=0;i<yash.length;i++){
            // now comaparing the first string length with the anthe ronr
            if(maxlength < yash[i].length()){
                maxlength=yash[i].length();
                // now require one variable to track the the the index becoz we will get the max length but not the index
                index=i;
            }
        }

        System.out.println("The MaxLength is --> "+maxlength);
        System.out.println("The Max length is at these Particular index --> "+index);
        System.out.println("The Element at which it is max is --> "+yash[index]);

    }
}
