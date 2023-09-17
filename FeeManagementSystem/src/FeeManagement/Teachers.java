package FeeManagement;

public class Teachers {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	Teachers(int id,String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = salaryEarned;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		Organization.updateTotalMoneyPaid(salaryEarned);
	}
	public String toString() {
		return "Teacher Name: "+id+"."+name+" || Total Salary Earned: "+salaryEarned;
	}

}
