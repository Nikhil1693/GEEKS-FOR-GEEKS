package Arrays;

public class MaxdiffInArray {

	public static void main(String[] args) {

		int a[]= {1,4,7,15,30};
		int max=maxdiff(a);
		System.out.println(max);
	}
	
	public static int maxdiff(int[] a) {
		
		/*
		 * int max[]=new int[a.length-1]; int k=0,l=0; int diff=0; for(int
		 * i=0;i<a.length-1;i++) {
		 * 
		 * max[i]=a[k+1]-a[i]; k++; }
		 * 
		 * for(int j=0;j<max.length-1;j++) { if(max[j]>max[l+1]) diff = max[j]; else
		 * diff=max[l+1]; l++;
		 * 
		 * }
		 * 
		 */
		
		int diff=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]>diff) {
				diff=a[i+1]-a[i];
			}
		}
		
		return diff;
		
		}

}
