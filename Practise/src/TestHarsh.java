import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHarsh {
	
	public static Integer add(int a,int b) {
		return a+b;
	}
	
	public static Integer sub(int a,int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		test();
		Integer add = add(2,3);
		Integer sub = sub(4,1);
		System.out.println();
	}

	
	
	static public void test() {
		
		Map<String,List<Integer>> map=new HashMap<>();
		List<Integer> addlist=new ArrayList<>();
		addlist.add(2);
		addlist.add(3);
		map.put("add",addlist );
		List<Integer> subList=new ArrayList<>();
		subList.add(5);
		subList.add(2);
		
		map.put("sub", subList);
		
		Boolean[] check = check(map);
		
		if(check[0]) {
			TestHarsh.add(5, 6);
			
		}
		if(check[1]) {
			TestHarsh.sub(6, 2);
		}
	}
	
	public static Boolean[] check(Map<String, List<Integer>> map) {
		Boolean [] checkArray=new Boolean[2];
		List<Integer> list = map.get("add");
		List<Integer> list2 = map.get("sub");
		
		Integer add = TestHarsh.add(list.get(0),list.get(1));
		   Integer sub = TestHarsh.add(list2.get(0),list2.get(1));
		   
		   if(add instanceof Integer) {
			   checkArray[0]=true;
		   }
		   if(sub instanceof Integer) {
			   checkArray[1]=true;
		   }
		return checkArray;
	}
}
