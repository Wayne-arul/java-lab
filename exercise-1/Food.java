import java.util.*;

public class Food{
	public static void main(String[] args){
		char choice;
		int quantity,val=0;
		Scanner s = new Scanner(System.in);
		System.out.println("B - Burger\nF - French Fries\nP - Pizza\nS - Sandwiches");
		choice = s.next().charAt(0);
		quantity = s.nextInt();
		
		switch(choice){
			case 'B':
				val=200;
				break;
			case 'F':
				val=50;
				break;
			case 'P':
				val=500;
				break;
			case 'S':
				val=150;
				break;
			default:
				System.out.println("Enter valid option!");
		}
		System.out.println("Total cost : " + val*quantity);
		
	}
}
