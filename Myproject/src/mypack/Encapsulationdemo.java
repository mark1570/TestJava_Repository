package mypack;

import java.util.Set;

class Student{
	private int rollumber;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public int getRollnumber() {
		return rollumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollumber=rollnumber;
	}
	
		
	}



public class Encapsulationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("Mark");
		System.out.println(s1.getName());
		

	}

}
