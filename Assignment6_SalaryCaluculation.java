package WeeklyAssignments;


class Employee{
	int id;
	String name;
	double basicSalary;
	
	Employee(int id,String name,double basicSalary){
		this.id = id;
		this.name=name;
		this.basicSalary= basicSalary;
	}
	double calculateSalary() {
		double hra =  0.2*basicSalary;
		double bonus = 0.1*basicSalary;
		double totalSalary =basicSalary+ hra+bonus;
		return totalSalary;
	}
	
	void display() {
		System.out.println("ID: "+this.id +"\n" +"Name: "+ this.name+"\n"+"BasicSalary: "+this.basicSalary+ "\n" +"TotalSalary: "+ calculateSalary());
	}
}
public class Assignment6_SalaryCaluculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee details = new Employee(211,"Pravallika",21000);
       details.display();
	}

}
