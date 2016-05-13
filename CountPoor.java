import java.util.Scanner;

public class CountPoor {
	
	private Family[] family;
	private int familyCount;
	
	public void getData() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Input number of families");
		familyCount = keys.nextInt();		
		family = new Family[familyCount + 1];
		
		for (int x = 1; x <= familyCount; x++) {
			family[x] = new Family();
			System.out.println("Input data for family: " + x);
			family[x].getInput();
			}					
		}
	public void getPoorCount() {
		Scanner keys = new Scanner(System.in);
		int food, housing;
		System.out.println("Input average cost of food, and housing.");
		food = keys.nextInt();
		housing = keys.nextInt();
		
		for (int y = 1; y <= familyCount; y++) {
			if (family[y].isPoor(food, housing)) {
				System.out.println("Family number " + y + " is poor...");
				}
			}
		
		}	
	
	public static void main(String[] args) {
		CountPoor demo = new CountPoor();
		demo.getData();
		demo.getPoorCount();
		}
		
	
	}
