import java.util.Scanner;

public class decisionMaking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run= true;
		do {
		
		System.out.println("Enter an integer between 1 and 100");
		int num = scan.nextInt();
		int exp = num%2;
		
		if(exp==1 & num<60) {
			System.out.println(num + " and Odd.");
		}
		if(exp==1 & num>=60) {
			System.out.println(num + " Odd and over 60.");
		}
		if(exp==0 & num>=2 & num<=25) {
			System.out.println("Even and less than 25.");
		}
		if(exp==0 & num>=26 & num<=60) {
			System.out.println("Even.");
		}
		if(exp==0 & num>60) {
			System.out.println(num + " and Even.");
		}
		System.out.println("Do you want change your number? y/n");
		scan.nextLine();
		String answ = scan.nextLine();
		
		if(answ.equalsIgnoreCase("n")) {
			run = false;
		}
		}while(run);
		scan.close();
		
	}

}
