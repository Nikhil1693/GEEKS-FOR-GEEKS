package Arrays;

import java.util.Arrays;

public class ZeroatEnd {

	public static void main(String[] args) {
		
		int a[]= {1,0,3,0,4,8,3,0,5};
		int n=a.length;
		System.out.println(Arrays.toString(zeros(a,n)));
	}
	
	public static int[] zeros(int a[],int n) {
		
		int count=0;
		int temp;
		
		for(int i=0;i<n;i++) {
			/*
			 * if(a[i]!=0) a[count++]=a[i];
			 * 
			 * while(count<n) a[count++]=0;
			 */
			
			if(a[i]!=0) {
				temp=a[count];
				a[count]=a[i];
				a[i]=temp;
				count=count+1;
			}
		}
		
		return a;
	}

}
