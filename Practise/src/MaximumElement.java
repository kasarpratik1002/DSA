import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumElement {
	public static void main(String[] args) {
		List<String> operations=new ArrayList<>();
		operations.add("1 23");
		operations.add("1 65");
		operations.add("3");
		List<Integer> max = getMax(operations);
		for(int i=0;i<max.size();i++) {
			System.out.println(max.get(i));
		}
	}

	public static List<Integer> getMax(List<String> operations) {
		// Write your code here
		Stack<Integer> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		List<Integer> finallist = new ArrayList<>();
		for (String s : operations) {
			if (s.length() > 1) {
				String split[] = s.split("[ ]+");
				if ("1".equalsIgnoreCase(split[0])) {
					int data = Integer.parseInt(split[1]);
					stack.push(data);
				}

			} else {
				if ("2".equalsIgnoreCase(s)) {
					stack.pop();

				}
				if ("3".equalsIgnoreCase(s)) {

					//int k = 0;
					while (!stack.isEmpty()) {
						int data = stack.pop();
						result.add(data);
					}
					int max = result.get(0);
					for (int i = 1; i < result.size(); i++) {
						if (result.get(i) > max) {
							max = result.get(i);
						}
						
					}

					finallist.add(max);

				}
			}
		}
		return finallist;
	}
}
