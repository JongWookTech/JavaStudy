package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("해보자 코딩");
		list.add("저희 다 같이 열심히 해요");
		list.add("화이팅");
		
		System.out.println("list의 0번 index : " + list.get(0));
		System.out.println("list의 1번 index : " + list.get(1));
		System.out.println("list의 2번 index : " + list.get(2)+"\n");

		list.remove(1);
		System.out.println("list의 0번 index : " + list.get(0));
		System.out.println("list의 1번 index : " + list.get(1));
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("하이");
		list2.add("하이1");
		list2.add("하이2");
		list2.add("하이3");
		list2.add("하이4");
		
		list2.remove(2);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
	}
}
