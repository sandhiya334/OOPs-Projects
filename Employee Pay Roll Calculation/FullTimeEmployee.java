
public class FullTimeEmployee extends Employee {

	private double BaseSalary;
	private double Bonus;
	public FullTimeEmployee(String EName, int EId,String type, double BaseSalary,double Bonus) {
		super(EName, EId,type);
		this.BaseSalary = BaseSalary;
		this.Bonus = Bonus;
	}
	public double EmpSalary() {
		return BaseSalary + Bonus;
	}
	
}
