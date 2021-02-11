package Arrays;

import java.util.Arrays;

public class CompareArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		int b[]= {1,3,2,5};
		compare(a,b);
	}

	public static void compare(int[] a,int[] b) {
		
		int temp[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					temp[k]=a[i];
					k++;
				}
			}
		
		System.out.println(Arrays.toString(temp));
	}
}
