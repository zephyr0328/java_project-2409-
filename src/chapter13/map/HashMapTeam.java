package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTeam {

	public static void main(String[] args) {
		Map<String, Integer> team = new HashMap<String, Integer>();

		team.put("�����", 1);
		team.put("������", 2);
		team.put("���ڼ�", 3);
		team.put("�����", 4);
		team.put("������", 5);
		
		System.out.println("�� �ο� : "+team.size());
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
