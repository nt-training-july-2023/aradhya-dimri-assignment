package collection;

import java.util.*;

class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Student that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}

}

public class ComparableandComparator {

	public static void main(String[] args) {
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if (i.age > j.age)
					return 1;

				else
					return -1;
			}
		};
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(46, "arun"));
		studs.add(new Student(35, "barak"));
		studs.add(new Student(71, "josh"));
		studs.add(new Student(87, "kohli"));

		// Collections.sort(studs,com);//Comparator
		Collections.sort(studs);// Comparable
		for (Student s : studs)
			System.out.println(s);

	}

}
