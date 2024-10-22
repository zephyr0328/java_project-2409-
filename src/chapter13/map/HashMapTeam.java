package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTeam {

	public static void main(String[] args) {
		Map<String, Integer> team = new HashMap<String, Integer>();

		team.put("¿ìÈñ¹Î", 1);
		team.put("ÀÌÀºÁ¤", 2);
		team.put("°­ÀÚ¼º", 3);
		team.put("±è¿ø±â", 4);
		team.put("°­¼­¿¬", 5);
		
		System.out.println("ÆÀ ÀÎ¿ø : "+team.size());
		System.out.println();	

		Iterator<String> it = team.keySet().iterator();

		while (it.hasNext()) {
			String name = it.next();
			int value = team.get(name);
			System.out.println(name + " : " + value);
		}
		System.out.println();

	}

}
