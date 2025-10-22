package com.demo.dao;

public class DaoInterfaceImpl implements DaoInterface {

	
	
	
	// addition of two Numbers
	@Override
	public int addtwoNum(int a, int b) {
		
		return a+b;
	}

	// logic part for printing the table
	@Override
	public void printTable(int a) {
		for(int i=1;i<11;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
		System.out.println();	
	}

	
	// logic part for printing the patterns the pyramid and the traingel 
	@Override
	public void printPatterns(int n) {
	
		System.out.println("Traingle pattern Printing \n");
		// traingle pattern
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		System.out.println("pattern pattern printing \n");
		// now printing the pyramid pattern
		for(int i=1;i<=n;i++) {  // outer loop for no of rows
			
			for(int j=1;j<=(n-i);j++) {  // for leaving the spaces 
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i*2-1);j++) { // for star
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

	
	// sum of all n digits 
	@Override
	public int sumOfAllDigits(int a) {
		// now we can use the loop also but therse is a shortcut formual n(n+1)/2
		// we can print the number till n
		System.out.print("\n******** ");
		for(int i=1;i<=a;i++) {
			System.out.print(" "+i);
		}
		System.out.print("   ********\n");
		System.out.println("");
		
		
		return (a*(a+1))/2;
	}

	// finding the GCD and LCM of the one 
	// you should one form  GCD(a,b)*LCM(a,b) =a*b so if you find the gcd then you can easily find the lcm
	// lcm =a*b/GCD
	// GCD -->greatest common factor

	@Override
	public int[] findgcd_lcm(int a, int b2) {
		// first you need to find the common factors you will require two array of the same size of that of a and b
		int temp[]=new int [2];
		int aa[]=new int[a];
		int bb[]=new int[b2];
		int k=0,j=0;
		//now finding the factors 
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				aa[k]=i; // adding the factors element
				k++;
			}
		}
		//now same for that of the b2
		for(int i=1;i<=b2;i++) {
			if(b2%i==0) {
				bb[j]=i; // adding the factors element
				j++;
			}
		}
		boolean found=false;
		
		// now from the two arrays finding the GCD highest common factor
		int gcd=0;
		for(int i=k-1;i>=0  && !found;i--) {   // here the found has being used untill unless we get it the gcd,gcd got braeak;
//			gcd=aa[i];
			for(int ja=j-1;ja>=0;ja--) {
				if(aa[i]==bb[ja]) {
					gcd=bb[ja];
					temp[0]=bb[ja];
					found=true;
					break;
				}
			}
		}
//		temp[0]=gcd;
		// now finding the the lcm 
		int lcm = (a*b2)/gcd;
				temp[1]=lcm;
		return temp;
	}

}
