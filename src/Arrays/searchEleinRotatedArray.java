package Arrays;

public class searchEleinRotatedArray {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,1,2};
		int n=a.length;
		int key=2;
		if(search(a,n,key)==0)
			System.out.println("Element not found");
		else
		System.out.println("At Index:" +search(a,n,key));

	}
	
	public static int search(int a[],int n,int key) {
		
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				index=i;
			}
			}
		
		return index;
	}

}
