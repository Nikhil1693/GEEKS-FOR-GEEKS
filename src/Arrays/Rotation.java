package Arrays;

import java.lang.reflect.Array;

public class Rotation {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		rotate(a,3,7);
		print(a,7);
		
		

	}
	
	public static void rotate(int a[],int d,int n) {
		
		for(int i=0;i<d;i++) {
			rotatebyone(a,n);
		}
	}
		
		public static void rotatebyone(int a[],int n) {
		int i,temp;
		temp=a[0];
		for(i=0;i<n-1;i++) 
			 a[i]=a[i+1];
			a[i]=temp;
		
		
}
		public static void print(int a[],int n) {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
		}

}
