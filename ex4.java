import java.util.Random;
import java.util.Scanner;
public class DM4_1 {

public class DM4 
	public static void main(String[] args) {
		Random r = new Random();
		int ram;
		int cntH = 0, cntT = 0;
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.println("Who are you?");
		name = sc.next();
		System.out.println("Hello, "+name+"!");

		System.out.println("Tossing a coin ...");
		for(int i = 1; i <= 3; i ++) {
			ram = r.nextInt(2);
			switch (ram) {
			case 0:
				cntH ++;
				System.out.println("Round "+i+": Heads");
			break;

			case 1:
				cntT ++;
				System.out.println("Round "+i+": Tails");
			break;
			}
		}
		System.out.println("Heads: "+cntH+", Tails: "+cntT);
		if (cntH > cntT) System.out.println("You won!");
		else System.out.println("You lost...");
	}
