
import java.util.*;

public class MainEmployee {
	public static void main(String args[]) {
		ArrayList<Employee> emp = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			int nextId = 1;

			while (true) {
				System.out.println("\n-- Employee PayRoll System Management --");
				System.out.println("1. Add Full-Time Employee");
				System.out.println("2. Add Part-Time Employee");
				System.out.println("3. Add Intern");
				System.out.println("4. Display All Employees");
				System.out.println("5. Exit");
				System.out.print("\n\tChoice: ");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1: 
					System.out.println("\n1. Add Full-Time Employee");
					
					System.out.print("\nEnter the Employee name ");
					String ftName = sc.nextLine();
					
					System.out.print("Enter the Employee Base Salary ");
					double ftbase = sc.nextDouble();
					sc.nextLine();
					
					System.out.print("Enter the Employee Bonus");
					double ftbonus = sc.nextDouble();
					sc.nextLine();
					
					System.out.print("Enter Type ");
					String type = sc.nextLine();
					
					emp.add(new FullTimeEmployee(ftName, nextId++,type, ftbase, ftbonus));
					
					System.out.println("Full Time Employee Added !.."); 
					break;
					
				case 2: 
					System.out.println("\n2. Add Part-Time Employee");
					
					System.out.print("\nEnter the Employee name ");
					String ptName = sc.nextLine();
					
					System.out.print("Enter the Employee Total Working Hours ");
					int hr = sc.nextInt();
					
					System.out.print("Enter the Employee Per Hours Rate: ");
					double rate = sc.nextDouble();
					sc.nextLine();  
					
					System.out.print("Enter Type: ");
					String type2 = sc.nextLine();
					
					
					emp.add(new PartTimeEmployee(ptName, nextId++,type2, rate, hr));
					
					System.out.println("Part Time Employee Added !..");
					break;
					
				case 3: 
					System.out.println("\n3. Add Intern");
					
					System.out.print("\nEnter the Intern name ");
					String Name = sc.nextLine();
					
					System.out.print("Enter the Intern Stipend: ");
					double stipend = sc.nextDouble();
					sc.nextLine(); // ✅ consume newline

					System.out.print("Enter Type: ");
					String type3 = sc.nextLine();
					
					emp.add(new Intern(Name, nextId++,type3, stipend));
					
					System.out.println("Full Time Employee Added !..");
					break;
					
				case 4:
					if(emp.isEmpty()) {
						System.out.println("No Employee Is there To Display !..");
					}
					else {
						System.out.println("\n-------------------------------------\n");
						System.out.println("\tThe Employees Details....");
						
						for(Employee e: emp) {
							e.display();
							System.out.println("\n-------------------------------------\n");
						}
					}
					break;
					
				case 5:
					 System.out.println("Goodbye!");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
				}
			}
		}
	}
}
