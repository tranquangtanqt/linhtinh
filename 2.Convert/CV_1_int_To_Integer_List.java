import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertToInteger {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10};

		// To boxed array
		Integer[] arr1 = Arrays.stream( data ).boxed().toArray( Integer[]::new );
		Integer[] arr2 = IntStream.of( data ).boxed().toArray( Integer[]::new );

		// To boxed list
		List<Integer> list1  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
		List<Integer> list2 = IntStream.of( data ).boxed().collect( Collectors.toList() );
		
		System.out.println(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr1));
		System.out.println(list1);
		System.out.println(list2);
	}
}
