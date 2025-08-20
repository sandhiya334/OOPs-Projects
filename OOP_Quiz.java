

import java.util.Scanner;

public class OOP_Quiz {

	String Prompt;
	String Answer;

	public OOP_Quiz(String queas, String ans) {
		this.Prompt = queas;
		this.Answer = ans;
	}

	public static void main(String args[]) {

		String Q1 = "A Copy Constructor is called "+ "\n (a) When an object is returned by value \n (b) When an object is passed by value as an argument \n (c) When compiler generates a temporary object \n (d) All the above ";

		String Q2 = "Encapsulation helps"+ "\n (a) information hidinh \n (b) in providing low coupling \n (c) in providing high couplinh \n (d) All the above ";

		String Q3 = "The keyword 'this' is used "+ "\n (a) As reference to currect objct \n (b) Explicit constructor invocation \n (c) In open recursion \n (d) All the above ";

		String Q4 = "Which java.lang contains only static methods "+ "\n (a) Math , System \n (b) Number, Exception \n (c) There is no such class \n (d) None  ";

		String Q5 = "Break statement in switch case "+ "\n (a)_Prevents from fallthrough \n (b) causes an exit from innermost loop \n (c) both a and b \n (d)_None ";

		OOP_Quiz[] quiz = { 
				new OOP_Quiz(Q1, "d"), 
				new OOP_Quiz(Q2, "d"), 
				new OOP_Quiz(Q3, "d"), 
				new OOP_Quiz(Q4, "a"),
				new OOP_Quiz(Q5, "c")

		};
		takeTest(quiz);
	}

	public static void takeTest(OOP_Quiz[] quiz) {
		int Score = 0;

		try (Scanner input = new Scanner(System.in)) {
			char Choice;
			do {

				for (int i = 0; i < quiz.length; i++) {
					System.out.print("\n " + (i + 1) + ".)" + quiz[i].Prompt + "\n \n  Answer : ");
					String Ans = input.nextLine();
					if (Ans.equalsIgnoreCase(quiz[i].Answer)) {
						Score++;
					}
				}

				System.out.println("\n \n \t \t YOUR SCORE : " + Score + "/" + quiz.length);

				if (Score == quiz.length) {
					System.out.println("\n \t Congradulation !!");
				} else if ((Score < quiz.length) && Score > (quiz.length / 2)) {
					System.out.println("\n \t Good Try Better luck next time !!");
				} else {
					System.out.println("\n \t Need to Practice more !!");
				}

				System.out.print("\n \t Do you want to take quice again  (y/n): ");
				Choice = input.next().charAt(0);
				input.nextLine();
			} 
			while (Choice == 'y' || Choice == 'Y');
			System.out.println("\n\t   \t GAME OVER !!...");
			input.close();
		}
	}
}

