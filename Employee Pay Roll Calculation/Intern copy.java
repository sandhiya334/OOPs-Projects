package Class_Objects;

public class Intern extends Employee{ 
		private double Stipend;
		
		public Intern(String EName, int EId,String type,double Stipend) {
			super(EName, EId,type);
			this.Stipend = Stipend;
		}
		public double EmpSalary() {
			return Stipend;
		}
		
		
}
