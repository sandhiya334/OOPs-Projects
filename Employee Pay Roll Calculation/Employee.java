
public class Emppackage Class_Objects;
loyee {
	String EmpName;
	int EmpId;
	double EmpSalary;
	String type;
	
	public Employee(String EName,int EId,String type) {
		this.EmpName = EName;
		this.EmpId = EId;
	}
	public double EmpSalary() {
		return 0;
	}
	
	public void display() {
		System.out.println("\nEmployee Id : "+EmpName+"\nEmployee Name : "+EmpId+"\nEmployee Salary " +EmpSalary+
				"\nEmployee Type : "+type);
	}
}
