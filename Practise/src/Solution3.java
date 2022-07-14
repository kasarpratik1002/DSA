
public class Solution3 {
public static void main(String[] args) {
	String s="    ";
	int q=s.isBlank()||s.equals("")?0:s.trim().split("[ ]+").length;

	System.out.println(q);
	
	
	
}
}
