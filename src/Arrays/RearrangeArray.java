package Arrays;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		int a[]= {-1,-1,6,1,9,3,2,-1,4,-1};
		System.out.println(Arrays.toString(rearrange(a)));
		

	}

	public static int[] rearrange(int[] a) {
		
		for(int i=0;i<a.length;i++) {
		
			if(a[i]!=-1 && a[i]!=i) {
				int x=a[i];
				
				while(a[x] != -1 && a[x]!=x) {
					int y=a[x];
					
					a[x]=x;
					x=y;
				}
				a[x]=x;
				if(a[i]!=i) {
					a[i]=-1;
				}
			}
			
		}
		return a;
	}
}
