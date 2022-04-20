package solution;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Enter the number");
			int i1 = scan.nextInt();
			System.out.println("Here is your number :- ");
			System.out.println(i1);
		}while(i >= 0);
		System.out.println("THE END");

	}

}
