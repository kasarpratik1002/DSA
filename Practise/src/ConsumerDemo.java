import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	
	public static void main(String[] args) {
		Consumer<Integer>consumer=number->System.out.println(" "+number) ;
		
		List<Integer> lst=Arrays.asList(1,2,3,4,5);
		
		printList(lst,consumer);
	}

	private static void printList(List<Integer> lst, Consumer<Integer> consumer) {
		// TODO Auto-generated method stub
		for(Integer integer:lst) {
			consumer.accept(integer);
		}
	}
}
