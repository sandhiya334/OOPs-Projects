
import java.util.*;

abstract class FoodItems {
	String Name;
	double Price;

	public FoodItems(String Name, double Price) {
		this.Name = Name;
		this.Price = Price;
	}

	abstract void prepare();

	public String getName() {
		return Name;
	}

	public double getPrice() {
		return Price;
	}
}

class Pizza extends FoodItems {
	public Pizza() {
		super("Pizza", 9.4);
	}

	public void prepare() {
		System.out.println("\tPreparing " + Name + " with toppings and bakings !...");
	}
}

class Sandwich extends FoodItems {
	public Sandwich() {
		super("Sandwich", 5.9);
	}

	public void prepare() {
		System.out.println("\tPreparing " + Name + " with fresh vegitables and breads !...");
	}
}

class FrenchFries extends FoodItems {
	public FrenchFries() {
		super("French Fries", 7.9);
	}

	public void prepare() {
		System.out.println("\tPreparing " + Name + " with fresh potatos  and organic oil !...");
	}
}

class Ordering {
	private ArrayList<FoodItems> items = new ArrayList<>();

	public void AddItem(FoodItems item) {
		items.add(item);
		
		System.out.println(item.getName() + " added to order." );
	}

	public void ProcessItem() {
		System.out.println("\n\nProcessing Order !....");
		for (int i = 0; i < items.size(); i++) {
			FoodItems item = items.get(i);
			item.prepare();
		}
	}

	public double GetTotal() {
		double total = 0;
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getPrice();
		}
		return total;
	}
}

abstract class Payment {
	abstract void Pay(double Amt);
}

class Card extends Payment {
	public void Pay(double Amt) {
		System.out.println("Paid $ " + Amt + " in Card .");
	}
}

class UPI extends Payment {
	public void Pay(double Amt) {
		System.out.println("Paid $ " + Amt + " in UPI .");
	}
}

class Cash extends Payment {
	public void Pay(double Amt) {
		System.out.println("Paid $ " + Amt + " in Cash .");
	}
}

public class Online_food_Vending_System {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			Ordering order = new Ordering();

			while (true) {
				System.out.println("-----------------------------------");
				System.out.println("\n    Menu : " +
						"\n\t1) PIZZA  $9.4" +
						"\n\t2) SANDWICH  $5.9" + 
						"\n\t3) FRENCH FRIES  $7.9" + 
						"\n\t4) FINISH ORDER");
				System.out.print("\nEnter your choice :");
				int ch = sc.nextInt();
				if(ch == 4) break;
				
				FoodItems food = null;
				if (ch == 1) food = new Pizza();
				else if (ch == 2) food = new Sandwich();
				else if (ch == 3) food = new FrenchFries();
				else {
	                System.out.println("Invalid choice.");
	                continue;
	            }
				order.AddItem(food);
			}
				if (order.GetTotal() == 0){
					System.out.println("No Item Is IN Order , So Existing");
				}
				order.ProcessItem();
				
				System.out.println("\n\nTotal Cost Of An Order is = $ "+order.GetTotal());
				
				System.out.println("\n\n\tPayment Method  \n\t\t1)Card \n\t\t2)UPI \n\t\t3)Cash");
				System.out.print("Enter Your Payment Method : ");
				
				int PayCh = sc.nextInt();
				
				Payment Pay = null;
				if(PayCh == 1) Pay = new Card();
				else if (PayCh == 2) Pay = new UPI();
				else if (PayCh == 3) Pay = new Cash();
				else {
					System.out.println("Invalid Choice ");
					return;
				}
				Pay.Pay(order.GetTotal());
				System.out.println("Thank You for Visiting ...");
				}
			}
		}
	
