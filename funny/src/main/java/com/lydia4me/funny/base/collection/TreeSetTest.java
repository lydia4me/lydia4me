package com.lydia4me.funny.base.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Student> studentSet = new TreeSet<Student>(
				new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						if (o1.getAge() > o2.getAge()) {
							return 1;
						} else if (o1.getAge() < o2.getAge()) {
							return -1;
						}
						return 0;
					}
				});
		studentSet.add(new Student("Jack", 26));
		studentSet.add(new Student("lydia", 29));
		studentSet.add(new Student("only", 24));
		studentSet.add(new Student("lily", 31));
		for(Student s : studentSet){
			System.out.println(s);
		}
	}

}

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return "Name :" + name + "; Age :"+ age;
	}
}