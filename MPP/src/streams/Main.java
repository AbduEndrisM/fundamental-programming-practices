package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		/* flat map */
		List<String> list11 = new ArrayList<>();
		list11.add("aa");
		list11.add("bb");

		List<String> list12 = new ArrayList<>();
		list12.add("cc");
		list12.add("dd");

		List<String> list111 = Stream.of(list11, list12).flatMap(x -> x.stream()).collect(Collectors.toList());

//		System.out.println(list11+""+list12);
//		System.out.println(list111);

		/* Collection to stream */

		List<String> list2 = new ArrayList<>();
		list2.add("aa");
		list2.add("bb");

//				list2.stream()
//					 .forEach(System.out::println);

		/* Array to stream */

		String[] strArr = new String[] { "aa", "bb", "cc" };
		Stream<String> streamArr = Stream.of(strArr);
		Stream<String> streamArr2 = Arrays.stream(strArr);

//			streamArr.forEach(x->System.out.print(x +" "));	 
//			streamArr2.filter(x->x.startsWith("c") || x.startsWith("a"))
//					   .map(x->x.toUpperCase())
//					   .forEach(System.out::println);

		/********** Intermediate **********/
		// filter filter operation
//			streamArr.filter(str -> str.startsWith("a"))
//						.forEach(System.out::print );
//					

//			list111.stream().filter(student -> student.getSex().equals("G"))
//						  .forEach(student -> System.out.println(student.toString()));
//
//			List nums = Arrays.asList(1, 3, null, 8, 7, 8, 13, 10);
//		 
//					 nums.stream()
//					 	.filter(x->x!=null)
//					 	 .distinct()
//					 	 .forEach(System.out::println);

//					 	.collect(Collectors.toList());

//			Stream.of(1, 3, null, 8, 7, 8, 13, 10)
//					.filter(x->x!=null)
//					.filter(x->x>8)
//					.forEach(x->System.out.println(x));
//					 

//			Stream.of(1, 2, 3, 4, 5).filter(item -> item > 3).forEach(System.out::println);

//			Stream.of("a", "b", "hello")
//				   .map(x->x.toUpperCase())
//				   .forEach(System.out::println);
//			

		/*
		 * int [] numArr = {1,2,3,4};
		 * 
		 * Stream.of(numArr) .map(x->x*x) .forEach(System.out::println);
		 * 
		 */
//		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//		List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
//		System.out.println(squareNums);

//		nums.stream()
//		.map(n -> n * n)
//		.forEach(System.out::println);

		// Prints out:
		/*
		 * [The, quick, brown, fox., Jumped, over, the, lazy, dog.]
		 */

//		List<String> sentences = new ArrayList<>();
//		sentences.add("The quick brown fox.");
//		sentences.add("Jumped over the lazy dog.");
//		System.out.println(sentences);
//
//		List<String> words = sentences.stream()
//									  .flatMap(x -> Arrays.stream(x.split(" "))) ///first s[lit then change to stream from array
//									  .collect(Collectors.toList());
//
//		System.out.println(words);

// 					 
//			 
//
//		//flatMap will expand the stream
//		List<String> list21 = new ArrayList<>();
//		list21.add("aa");
//		list21.add("bb");
//		List<String> list22 = new ArrayList<>();
//		list22.add("cc");
//		list22.add("dd");
//		
//			Stream.of(list21,list22)
//			     	.flatMap(x -> x.stream())
////			     	.collect(Collectors.toList());
//			     	.forEach(System.out::println);
//		
//		
//		Stream<List<Integer>> inputStream = Stream.of(
//				 Arrays.asList(1),
//				 Arrays.asList(2, 3),
//				 Arrays.asList(4, 5, 6)
//				 );
//		 
//				Stream<Integer> outputStream = inputStream.flatMap((x) -> x.stream());
//															.map(x->x*x)
//															.forEach(System.out::print);
//				System.out.println(outputStream);

		
		
	}

}
