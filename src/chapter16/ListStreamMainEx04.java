package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamMainEx04 {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		// List -> Stream
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 확장for
		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("----정렬 후 출력----");
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + " "));

	}

}
