
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_1_Count {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };

		List<Integer> data = Arrays.asList(a);
		
		long count = data.stream().count();
		System.out.println(count);
		
		long countEven = Arrays.asList(a).stream().filter(x -> x % 2 == 0).count();
		System.out.println(countEven);
	}
}
