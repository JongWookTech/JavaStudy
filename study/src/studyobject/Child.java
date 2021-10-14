package studyobject;

import java.util.HashSet;

public class Child {
	public static void main(String[] args) {
		Parents parents = new Parents("해보자코딩");
		Parents parents2 = new Parents("해보자코딩");
		Parents parents3 = new Parents("안해요 코딩");
		Parents2 parents22 = new Parents2("해보자코딩");
		System.out.println(parents);
		
		HashSet<Parents> hash1 = new HashSet<Parents>();
		HashSet<Parents> hash2 = new HashSet<Parents>();
		HashSet<Parents> hash3 = new HashSet<Parents>();
		hash1.add(parents);
		hash2.add(parents);
		hash3.add(parents2);
		
		System.out.println("hash1 객체의 hashcode : " + hash1.hashCode());
		System.out.println("hash2 객체의 hashcode : " + hash2.hashCode());
		System.out.println("hash2 객체의 hashcode : " + hash3.hashCode());
		System.out.println("hash1 객체와 hash2 객체의 비교 : " + hash1.equals(hash2));
		System.out.println("hash1 객체와 hash3 객체의 비교 : " + hash1.equals(hash3) +"\n");
		
		
		System.out.println("parents의 hashcode 값 : " + parents.hashCode());
		System.out.println("parents2의 hashcode 값 : " + parents2.hashCode());
		System.out.println("parents3의 hashcode 값 : " + parents3.hashCode());
		System.out.println("parents와 parents2의 비교 : " + parents.equals(parents2));
		System.out.println("parents와 parents3의 비교 : " + parents.equals(parents3) +"\n");
		
		System.out.println("parents22의 hashcode 값 : " + parents22.hashCode());
		System.out.println("parents22와 parents의 비교 : " + parents22.equals(parents2) +"\n");
	}		
}
