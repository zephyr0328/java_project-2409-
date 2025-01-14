package chapter13.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2))*-1; // *-1하면 내림차순
	}
}

public class TreeSerEx06 {

	public static void main(String[] args) {
		//Set<String> set = new TreeSet<String>(); // 오름차순
		Set<String> set = new TreeSet<String>(new MyCompare()); // 내림차순
		
		set.add("aaa");
		set.add("zzz");
		set.add("ggg");
		set.add("kkk");
		set.add("ccc");

		System.out.println(set);
	}

}
