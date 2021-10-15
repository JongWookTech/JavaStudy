package CollectionFramework;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<>();
		hash.put(1001, "해보자");
		hash.put(1002, "코딩");
		hash.put(1003, "나는 잉여 데이터");
		hash.put(1004, "테스트용 데이터");
		System.out.println(hash);
		hash.remove(1003);
		System.out.println(hash);
		
		Set set = hash.keySet();
		//Collection Framework의 Set 인터페이스로 HashMap의 key값을 모두 넣는다.
		Iterator<Integer> iter = set.iterator();
		//그렇게 set에 대입시킨 key값을 iterator로 사용하기위해 iter객체에 대입한
		
		
		
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println("\nkey 값 : " + key);
			System.out.println("value 값 : " + hash.get(key));
	}
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(1005, "해보자");
		tree.put(1003, "코딩");
		tree.put(1001, "나는 잉여 데이터");
		tree.put(1002, "테스트용 데이터");
		System.out.println(tree);
		tree.remove(1003);
		System.out.println(tree);
		
		Set<Integer> set2 = tree.keySet();
		Iterator<Integer> iter2 = set2.iterator();
		
		while(iter2.hasNext()) {
			int key = iter2.next();
			System.out.println("\nkey 값 : " + key);
			System.out.println("value 값 : " + tree.get(key));
		}
	}
}
