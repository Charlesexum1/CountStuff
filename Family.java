import java.util.Scanner;
public class Family {
	public double income;
	public int size;
	
	public Family() {}
	
	public Family(double newIncome, int newSize) {
		income = newIncome;
		size = newSize;
		}
	public boolean isPoor(int houseCost, int foodCost) {
		if (((houseCost + (foodCost * size))) > (income / 2)) {
			return true;
			}
		else {
			return false;
			}	
		}
	public String toString() {
		return "Income: " + income + " size: " + size;
		}
	public void getInput() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Input family income.");
		income = keys.nextDouble();
		System.out.println("Input family size.");
		size = keys.nextInt();
		}			
	}
