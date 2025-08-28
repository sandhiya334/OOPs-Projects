import java.util.Scanner;
import java.util.ArrayList;

public class bank_sys {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<bank_acc> acc = new ArrayList<>();
			int nextacc = 1001;
			while (true) {
				System.out.println("\n\nBanking..");
				System.out.println("\n1. Create Account\n2. Display \n3. Deposit \n4. Withdraw \n5. Exit");
				System.out.print("\nChoose: ");
				int ch = sc.nextInt();
				sc.nextLine();
				switch (ch) {
				case 1:
					System.out.println("\n\nBank Account Creation ");
					System.out.print("\nName : ");
					String name = sc.nextLine();
					System.out.print("Initial Amount To Deposit : ");
					double bal = sc.nextDouble();
					acc.add(new bank_acc(nextacc++, name, bal));
					System.out.println("\nAccount Createed");
					break;
				case 2:
					System.out.println("\n\nDisplay Accounts:");
					if (acc.isEmpty()) {
						System.out.println("No Account (EMPTY)");
					} else {
						for (int i = 0; i < acc.size(); i++) {
							bank_acc account = acc.get(i);
							account.Display();
						}
					}
					break;
				case 3:
					System.out.println("\n\nDeposits :");
					System.out.print("\nEnter Your Account Number : ");
					int DepAccNo = sc.nextInt();
					bank_acc depositAmt = null;
					for (int i = 0; i < acc.size(); i++) {
						if (acc.get(i).getAccNo() == DepAccNo) {
							depositAmt = acc.get(i);
							break;
						}
					}
					if (depositAmt != null) {
						System.out.print("Amount Need To Deposit : ");
						double amt = sc.nextDouble();
						depositAmt.Deposit(amt);
					} else {
						System.out.println("Account Not Found !..");
					}
					break;
				case 4:
					System.out.println("\n\nWithdrawal : ");
					System.out.print("\nAccount Number : ");
					int withAcc = sc.nextInt();
					bank_acc withdrawAcc = null;
					for (int i = 0; i < acc.size(); i++) {
						if (acc.get(i).getAccNo() == withAcc) {
							withdrawAcc = acc.get(i);
							break;
						}
					}
						if (withdrawAcc != null) {
							System.out.print("Enter Amount Need To Withdraw : ");
							double amt = sc.nextDouble();
							withdrawAcc.Withdraw(amt);
						}
						else {
							System.out.println("Account Not Fount");
						}
						break;
				case 5:
					System.out.print("\n\nBye Thank You For Visiting");
					sc.close();
					return;
				default:
					System.out.print("\n\nInvalid Input ");
				}
			}
		}
	}
}
