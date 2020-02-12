package Day11_13;

import java.util.Arrays;

public class PersonTest {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Leed", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Boo", 37);
		
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
		
	}	
}

class Person implements Comparable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.name.length() - p.name.length(); // 
	}
	/*
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.age - p.age;
	}*/
	
	public String toString() {
		return name + ": " + age;
	}
	
}