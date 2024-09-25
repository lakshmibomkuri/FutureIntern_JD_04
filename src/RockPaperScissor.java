import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int num;
		
		String userChoice="";
		String computerChoice="";
		
		
		System.out.println("Welcome to the Rock Paper Scissor Game");
		System.out.print("Pleases choose R)ock,P)aper, or S)cissors. >");
		
		userChoice=sc.nextLine();
//		computer choice
		num=rand.nextInt(3);
		if(num==0) {
			computerChoice="R";
		}
		else if(num==1) {
			computerChoice="P";
		}
		else if(num==3) {
			computerChoice="S";
		}
		
		
		
//		print the computer choice
		
		if(computerChoice.equals("S")) {
			System.out.println("The computer chose scissor.");
		}
		else if(computerChoice.equals("R")) {
			System.out.println("The computer chose rock.");
		}
		else if(computerChoice.equals("P")) {
			System.out.println("The computer chose paper.");
		}
		
//		determine a winner
		if(userChoice.equals("R") && computerChoice.equals("S")) {
			System.out.println("You Won The Game!");
		}
		else if(userChoice.equals("P") && computerChoice.equals("R")) {
			System.out.println("You Won The Game!");
		}
		else if(userChoice.equals("S") && computerChoice.equals("P")) {
			System.out.println("You Won The Game!");
		}
		
		if(userChoice.equals("S") && computerChoice.equals("R")) {
			System.out.println("The computer Won The Game !");
		}
		else if(userChoice.equals("R") && computerChoice.equals("P")) {
			System.out.println("The computer Won The Game !");
		}
		else if(userChoice.equals("P") && computerChoice.equals("S")) {
			System.out.println("The computer Won The Game !");
		}
		else if(userChoice.equals(computerChoice)) {
			System.out.println("Tie !");
		}
		
	}

}
