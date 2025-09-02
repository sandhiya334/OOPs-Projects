package Class_Objects;

public class PartTimeEmployee extends Employee { 
	private double HrRate;
	private int HrWorked;
	
	public PartTimeEmployee(String EName, int EId,String type,double HrRate, int HrWorked) {
		super(EName, EId,type);
		this.HrRate = HrRate;
		this.HrWorked = HrWorked;
	}
	public double EmpSalary() {
		return HrRate * HrWorked;
	}
	

}
