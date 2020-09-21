package Strings;

public class FirstandLastReverse {

	public static void main(String[] args) {
		
		String str="nikhil aggarwal";
		System.out.print(reversefirstchar(str));
		

	}

	public static String reversefirstchar(String s) {
	
		char[] c =s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			int k=i;
			
			while(i<c.length && c[i]!=' ') 
				i++;
				
				char temp=c[k];
				c[k]=c[i-1];
				c[i-1]=temp;
				
			
		}
		
		return new String(c);
		
	   
	
	}
}
