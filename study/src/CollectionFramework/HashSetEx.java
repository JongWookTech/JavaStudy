package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(9);
		hash.add(3);
		hash.add(4);
		hash.add(5);
		
		Iterator<Integer> iter = hash.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		} 
		System.out.println();
		System.out.println(hash);
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(9);
		tree.add(5);
		tree.add(3);
		tree.add(4);
		System.out.println(tree);
		tree.remove(3);
		
		System.out.println(tree);
		
	}
}
