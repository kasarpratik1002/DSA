import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		boolean palindrome = isPalindrome(1111);
		System.out.println(palindrome);
	}
	
	 public static boolean isPalindrome(int x) {
	      
	        String s=String.valueOf(x);
	        String arr[]=s.split("");
	        String temp="";
	        int i=0;
	        int j=arr.length-1;
	        while(i<j){
	        	if(arr[i]!=arr[j]) {
	        		temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
	        	}
	            
	            i++;
	            j--;
	          
	        }
	        String s1="";
	        for(String sp:arr) {
	        	s1+=sp;
	        }
	      String join = String.join("", arr);
	        return join.equals(s);
	        
	    }
	
}
