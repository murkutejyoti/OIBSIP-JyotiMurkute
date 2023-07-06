import java.util.*;
public class GessNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int computerNumber=(int)(Math.random()*100);
		int userNumber=0;
		
		System.out.println("Guess the number between 1 to 100 : ");
		
		do {
			System.out.println("Guess the number : ");
			userNumber=sc.nextInt();
			if(userNumber<1||userNumber>100) {
				System.out.println("Your guess is invalid");
			}
			else if(userNumber==computerNumber) {
				System.out.println("Wooh.. you guessed correct number");
				break;
			}
			else if(computerNumber+1==userNumber||computerNumber-1==userNumber) {
				System.out.println("You are too close");
			}
			else if(userNumber>computerNumber) {
				System.out.println("Your number is greater than my number");
			}
			else if(userNumber<computerNumber) {
				System.out.println("Your number is smaller than my number");
			}
			else {
				System.out.println("You guessed wrong number");
			}
		}while(userNumber>=0);
		System.out.println("Your number is : ");
		System.out.println(computerNumber);

	}

}
