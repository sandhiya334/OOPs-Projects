

public class Employee {
	String EmpName;
	int EmpId;
	double EmpSalary;
	String type;
	
	public Employee(String EName,int EId,String type) {
	    this.EmpName = EName;
	    this.EmpId = EId;
	    this.type = type;   
	}

	
	public double EmpSalary() {
		return 0;
	}
	public void display() {
	    System.out.println("\nEmployee Id : " + EmpId +
	                       "\nEmployee Name : " + EmpName +
	                       "\nEmployee Salary : " + EmpSalary() +  
	                       "\nEmployee Type : " + type);
	}

}
