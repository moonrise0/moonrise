package inherit;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	
	public Employee() {
	}


	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}


	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
		
		
	}


	@Override
	public String toString() {
		
		return id + "" + name+ ""+ salary;
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public double getIncentive() {
		// TODO Auto-generated method stub
		return 0;
	}
	   
    
	
}
