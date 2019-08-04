
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Stream_2_SummaryStatistics {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.asList(a).stream().mapToInt(x -> x).summaryStatistics().getSum());

		System.out.println(Arrays.asList(a).stream().mapToInt(x -> x).summaryStatistics().getMax());
		
		System.out.println(Arrays.asList(a).stream().mapToInt(x -> x).summaryStatistics().getMin());
		
		System.out.println(Arrays.asList(a).stream().mapToInt(x -> x).summaryStatistics().getAverage());
		
		System.out.println(Arrays.asList(a).stream().mapToInt(x -> x).summaryStatistics().getCount());
	}
}
