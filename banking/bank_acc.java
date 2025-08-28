class bank_acc {
	private int AccNo;
	private String AccHolder;
	private double AccBalance;

	public bank_acc(int AccNo, String AccHolder, double AccBalance) {
		this.AccNo = AccNo;
		this.AccHolder = AccHolder;
		this.AccBalance = AccBalance;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void Deposit(double Amt) {
		if (Amt > 0) {
			AccBalance += Amt;
			System.out.println("Successfully $" + Amt + " Deposited..");
		} else {
			System.out.println("Enter the Valid Input");
		}
	}

	public void Withdraw(double Amt) {
		if (Amt > 0 && Amt <= AccBalance) {
			AccBalance -= Amt;
			System.out.println("Withdraw  $" + Amt + " Successfully");
		} else if (Amt > AccBalance) {
			System.out.println(" Insuficiant Balance..");
		} else {
			System.out.println(" Invalid Input..");
		}
	}

	public void Display() {
		System.out.println(AccNo + " | " + AccHolder + " | " + AccBalance);
	}

}
