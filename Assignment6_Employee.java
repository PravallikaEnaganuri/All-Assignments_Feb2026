package WeeklyAssignments;

class Person{
	String name;
	int age;	
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
}

class Student extends Person{
	int marks;
	Student(String name,int age,int marks){
		super(name,age);
		this.marks = marks;
	}
	void print() {
		System.out.println("Name: "+super.name+ " Age: "+super.age +" Marks: " +this.marks);
	}
}

public class Assignment6_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student details = new Student("Pravallika",25,100);
      details.print();
	}

}