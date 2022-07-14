class Solution4 {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));
	}
    public static String removeDuplicates(String s) {
    	
    	StringBuilder builder=new StringBuilder(s);
    	int i=0;
    	
    	boolean flag=false;
    	boolean end=false;
    	while(i<builder.length()-1) {
    		int k=i+1;
    		while(builder.charAt(i)==builder.charAt(k)) {
    			flag=true;
    			k++;
    			if(k==builder.length()-1) {
    				end=true;
    				break;
    			}
    		}
    		
    		builder=flag?builder.delete(i, end?k+1:k):builder;
    		System.out.println(builder);
    		if(builder.length()<s.length()&&flag) {
    			i=0;
    		}
    		else {
    			i++;
    		}
    		flag=false;
    	}
   
    	return builder.toString();
    }
}